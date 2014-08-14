package org.openpowerdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Collection;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class OutageArea extends Outage {

	/**
	 * earliest reported outage time for this area
	 */
	private Date earliestReportedTime;
    private int metersServed;
    private Collection<Area> areas;

	public Date getEarliestReportedTime() {
		return earliestReportedTime;
	}

	public void setEarliestReportedTime(Date earliestReportedTime) {
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

    @Override
    public String toString() {
        return "OutageArea{" +
                "earliestReportedTime=" + earliestReportedTime +
                ", metersServed=" + metersServed +
                ", areas=" + areas +
                '}';
    }
}