
package org.tain.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tain.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetMessage_QNAME = new QName("http://ws.tain.org/", "getMessage");
    private final static QName _MainResponse_QNAME = new QName("http://ws.tain.org/", "mainResponse");
    private final static QName _Main_QNAME = new QName("http://ws.tain.org/", "main");
    private final static QName _GetMessageResponse_QNAME = new QName("http://ws.tain.org/", "getMessageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tain.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMessage }
     * 
     */
    public GetMessage createGetMessage() {
        return new GetMessage();
    }

    /**
     * Create an instance of {@link GetMessageResponse }
     * 
     */
    public GetMessageResponse createGetMessageResponse() {
        return new GetMessageResponse();
    }

    /**
     * Create an instance of {@link MainResponse }
     * 
     */
    public MainResponse createMainResponse() {
        return new MainResponse();
    }

    /**
     * Create an instance of {@link Main }
     * 
     */
    public Main createMain() {
        return new Main();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tain.org/", name = "getMessage")
    public JAXBElement<GetMessage> createGetMessage(GetMessage value) {
        return new JAXBElement<GetMessage>(_GetMessage_QNAME, GetMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MainResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tain.org/", name = "mainResponse")
    public JAXBElement<MainResponse> createMainResponse(MainResponse value) {
        return new JAXBElement<MainResponse>(_MainResponse_QNAME, MainResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Main }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tain.org/", name = "main")
    public JAXBElement<Main> createMain(Main value) {
        return new JAXBElement<Main>(_Main_QNAME, Main.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tain.org/", name = "getMessageResponse")
    public JAXBElement<GetMessageResponse> createGetMessageResponse(GetMessageResponse value) {
        return new JAXBElement<GetMessageResponse>(_GetMessageResponse_QNAME, GetMessageResponse.class, null, value);
    }

}
