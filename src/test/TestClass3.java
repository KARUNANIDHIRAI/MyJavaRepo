package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestClass3 {

	public static void main(String[] args) {
		System.out.println("----->startingg");
		String date="07-05-1994";
		
		DateFormat ddmmyyyy=new SimpleDateFormat();
		try {
			Date d=ddmmyyyy.parse(date);
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
