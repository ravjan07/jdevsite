package com.websystique.spring.service;

import org.joda.time.LocalDate;
import org.springframework.stereotype.Service;

@Service("dateService")
public class DateServiceImpl implements DateService{

	public LocalDate getNextAssessmentDate() {
		return new LocalDate(2015,10,10);
	}

}
