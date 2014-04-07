package org.redbutton.domain.dto;
import java.util.Set;
import java.util.HashSet;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity
public class Area implements Location
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Column(name = "NAMECOLUMN")
	protected String name;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.Column(name = "TYPECOLUMN")
	protected AreaType type;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected int numberOfCrews;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToMany(mappedBy = "area")
	protected Set<OutageLocation> outage;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.ManyToOne
	protected Area parentRegion;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToMany(mappedBy = "parentRegion")
	protected Set<Area> childRegions;
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
	public Area(){
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetParentRegion(Area myParentRegion) {
		if (this.parentRegion != myParentRegion) {
			if (myParentRegion != null){
				if (this.parentRegion != myParentRegion) {
					Area oldparentRegion = this.parentRegion;
					this.parentRegion = myParentRegion;
					if (oldparentRegion != null)
						oldparentRegion.removeChildRegions(this);
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
	public String getName() {
		return this.name;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public AreaType getType() {
		return this.type;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public int getNumberOfCrews() {
		return this.numberOfCrews;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<OutageLocation> getOutage() {
		if(this.outage == null) {
				this.outage = new HashSet<OutageLocation>();
		}
		return (Set<OutageLocation>) this.outage;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Area getParentRegion() {
		return this.parentRegion;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<Area> getChildRegions() {
		if(this.childRegions == null) {
				this.childRegions = new HashSet<Area>();
		}
		return (Set<Area>) this.childRegions;	
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
	public void addAllOutage(Set<OutageLocation> newOutage) {
		if (this.outage == null) {
			this.outage = new HashSet<OutageLocation>();
		}
		for (OutageLocation tmp : newOutage)
			tmp.addArea(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllChildRegions(Set<Area> newChildRegions) {
		if (this.childRegions == null) {
			this.childRegions = new HashSet<Area>();
		}
		for (Area tmp : newChildRegions)
			tmp.setParentRegion(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllOutage(Set<OutageLocation> newOutage) {
		if(this.outage == null) {
			return;
		}
		
		this.outage.removeAll(newOutage);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllChildRegions(Set<Area> newChildRegions) {
		if(this.childRegions == null) {
			return;
		}
		
		this.childRegions.removeAll(newChildRegions);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setName(String myName) {
		this.name = myName;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setType(AreaType myType) {
		this.type = myType;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setNumberOfCrews(int myNumberOfCrews) {
		this.numberOfCrews = myNumberOfCrews;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addOutage(OutageLocation newOutage) {
		if(this.outage == null) {
			this.outage = new HashSet<OutageLocation>();
		}
		
		if (this.outage.add(newOutage))
			newOutage.addArea(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setParentRegion(Area myParentRegion) {
		this.basicSetParentRegion(myParentRegion);
		myParentRegion.addChildRegions(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addChildRegions(Area newChildRegions) {
		if(this.childRegions == null) {
			this.childRegions = new HashSet<Area>();
		}
		
		if (this.childRegions.add(newChildRegions))
			newChildRegions.basicSetParentRegion(this);	
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
	public void unsetName() {
		this.name = "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetType() {
		this.type = AreaType.STATE;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetNumberOfCrews() {
		this.numberOfCrews = 0;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeOutage(OutageLocation oldOutage) {
		if(this.outage == null)
			return;
		
		if (this.outage.remove(oldOutage))
			oldOutage.removeArea(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetParentRegion() {
		if (this.parentRegion == null)
			return;
		Area oldparentRegion = this.parentRegion;
		this.parentRegion = null;
		oldparentRegion.removeChildRegions(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeChildRegions(Area oldChildRegions) {
		if(this.childRegions == null)
			return;
		
		if (this.childRegions.remove(oldChildRegions))
			oldChildRegions.unsetParentRegion();
			
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

