package org.openpowerdata.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collection;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OutageDocument {

	Collection<org.openpowerdata.schema.Outage> outages = new ArrayList();

	public Collection<org.openpowerdata.schema.Outage> getOutages() {
		return outages;
	}

	public void setOutages(Collection<org.openpowerdata.schema.Outage> outages) {
		this.outages = outages;
	}
}