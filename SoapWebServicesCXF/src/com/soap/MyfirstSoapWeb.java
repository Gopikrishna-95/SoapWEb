/**
 * 
 */
package com.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @author Gopi Krishna
 *
 */
@WebService(serviceName = "MyfirstSoapWebService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class MyfirstSoapWeb {
	
	@WebMethod(operationName="addMember")
public int addMember(int a,int b) {
	return a+b;
	
}
	@WebMethod(operationName="getMember")
public int getMember(int a,int b) {
	return a+b;
	
}
	
	@WebMethod(operationName="bigbang")
	public String bigbang(String a,String b) {
		return a+" "+b;
		
	}
	
	@WebMethod(operationName="bigbang5")
	public String bigbang5(String a,String b) {
		return a+" "+b;
		
	}
}
