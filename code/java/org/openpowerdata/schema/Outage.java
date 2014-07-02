package org.openpowerdata.schema;

import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Outage {

	public String id;
	public DateTime startTime;
	public int metersAffected;
	public int originalMetersAffected;
	public DateTime ert;
	public String ertDescription;
	public ErtConfidenceType ertConfidence;
	public String comments;
	public CrewStatusType crewStatus;
	public Cause cause;
	public String utility;
	public String utilityDisclaimer;
	public DateTime timestamp;
	public float updateFrequencyDataExpiration;
	public String circuitFeederId;
	public OutageStatusType status;
	public OutageServiceType typeOfService;
	Collection<Point> points;
	Collection<Area> areas;
	CommunityDescriptor communityDescriptor;
	Collection<Polygon> polygons;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(DateTime startTime) {
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

	public DateTime getErt() {
		return ert;
	}

	public void setErt(DateTime ert) {
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

	public DateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(DateTime timestamp) {
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
}