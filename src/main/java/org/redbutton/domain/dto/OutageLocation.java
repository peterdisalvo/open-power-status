package org.redbutton.domain.dto;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity
public class OutageLocation extends Outage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Column(name = "IDCOLUMN")
	protected String id;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected Status status;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected boolean criticalCustomers;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected Date etr;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected String etrDescription;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected EtrConfidence etrConfidence;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected CrewStatus crewStatus;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToOne(optional = true, cascade = javax.persistence.CascadeType.ALL)
	protected Polygon polygon;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToMany(mappedBy = "outage")
	protected Set<Area> area;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToOne(optional = true, cascade = javax.persistence.CascadeType.ALL)
	protected Point point;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToMany(mappedBy = "outageLocation")
	protected Set<Document> document;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToOne(optional = true, cascade = javax.persistence.CascadeType.ALL)
	protected LocationDescription locationDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public OutageLocation(){
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetPolygon(Polygon myPolygon) {
		if (this.polygon != myPolygon) {
			if (myPolygon != null){
				if (this.polygon != myPolygon) {
					Polygon oldpolygon = this.polygon;
					this.polygon = myPolygon;
					if (oldpolygon != null)
						oldpolygon.unsetOutage();
				}
			}
		}	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetPoint(Point myPoint) {
		if (this.point != myPoint) {
			if (myPoint != null){
				if (this.point != myPoint) {
					Point oldpoint = this.point;
					this.point = myPoint;
					if (oldpoint != null)
						oldpoint.unsetOutage();
				}
			}
		}	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetLocationDescription(LocationDescription myLocationDescription) {
		if (this.locationDescription != myLocationDescription) {
			if (myLocationDescription != null){
				if (this.locationDescription != myLocationDescription) {
					LocationDescription oldlocationDescription = this.locationDescription;
					this.locationDescription = myLocationDescription;
					if (oldlocationDescription != null)
						oldlocationDescription.unsetOutage();
				}
			}
		}	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getId() {
		return this.id;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Status getStatus() {
		return this.status;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public boolean isCriticalCustomers() {
		return this.criticalCustomers;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Date getEtr() {
		return this.etr;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public String getEtrDescription() {
		return this.etrDescription;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public EtrConfidence getEtrConfidence() {
		return this.etrConfidence;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public CrewStatus getCrewStatus() {
		return this.crewStatus;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Polygon getPolygon() {
		return this.polygon;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Area> getArea() {
		if(this.area == null) {
				this.area = new HashSet<Area>();
		}
		return (Set<Area>) this.area;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Point getPoint() {
		return this.point;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Document> getDocument() {
		if(this.document == null) {
				this.document = new HashSet<Document>();
		}
		return (Set<Document>) this.document;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public LocationDescription getLocationDescription() {
		return this.locationDescription;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllArea(Set<Area> newArea) {
		if (this.area == null) {
			this.area = new HashSet<Area>();
		}
		for (Area tmp : newArea)
			tmp.addOutage(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllDocument(Set<Document> newDocument) {
		if (this.document == null) {
			this.document = new HashSet<Document>();
		}
		for (Document tmp : newDocument)
			tmp.addOutageLocation(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllArea(Set<Area> newArea) {
		if(this.area == null) {
			return;
		}
		
		this.area.removeAll(newArea);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllDocument(Set<Document> newDocument) {
		if(this.document == null) {
			return;
		}
		
		this.document.removeAll(newDocument);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setId(String myId) {
		this.id = myId;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setStatus(Status myStatus) {
		this.status = myStatus;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setCriticalCustomers(boolean myCriticalCustomers) {
		this.criticalCustomers = myCriticalCustomers;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setEtr(Date myEtr) {
		this.etr = myEtr;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setEtrDescription(String myEtrDescription) {
		this.etrDescription = myEtrDescription;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setEtrConfidence(EtrConfidence myEtrConfidence) {
		this.etrConfidence = myEtrConfidence;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setCrewStatus(CrewStatus myCrewStatus) {
		this.crewStatus = myCrewStatus;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setPolygon(Polygon myPolygon) {
		this.basicSetPolygon(myPolygon);
		myPolygon.basicSetOutage(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addArea(Area newArea) {
		if(this.area == null) {
			this.area = new HashSet<Area>();
		}
		
		if (this.area.add(newArea))
			newArea.addOutage(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setPoint(Point myPoint) {
		this.basicSetPoint(myPoint);
		myPoint.basicSetOutage(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addDocument(Document newDocument) {
		if(this.document == null) {
			this.document = new HashSet<Document>();
		}
		
		if (this.document.add(newDocument))
			newDocument.addOutageLocation(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setLocationDescription(LocationDescription myLocationDescription) {
		this.basicSetLocationDescription(myLocationDescription);
		myLocationDescription.basicSetOutage(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetId() {
		this.id = "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetStatus() {
		this.status = Status.UNVERIFIED;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetCriticalCustomers() {
		this.criticalCustomers = false;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetEtr() {
		this.etr = new Date();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetEtrDescription() {
		this.etrDescription = "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetEtrConfidence() {
		this.etrConfidence = EtrConfidence.HIGH;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetCrewStatus() {
		this.crewStatus = CrewStatus.ASSIGNED;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetPolygon() {
		if (this.polygon == null)
			return;
		Polygon oldpolygon = this.polygon;
		this.polygon = null;
		oldpolygon.unsetOutage();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeArea(Area oldArea) {
		if(this.area == null)
			return;
		
		if (this.area.remove(oldArea))
			oldArea.removeOutage(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetPoint() {
		if (this.point == null)
			return;
		Point oldpoint = this.point;
		this.point = null;
		oldpoint.unsetOutage();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeDocument(Document oldDocument) {
		if(this.document == null)
			return;
		
		if (this.document.remove(oldDocument))
			oldDocument.removeOutageLocation(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetLocationDescription() {
		if (this.locationDescription == null)
			return;
		LocationDescription oldlocationDescription = this.locationDescription;
		this.locationDescription = null;
		oldlocationDescription.unsetOutage();	
	}
	
}

