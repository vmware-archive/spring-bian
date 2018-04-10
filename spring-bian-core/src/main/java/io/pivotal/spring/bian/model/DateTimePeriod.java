package io.pivotal.spring.bian.model;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTimePeriod {
	private Date fromDateTime;
	private Date toDateTime;
	private long numberOfDays;
	public DateTimePeriod(Date fromDateTime, Date toDateTime, int numberOfDays) {
		super();
		this.fromDateTime = fromDateTime;
		this.toDateTime = toDateTime;
		computeDays();
	}
	public void computeDays() {
		if (this.fromDateTime != null && this.toDateTime != null) {
			this.numberOfDays = TimeUnit.DAYS.convert(this.toDateTime.getTime() - this.fromDateTime.getTime(), TimeUnit.MILLISECONDS);
		}
	}
	public Date getFromDateTime() {
		return fromDateTime;
	}
	public void setFromDateTime(Date fromDateTime) {
		this.fromDateTime = fromDateTime;
		computeDays();
	}
	public Date getToDateTime() {
		return toDateTime;
	}
	public void setToDateTime(Date toDateTime) {
		this.toDateTime = toDateTime;
		computeDays();
	}
	public long getNumberOfDays() {
		return numberOfDays;
	}
}
