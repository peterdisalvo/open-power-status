package org.redbutton.domain.dto;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity@javax.persistence.Table(name = "DOCUMENTTABLE")
public class Document
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected Date creationDate;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	protected long frequency;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToOne(optional = true)
	protected Provider provider;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToMany(mappedBy = "document", cascade = javax.persistence.CascadeType.ALL)
	protected Set<OutageLocation> outageLocation;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToMany(mappedBy = "document", cascade = javax.persistence.CascadeType.ALL)
	protected Set<OutageArea> outageArea;
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
	public Document(){
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void basicSetProvider(Provider myProvider) {
		if (this.provider != myProvider) {
			if (myProvider != null){
				if (this.provider != myProvider) {
					Provider oldprovider = this.provider;
					this.provider = myProvider;
					if (oldprovider != null)
						oldprovider.unsetDocument();
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
	public Date getCreationDate() {
		return this.creationDate;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public long getFrequency() {
		return this.frequency;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Provider getProvider() {
		return this.provider;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<OutageLocation> getOutageLocation() {
		if(this.outageLocation == null) {
				this.outageLocation = new HashSet<OutageLocation>();
		}
		return (Set<OutageLocation>) this.outageLocation;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public Set<OutageArea> getOutageArea() {
		if(this.outageArea == null) {
				this.outageArea = new HashSet<OutageArea>();
		}
		return (Set<OutageArea>) this.outageArea;	
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
	public void addAllOutageLocation(Set<OutageLocation> newOutageLocation) {
		if (this.outageLocation == null) {
			this.outageLocation = new HashSet<OutageLocation>();
		}
		for (OutageLocation tmp : newOutageLocation)
			tmp.addDocument(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addAllOutageArea(Set<OutageArea> newOutageArea) {
		if (this.outageArea == null) {
			this.outageArea = new HashSet<OutageArea>();
		}
		for (OutageArea tmp : newOutageArea)
			tmp.addDocument(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllOutageLocation(Set<OutageLocation> newOutageLocation) {
		if(this.outageLocation == null) {
			return;
		}
		
		this.outageLocation.removeAll(newOutageLocation);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeAllOutageArea(Set<OutageArea> newOutageArea) {
		if(this.outageArea == null) {
			return;
		}
		
		this.outageArea.removeAll(newOutageArea);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setCreationDate(Date myCreationDate) {
		this.creationDate = myCreationDate;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setFrequency(long myFrequency) {
		this.frequency = myFrequency;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void setProvider(Provider myProvider) {
		this.basicSetProvider(myProvider);
		myProvider.basicSetDocument(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addOutageLocation(OutageLocation newOutageLocation) {
		if(this.outageLocation == null) {
			this.outageLocation = new HashSet<OutageLocation>();
		}
		
		if (this.outageLocation.add(newOutageLocation))
			newOutageLocation.addDocument(this);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void addOutageArea(OutageArea newOutageArea) {
		if(this.outageArea == null) {
			this.outageArea = new HashSet<OutageArea>();
		}
		
		if (this.outageArea.add(newOutageArea))
			newOutageArea.addDocument(this);	
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
	public void unsetCreationDate() {
		this.creationDate = new Date();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetFrequency() {
		this.frequency = 0L;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void unsetProvider() {
		if (this.provider == null)
			return;
		Provider oldprovider = this.provider;
		this.provider = null;
		oldprovider.unsetDocument();	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeOutageLocation(OutageLocation oldOutageLocation) {
		if(this.outageLocation == null)
			return;
		
		if (this.outageLocation.remove(oldOutageLocation))
			oldOutageLocation.removeDocument(this);
			
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void removeOutageArea(OutageArea oldOutageArea) {
		if(this.outageArea == null)
			return;
		
		if (this.outageArea.remove(oldOutageArea))
			oldOutageArea.removeDocument(this);
			
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

