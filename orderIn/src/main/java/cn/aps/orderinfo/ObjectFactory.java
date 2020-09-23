
package cn.aps.orderinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.aps.orderinfo package. 
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

    private final static QName _GetShiftResponse_QNAME = new QName("http://aps.cn/orderinfo", "getShiftResponse");
    private final static QName _GetShift_QNAME = new QName("http://aps.cn/orderinfo", "getShift");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.aps.orderinfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetShiftResponse }
     * 
     */
    public GetShiftResponse createGetShiftResponse() {
        return new GetShiftResponse();
    }

    /**
     * Create an instance of {@link GetShift }
     * 
     */
    public GetShift createGetShift() {
        return new GetShift();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShiftResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aps.cn/orderinfo", name = "getShiftResponse")
    public JAXBElement<GetShiftResponse> createGetShiftResponse(GetShiftResponse value) {
        return new JAXBElement<GetShiftResponse>(_GetShiftResponse_QNAME, GetShiftResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShift }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://aps.cn/orderinfo", name = "getShift")
    public JAXBElement<GetShift> createGetShift(GetShift value) {
        return new JAXBElement<GetShift>(_GetShift_QNAME, GetShift.class, null, value);
    }

}
