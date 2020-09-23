
package cn.aps.orderinfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "aps.OrderInfo", targetNamespace = "http://aps.cn/orderinfo")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ApsOrderInfo {


    /**
     * 
     * @param arg0
     * @return
     *     returns cn.aps.orderinfo.Order
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getShift", targetNamespace = "http://aps.cn/orderinfo", className = "cn.aps.orderinfo.GetShift")
    @ResponseWrapper(localName = "getShiftResponse", targetNamespace = "http://aps.cn/orderinfo", className = "cn.aps.orderinfo.GetShiftResponse")
    public Order getShift(
            @WebParam(name = "arg0", targetNamespace = "")
                    long arg0);

}
