import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.stage.Stage;

public class TestDate extends javafx.application.Application{
	public static void main(String[] args) {
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

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
