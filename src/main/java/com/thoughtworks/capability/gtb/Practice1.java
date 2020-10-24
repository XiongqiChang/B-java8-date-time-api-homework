package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {

    LocalDate laborDate = date.of(date.getYear(), Month.MAY, 1);
    if (date.isAfter(laborDate)){
      laborDate = laborDate.plusYears(1L);
    }

   return ChronoUnit.DAYS.between(date, laborDate);
  }
}
