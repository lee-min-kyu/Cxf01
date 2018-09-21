package org.tain.client;

import java.net.URL;

import javax.xml.namespace.QName;

import org.tain.ws.WsTestServiceImpl;
import org.tain.ws.WsTestServiceImplService;

public class WsTestClient {

    private static final QName SERVICE_NAME = new QName("http://ws.tain.org/", "WsTestServiceImplService");
    private static final URL wsdlURL = WsTestServiceImplService.WSDL_LOCATION;

    public static void main(String[] args) {

        WsTestServiceImplService ss = new WsTestServiceImplService(wsdlURL, SERVICE_NAME);
        WsTestServiceImpl port = ss.getWsTestServiceImplPort();

        {
	        String ret = port.getMessage("Kang Seok");
	        System.out.println("getMessage.result = " + ret);
        }
    }
}
