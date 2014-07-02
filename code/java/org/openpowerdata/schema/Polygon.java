package org.openpowerdata.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Polygon {

	private Collection<Coordinate> coordinates = new ArrayList();

	public Collection<Coordinate> getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Collection<Coordinate> coordinates) {
		this.coordinates = coordinates;
	}
}