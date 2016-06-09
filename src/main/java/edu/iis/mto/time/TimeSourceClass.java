package edu.iis.mto.time;

public class TimeSourceClass implements TimeSource {
	  
	  private static final long ONE_DAY_AND_HOUR = 26*60*60*1000;

	@Override
	public long currentTimeMilis() {
		// TODO Auto-generated method stub
		return System.currentTimeMillis() + ONE_DAY_AND_HOUR;
	}
}
