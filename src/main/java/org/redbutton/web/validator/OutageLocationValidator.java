package org.redbutton.web.validator;
import org.springframework.validation.Errors;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import java.lang.Object;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class OutageLocationValidator implements Validator
{

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public OutageLocationValidator(){
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public boolean supports(Class<?> classz) {
		return org.springframework.util.ClassUtils.isAssignable(classz, org.redbutton.domain.dto.OutageLocation.class);	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	public void validate(Object target, Errors errors) {
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"etrDescription","required");
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"status","required");
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"provider","required");
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"id","required");
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"id","required");
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"criticalCustomers","required");
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"crewStatus","required");
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"etrConfidence","required");
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"customersServed","required");
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"customersAffected","required");
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"id","required");
		org.springframework.validation.ValidationUtils.rejectIfEmpty(errors,"etr","required");	
	}
	
}

