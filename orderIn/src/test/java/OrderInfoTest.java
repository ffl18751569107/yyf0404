import aps.OrderInfo;
import cn.aps.orderinfo.*;
import org.junit.Before;
import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class OrderInfoTest {

    public static String serviceAddress = "http://localhost:8080/orderinfo";

    @Before
    public void init() {
        OrderInfo orderInfo = new OrderInfo();
        Endpoint endpoint = Endpoint.publish(serviceAddress, orderInfo);
        System.out.println("orderInfo service is published: " + endpoint.isPublished());
    }

    @Test
    public void testGetShift() throws MalformedURLException {
        URL url = new URL(serviceAddress + "?wsdl");
        OrderInfoService orderInfoService = new OrderInfoService(url, new QName("http://aps.cn/orderinfo", "OrderInfoService"));
        ApsOrderInfo apsOrderInfo = orderInfoService.getApsOrderInfoPort();
        Long nums = (long)100086;
        Long num2 = (long)418477;
        Order shift = apsOrderInfo.getShift(nums);
        Order shift2 = apsOrderInfo.getShift(num2);

        assertEquals((Integer)1000, shift.getCount());
        assertEquals("2018/1/2", shift.getDeadline());
        assertEquals(nums, shift.getMaterialId());

        assertEquals((Integer)7700, shift2.getCount());
        assertEquals("2018/11/9", shift2.getDeadline());
        assertEquals(Long.valueOf(3246515), shift2.getMaterialId());
    }
}
