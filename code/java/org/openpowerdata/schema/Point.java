package org.openpowerdata.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Point {

	Coordinate coordinate;

	public Point(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public Point(float x, float y) {
		this.coordinate = new Coordinate(x,y);
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
}