package com.flight.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.demo.entity.FlightAirBus;
import com.flight.demo.entity.FlightDetail;
import com.flight.demo.entity.ScheduleTime;
import com.flight.demo.pojo.ApiResponse;
import com.flight.demo.pojo.FlightCommonDetail;
import com.flight.demo.pojo.FlightDetailPojo;
import com.flight.demo.repository.FlightAirBusRepo;
import com.flight.demo.repository.FlightDetailRepo;
import com.flight.demo.repository.ScheduleTimeRepo;

@RestController
public class FlightController {
	@Autowired
	public FlightDetailRepo flightdetailrepo;
	@Autowired
	public FlightAirBusRepo airBusrepo;

	@Autowired
	public ScheduleTimeRepo stRepo;

	@PostMapping(value = "/addflight")
	public ApiResponse flightdata(@RequestBody List<FlightDetailPojo> detail) {
		List<FlightDetail> flightDetailList = new ArrayList<>();

		ApiResponse apiResponse;
		if (detail.size() == 0) {
			System.out.println("please insert the data first");
			apiResponse = new ApiResponse("Success", false);
		} else {
			for (int i = 0; i < detail.size(); i++) {
				FlightDetail fd = new FlightDetail();
				fd.setFlightId(detail.get(i).getFlightId());
				fd.setFligthName(detail.get(i).getFlightName());

				flightDetailList.add(fd);
			}
			flightdetailrepo.saveAll(flightDetailList);
			apiResponse = new ApiResponse("Success", true);
		}
		return apiResponse;
	}

	@PostMapping("/addAirBus")
	public ApiResponse getFlightNo(@RequestBody FlightDetailPojo data) {
		Optional<FlightDetail> fdr = flightdetailrepo.findByFlightId(data.getFlightId());
		ApiResponse apiResponse;
		if (fdr.isPresent()) {
			FlightAirBus fab = new FlightAirBus();
			fab.setFlightId(data.getFlightId());
			fab.setFlightNumber(data.getFlightNumber());
			airBusrepo.save(fab);

			apiResponse = new ApiResponse();
			apiResponse.setData(fab);
			apiResponse.setValid(true);

		} else {
			System.out.println("Data not exist");
			apiResponse = new ApiResponse();
			apiResponse.setData("Data not exist");
			apiResponse.setValid(false);
		}

		return apiResponse;

	}

	@PostMapping("/addSchedule")
	public ApiResponse getSchedule(@RequestBody FlightCommonDetail data) {
		Optional<FlightAirBus> fABus = airBusrepo.findByFlightId(data.getFlightId());

		ApiResponse apiResponse;
		if (fABus.isPresent()) {
			ScheduleTime ScTime = new ScheduleTime();
			ScTime.setFligthName(data.getFlightName());
			ScTime.setFlightNumber(data.getFlightNumber());
			ScTime.setDepart(data.getDepart());
			ScTime.setArrival(data.getArrival());

			stRepo.save(ScTime);

			apiResponse = new ApiResponse();
			apiResponse.setData(ScTime);
			apiResponse.setValid(true);

		} else {
			System.out.println("Data not exist");
			apiResponse = new ApiResponse();
			apiResponse.setData("Data not exist");
			apiResponse.setValid(false);

		}

		return apiResponse;

	}

}
