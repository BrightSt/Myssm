package com.dms.myssm.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;


public class DateConvert implements Converter<String, Date>{

	@Override
	public Date convert(String stringDate) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return simpleDateFormat.parse(stringDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
