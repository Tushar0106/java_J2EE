package com.billing.mgmt.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Utility {
	public static java.sql.Date getCurrentDateTime() {
		/*
		 * DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		 * 
		 * LocalDateTime now = LocalDateTime.now(); System.out.println(dtf.format(now));
		 * 
		 * DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); Date dateobj =
		 * new Date(); System.out.println(df.format(dateobj));
		 * 
		 * return df.format(dateobj);
		 */
		
        long millis=System.currentTimeMillis();  
        java.sql.Date date=new java.sql.Date(millis);  
        System.out.println(date);  
        return date;
	}
}
