package org.tain.ws;

import javax.jws.WebService;

@WebService(targetNamespace = "http://ws.tain.org/", portName = "WsTestServiceImplPort", serviceName = "WsTestServiceImplService")
public class WsTestServiceImpl implements WsTestService {

	@Override
	public String getMessage(String name) {
		String message = String.format("Hello, world!!! '%s'.", name);
		System.out.println(">>>>>" + message);
		return message;
	}

	public static void main(String[] args) {
		String ret = new WsTestServiceImpl().getMessage("Kang Seok");
		System.out.println(">>>>> " + ret);
	}
}
