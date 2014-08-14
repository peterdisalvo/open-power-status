package org.openpowerdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Area {

	private String name;
    private AreaType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AreaType getType() {
        return type;
    }

    public void setType(AreaType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Area{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}