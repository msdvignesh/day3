package code;

import java.time.LocalDate;

public class Log {
	

	private String logType;
	private String name;
	private LocalDate date;

	public Log() {
		
		
		
	}

	public Log(String logType, String name, LocalDate date) {
		super();
		this.logType = logType;
		this.name = name;
		this.date = date;
	}

}
