package com.flight.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.demo.entity.ScheduleTime;
@Repository
public interface ScheduleTimeRepo extends JpaRepository<ScheduleTime,String > {
	

}
