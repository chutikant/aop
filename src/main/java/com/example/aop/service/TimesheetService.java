package com.example.aop.service;

import com.example.aop.model.Timesheet;
import com.example.aop.repository.TimesheetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TimesheetService {
  private final TimesheetRepository timesheetRepository;

  public Timesheet save(Timesheet timesheet) {
    return timesheetRepository.save(timesheet);
  }
}
