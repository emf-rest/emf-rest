/**
 */
package Example.impl;

import Example.ExamplePackage;
import Example.RaceDog;

import Example.ref.RaceDogRef;

import com.sun.xml.internal.bind.CycleRecoverable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.eclipse.emf.ecore.EClass;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Race Dog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlRootElement (name="racedog")
@XmlSeeAlso ({RaceDogRef.class,
Wrapper.class
})
public  class RaceDogImpl extends DogImpl implements RaceDog,CycleRecoverable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RaceDogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExamplePackage.Literals.RACE_DOG;
	}

@Override
	public Object onCycleDetected(Context arg0) {
		RaceDogRef  ref = new RaceDogRef();
		
		 ref.name=name;
		
		 ref.breed=breed;
		
		
		return ref;
		}
	
} //RaceDogImpl
