package com.example.aop.repository;

import com.example.aop.model.Timesheet;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimesheetRepository extends MongoRepository<Timesheet , String> {
  Timesheet save(Timesheet timesheet);
}
