package org.redbutton.domain.dto;
import java.util.Set;
import java.util.HashSet;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@javax.persistence.Entity
public class OutageArea extends Outage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	@javax.persistence.OneToMany(mappedBy = "outageArea")
	protected Set<Document> document;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public OutageArea(){
		
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
	public void addAllDocument(Set<Document> newDocument) {
		if (this.document == null) {
			this.document = new HashSet<Document>();
		}
		for (Document tmp : newDocument)
			tmp.addOutageArea(this);
			
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
	public void addDocument(Document newDocument) {
		if(this.document == null) {
			this.document = new HashSet<Document>();
		}
		
		if (this.document.add(newDocument))
			newDocument.addOutageArea(this);	
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
			oldDocument.removeOutageArea(this);
			
	}
	
}

