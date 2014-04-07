package org.redbutton.domain.dto;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity
public class Point implements Location
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToOne(optional = false)
	protected OutageLocation outage;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToOne(optional = false, cascade = javax.persistence.CascadeType.ALL)
	protected Coordinate coordinate;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Id@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
	protected Long id;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Point(){
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetOutage(OutageLocation myOutage) {
		if (this.outage != myOutage) {
			if (myOutage != null){
				if (this.outage != myOutage) {
					OutageLocation oldoutage = this.outage;
					this.outage = myOutage;
					if (oldoutage != null)
						oldoutage.unsetPoint();
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
	public void basicSetCoordinate(Coordinate myCoordinate) {
		if (this.coordinate != myCoordinate) {
			if (myCoordinate != null){
				if (this.coordinate != myCoordinate) {
					Coordinate oldcoordinate = this.coordinate;
					this.coordinate = myCoordinate;
					if (oldcoordinate != null)
						oldcoordinate.unsetPoint();
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
	public OutageLocation getOutage() {
		return this.outage;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Coordinate getCoordinate() {
		return this.coordinate;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public long getId() {
		return this.id;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setOutage(OutageLocation myOutage) {
		this.basicSetOutage(myOutage);
		myOutage.basicSetPoint(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setCoordinate(Coordinate myCoordinate) {
		this.basicSetCoordinate(myCoordinate);
		myCoordinate.basicSetPoint(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setId(long myId) {
		this.id = myId;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetOutage() {
		if (this.outage == null)
			return;
		OutageLocation oldoutage = this.outage;
		this.outage = null;
		oldoutage.unsetPoint();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetCoordinate() {
		if (this.coordinate == null)
			return;
		Coordinate oldcoordinate = this.coordinate;
		this.coordinate = null;
		oldcoordinate.unsetPoint();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetId() {
		this.id = 0L;	
	}
	
}

