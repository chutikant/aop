package com.example.aop.dto;

import java.time.Instant;
import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class TimesheetDto {
  private Integer employeeId;
  private Instant timein;
  private Instant timeout;
  private Date date;
}
