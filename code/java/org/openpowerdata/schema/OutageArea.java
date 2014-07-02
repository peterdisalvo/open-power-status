package org.openpowerdata.schema;

import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class OutageArea extends Outage {

	/**
	 * earliest reported outage time for this area
	 */
	public DateTime earliestReportedTime;
	public int metersServed;
	Collection<Area> areas;

	public DateTime getEarliestReportedTime() {
		return earliestReportedTime;
	}

	public void setEarliestReportedTime(DateTime earliestReportedTime) {
		this.earliestReportedTime = earliestReportedTime;
	}

	public int getMetersServed() {
		return metersServed;
	}

	public void setMetersServed(int metersServed) {
		this.metersServed = metersServed;
	}

	public Collection<Area> getAreas() {
		return areas;
	}

	public void setAreas(Collection<Area> areas) {
		this.areas = areas;
	}
}