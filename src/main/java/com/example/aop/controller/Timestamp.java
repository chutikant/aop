package com.example.aop.controller;

import com.example.aop.dto.TimesheetDto;
import com.example.aop.model.Employee;
import com.example.aop.model.Timesheet;
import com.example.aop.service.TimesheetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/timestamp")
public class Timestamp {

  private final TimesheetService timesheetService;

  @PostMapping("/record")
  public Timesheet record(@RequestBody TimesheetDto timesheetDto) {
    log.info("Enter to record method");
    Timesheet timesheet = Timesheet.builder()
        .employeeId(timesheetDto.getEmployeeId())
        .timein(timesheetDto.getTimein())
        .timeout(timesheetDto.getTimeout())
        .date(timesheetDto.getDate())
        .build();
    return timesheetService.save(timesheet);
  }
}
