
package org.tain.ws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
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

public final class WsTestServiceImpl_WsTestServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://ws.tain.org/", "WsTestServiceImplService");

    private WsTestServiceImpl_WsTestServiceImplPort_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = WsTestServiceImplService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        WsTestServiceImplService ss = new WsTestServiceImplService(wsdlURL, SERVICE_NAME);
        WsTestServiceImpl port = ss.getWsTestServiceImplPort();  
        
        {
        System.out.println("Invoking getMessage...");
        java.lang.String _getMessage_arg0 = "_getMessage_arg0580021846";
        java.lang.String _getMessage__return = port.getMessage(_getMessage_arg0);
        System.out.println("getMessage.result=" + _getMessage__return);


        }

        System.exit(0);
    }

}
