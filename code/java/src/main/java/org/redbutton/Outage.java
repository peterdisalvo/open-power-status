package org.redbutton;

import org.joda.time.DateTime;

import java.util.List;

public class Outage {
	private int customersAffected;
	private int customersServed;
	private int count;
	private DateTime etr;
	private List<County> counties;
	private List<Zipcode> zipcodes;
	private Point point;
	private Polygon polygon;
}
