package org.redbutton.domain.dto;
import java.util.LinkedList;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity
public class Polygon implements Location
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
	@javax.persistence.OneToMany(mappedBy = "polygon", cascade = javax.persistence.CascadeType.ALL)
	protected List<Coordinate> coordinates;
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
	public Polygon(){
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicRemoveCoordinates(Coordinate oldCoordinates) {
		if(this.coordinates == null)
			return;
		
		while (this.coordinates.contains(oldCoordinates))
			this.coordinates.remove(oldCoordinates);	
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
						oldoutage.unsetPolygon();
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
	public void basicAddCoordinates(Coordinate newCoordinates) {
		if(this.coordinates == null) {
			this.coordinates = new LinkedList<Coordinate>();
		}
			
		this.coordinates.add(newCoordinates);	
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
	public List<Coordinate> getCoordinates() {
		if(this.coordinates == null) {
				this.coordinates = new LinkedList<Coordinate>();
		}
		return (List<Coordinate>) this.coordinates;	
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
	public void addAllCoordinates(List<Coordinate> newCoordinates) {
		if (this.coordinates == null) {
			this.coordinates = new LinkedList<Coordinate>();
		}
		for (Coordinate tmp : newCoordinates)
			tmp.setPolygon(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllCoordinates(List<Coordinate> newCoordinates) {
		if(this.coordinates == null) {
			return;
		}
		
		this.coordinates.removeAll(newCoordinates);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setOutage(OutageLocation myOutage) {
		this.basicSetOutage(myOutage);
		myOutage.basicSetPolygon(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addCoordinates(Coordinate newCoordinates) {
		this.basicAddCoordinates(newCoordinates);
		newCoordinates.basicSetPolygon(this);	
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
		oldoutage.unsetPolygon();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeCoordinates(Coordinate oldCoordinates) {
		this.basicRemoveCoordinates(oldCoordinates);
		oldCoordinates.unsetPolygon();	
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

