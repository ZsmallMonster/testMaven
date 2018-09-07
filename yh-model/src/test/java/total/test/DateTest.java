package total.test;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * <p>字符串转化日期格式
 * 
 * @author Administrator
 *
 */
public class DateTest {

	/**
	 * <p>(yyyy-mm-DD  hh:mm:ss)
	 * @throws ParseException 
	 */
	/*public static Date getNowDate() throws ParseException {
		
		Date nowDate = new Date();
		SimpleDateFormat formatter = 
				new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dateString = formatter.format(nowDate); 
		ParsePosition poos = new ParsePosition(8);
		Date dateTime = formatter.parse(dateString);
		return dateTime;
	}
	public static void main(String[] args) throws ParseException {
		DateTest test = new DateTest();
		test.getNowDate();
	}*/
	
	public static void main(String[] args) {
		String s = "2018-09-09";
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date t = f.parse(s);
			System.out.println(t.getClass());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
