
package cn.aps.orderinfo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OrderInfoService", targetNamespace = "http://aps.cn/orderinfo", wsdlLocation = "file:/Users/yangyifei/GitHub/APS-backend/OrderInfo/orderinfo.wsdl")
public class OrderInfoService
    extends Service
{

    private final static URL ORDERINFOSERVICE_WSDL_LOCATION;
    private final static WebServiceException ORDERINFOSERVICE_EXCEPTION;
    private final static QName ORDERINFOSERVICE_QNAME = new QName("http://aps.cn/orderinfo", "OrderInfoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/yangyifei/GitHub/APS-backend/OrderInfo/orderinfo.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ORDERINFOSERVICE_WSDL_LOCATION = url;
        ORDERINFOSERVICE_EXCEPTION = e;
    }

    public OrderInfoService() {
        super(__getWsdlLocation(), ORDERINFOSERVICE_QNAME);
    }

    public OrderInfoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ORDERINFOSERVICE_QNAME, features);
    }

    public OrderInfoService(URL wsdlLocation) {
        super(wsdlLocation, ORDERINFOSERVICE_QNAME);
    }

    public OrderInfoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ORDERINFOSERVICE_QNAME, features);
    }

    public OrderInfoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderInfoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ApsOrderInfo
     */
    @WebEndpoint(name = "aps.OrderInfoPort")
    public ApsOrderInfo getApsOrderInfoPort() {
        return super.getPort(new QName("http://aps.cn/orderinfo", "aps.OrderInfoPort"), ApsOrderInfo.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ApsOrderInfo
     */
    @WebEndpoint(name = "aps.OrderInfoPort")
    public ApsOrderInfo getApsOrderInfoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://aps.cn/orderinfo", "aps.OrderInfoPort"), ApsOrderInfo.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ORDERINFOSERVICE_EXCEPTION!= null) {
            throw ORDERINFOSERVICE_EXCEPTION;
        }
        return ORDERINFOSERVICE_WSDL_LOCATION;
    }

}
