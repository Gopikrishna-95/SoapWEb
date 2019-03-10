package com.soap;

import java.io.Reader;
import java.io.StringReader;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

@WebService(serviceName = "EmployeeDetailsWS")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class EmployeeDetailsWS {
	
	
	
	@WebMethod(operationName="getEmpDetails")
	public Employee addMember(int a,int b) {
		
		Employee emp=new Employee();
		
		emp.setEmpId(123);
		emp.setEmpName("Raveendra");
		emp.setSalary((double) 50000);
		
		return emp;
		
	}
	
	@WebMethod(operationName="getXmlElement")
	public Employee getXmlElement(String xmlObj) {
		
		Employee emp=new Employee();
		Employee emp1=null;
		emp.setEmpId(123);
		emp.setEmpName("Raveendra");
		emp.setSalary((double) 50000);
		try {
			 JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			 Unmarshaller unmarshaller = jaxbContext.createUnmarshaller(); 
			 Reader reader = new StringReader(xmlObj);
			 emp1 = (Employee) unmarshaller.unmarshal(reader);
			 emp1.setEmpName("eewtewyyewyewyeyew");
		} catch (Exception e) {
			
		}
		return emp1;
		
	}

}
