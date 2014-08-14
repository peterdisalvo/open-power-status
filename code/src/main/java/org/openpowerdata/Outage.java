package org.openpowerdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Collection;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class Outage {

    private String id;
    private Date startTime;
    private int metersAffected;
    private int originalMetersAffected;
    private Date ert;
    private String ertDescription;
    private ErtConfidenceType ertConfidence;
    private String comments;
    private CrewStatusType crewStatus;
    private Cause cause;
    private String utility;
    private String utilityDisclaimer;
    private Date timestamp;
    private float updateFrequencyDataExpiration;
    private String circuitFeederId;
    private OutageStatusType status;
    private OutageServiceType typeOfService;
    private Collection<Point> points;
    private Collection<Area> areas;
    private CommunityDescriptor communityDescriptor;
    private Collection<Polygon> polygons;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public int getMetersAffected() {
		return metersAffected;
	}

	public void setMetersAffected(int metersAffected) {
		this.metersAffected = metersAffected;
	}

	public int getOriginalMetersAffected() {
		return originalMetersAffected;
	}

	public void setOriginalMetersAffected(int originalMetersAffected) {
		this.originalMetersAffected = originalMetersAffected;
	}

	public Date getErt() {
		return ert;
	}

	public void setErt(Date ert) {
		this.ert = ert;
	}

	public String getErtDescription() {
		return ertDescription;
	}

	public void setErtDescription(String ertDescription) {
		this.ertDescription = ertDescription;
	}

	public ErtConfidenceType getErtConfidence() {
		return ertConfidence;
	}

	public void setErtConfidence(ErtConfidenceType ertConfidence) {
		this.ertConfidence = ertConfidence;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public CrewStatusType getCrewStatus() {
		return crewStatus;
	}

	public void setCrewStatus(CrewStatusType crewStatus) {
		this.crewStatus = crewStatus;
	}

	public Cause getCause() {
		return cause;
	}

	public void setCause(Cause cause) {
		this.cause = cause;
	}

	public String getUtility() {
		return utility;
	}

	public void setUtility(String utility) {
		this.utility = utility;
	}

	public String getUtilityDisclaimer() {
		return utilityDisclaimer;
	}

	public void setUtilityDisclaimer(String utilityDisclaimer) {
		this.utilityDisclaimer = utilityDisclaimer;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public float getUpdateFrequencyDataExpiration() {
		return updateFrequencyDataExpiration;
	}

	public void setUpdateFrequencyDataExpiration(float updateFrequencyDataExpiration) {
		this.updateFrequencyDataExpiration = updateFrequencyDataExpiration;
	}

	public String getCircuitFeederId() {
		return circuitFeederId;
	}

	public void setCircuitFeederId(String circuitFeederId) {
		this.circuitFeederId = circuitFeederId;
	}

	public OutageStatusType getStatus() {
		return status;
	}

	public void setStatus(OutageStatusType status) {
		this.status = status;
	}

	public OutageServiceType getTypeOfService() {
		return typeOfService;
	}

	public void setTypeOfService(OutageServiceType typeOfService) {
		this.typeOfService = typeOfService;
	}

    public Collection<Point> getPoints() {
        return points;
    }

    public void setPoints(Collection<Point> points) {
        this.points = points;
    }

    public Collection<Area> getAreas() {
        return areas;
    }

    public void setAreas(Collection<Area> areas) {
        this.areas = areas;
    }

    public CommunityDescriptor getCommunityDescriptor() {
        return communityDescriptor;
    }

    public void setCommunityDescriptor(CommunityDescriptor communityDescriptor) {
        this.communityDescriptor = communityDescriptor;
    }

    public Collection<Polygon> getPolygons() {
        return polygons;
    }

    public void setPolygons(Collection<Polygon> polygons) {
        this.polygons = polygons;
    }

    @Override
    public String toString() {
        return "Outage{" +
                "id='" + id + '\'' +
                ", startTime=" + startTime +
                ", metersAffected=" + metersAffected +
                ", originalMetersAffected=" + originalMetersAffected +
                ", ert=" + ert +
                ", ertDescription='" + ertDescription + '\'' +
                ", ertConfidence=" + ertConfidence +
                ", comments='" + comments + '\'' +
                ", crewStatus=" + crewStatus +
                ", cause=" + cause +
                ", utility='" + utility + '\'' +
                ", utilityDisclaimer='" + utilityDisclaimer + '\'' +
                ", timestamp=" + timestamp +
                ", updateFrequencyDataExpiration=" + updateFrequencyDataExpiration +
                ", circuitFeederId='" + circuitFeederId + '\'' +
                ", status=" + status +
                ", typeOfService=" + typeOfService +
                ", points=" + points +
                ", areas=" + areas +
                ", communityDescriptor=" + communityDescriptor +
                ", polygons=" + polygons +
                '}';
    }
}