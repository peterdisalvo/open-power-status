package org.openpowerdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collection;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OutageDocument {

    private Collection<Outage> outages = new ArrayList();

    private Collection<Outage> getOutages() {
		return outages;
	}

    private void setOutages(Collection<Outage> outages) {
		this.outages = outages;
	}

    @Override
    public String toString() {
        return "OutageDocument{" +
                "outages=" + outages +
                '}';
    }
}