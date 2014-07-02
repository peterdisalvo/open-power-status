package org.openpowerdata.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class OutageLocation extends Outage {

	CommunityDescriptor communityDescriptor;
	Point point;
	Polygon polygon;

	public CommunityDescriptor getCommunityDescriptor() {
		return communityDescriptor;
	}

	public void setCommunityDescriptor(CommunityDescriptor communityDescriptor) {
		this.communityDescriptor = communityDescriptor;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Polygon getPolygon() {
		return polygon;
	}

	public void setPolygon(Polygon polygon) {
		this.polygon = polygon;
	}
}