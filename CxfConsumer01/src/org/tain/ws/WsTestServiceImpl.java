package org.tain.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.2.7
 * Fri Sep 21 17:20:28 KST 2018
 * Generated source version: 2.2.7
 * 
 */
 
@WebService(targetNamespace = "http://ws.tain.org/", name = "WsTestServiceImpl")
@XmlSeeAlso({ObjectFactory.class})
public interface WsTestServiceImpl {

    @WebMethod
    @RequestWrapper(localName = "getMessage", targetNamespace = "http://ws.tain.org/", className = "org.tain.ws.GetMessage")
    @ResponseWrapper(localName = "getMessageResponse", targetNamespace = "http://ws.tain.org/", className = "org.tain.ws.GetMessageResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String getMessage(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "main", targetNamespace = "http://ws.tain.org/", className = "org.tain.ws.Main")
    @ResponseWrapper(localName = "mainResponse", targetNamespace = "http://ws.tain.org/", className = "org.tain.ws.MainResponse")
    public void main(
        @WebParam(name = "arg0", targetNamespace = "")
        java.util.List<java.lang.String> arg0
    );
}