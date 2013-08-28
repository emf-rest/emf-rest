


package webmapi.service.container;

import java.util.List;

public class EClassifierContainer {

	private List<org.eclipse.emf.ecore.EClass> eClassList;
	private List<org.eclipse.emf.ecore.EDataType> eDataTypeList;
	private List<org.eclipse.emf.ecore.EEnum> eEnumList;

public EClassifierContainer(){
}

public EClassifierContainer(
List<org.eclipse.emf.ecore.EClass> eClassList  
 
 , List<org.eclipse.emf.ecore.EDataType> eDataTypeList  
 
 , List<org.eclipse.emf.ecore.EEnum> eEnumList  
 
) {

	this.eClassList = eClassList;
	this.eDataTypeList = eDataTypeList;
	this.eEnumList = eEnumList;
}


public List<org.eclipse.emf.ecore.EClass> getEClass() {
    return eClassList;
}

public void setEClass(List<org.eclipse.emf.ecore.EClass> eClassList) {
    this.eClassList = eClassList;
}


public List<org.eclipse.emf.ecore.EDataType> getEDataType() {
    return eDataTypeList;
}

public void setEDataType(List<org.eclipse.emf.ecore.EDataType> eDataTypeList) {
    this.eDataTypeList = eDataTypeList;
}


public List<org.eclipse.emf.ecore.EEnum> getEEnum() {
    return eEnumList;
}

public void setEEnum(List<org.eclipse.emf.ecore.EEnum> eEnumList) {
    this.eEnumList = eEnumList;
}


}