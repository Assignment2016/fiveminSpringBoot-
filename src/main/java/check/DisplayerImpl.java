package check;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Component;

@Component
public class DisplayerImpl implements IDisplayer {

	public String getInfo() {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date today=Calendar.getInstance(Locale.FRANCE).getTime();
		return "Spring boot in action: "+sdf.format(today) +"!!!";
		
		
	}
	
	

}
