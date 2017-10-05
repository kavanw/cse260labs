import java.util.Calendar;

public class Time {
	private int hour, minute, second;
	public Time() {
		Calendar cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
		second = cal.get(Calendar.SECOND);
	}
	public Time(int elapseTime)
	{
		hour = 12;
		minute = 0;
		second = 0;
		this.setTime(elapseTime);
	}
	public Time(int hour, int minute, int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public int getSecond()
	{
		return second;
	}
	
	public void setTime(long elapseTime)
	{
		int totalSeconds = (int) (elapseTime/1000);
		second =totalSeconds%60;
		int totalMinutes = totalSeconds/60;
		minute = totalMinutes%60;
		int totalHours = totalMinutes/60;
		hour = totalHours%24;
	}
	
	public String toString()
	{
		String hourInString = "" + hour, minuteInString = "" + minute, secondInString = "" + second;
		if(hour<10)
			hourInString = "0" + hour;
		if(minute<10)
			minuteInString = "0" + minute;
		if(second<10)
			secondInString = "0" + second;
		return hourInString + ":" + minuteInString + ":" + secondInString;
	}

}
