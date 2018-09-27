package com.appleyk.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String dateTostring(Date date) {

		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		return format.format(date);
	}

}
