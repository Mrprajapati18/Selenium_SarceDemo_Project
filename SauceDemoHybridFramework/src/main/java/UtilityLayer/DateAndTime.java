package UtilityLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import BaseLayer.BaseClass;

public class DateAndTime extends BaseClass {

	public static String captureCurrentYear()
	{
		return new SimpleDateFormat("yyyy").format(new Date());
	}
	public static String captureMonthAndYear()
	{
		return new SimpleDateFormat("MMyyyy").format(new Date());
	}
	public static String captureDateAndTime()
	{
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	}
	}
