package aps;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.Endpoint;

@WebService(name = "aps.OrderInfo", targetNamespace = "http://aps.cn/orderinfo")
public class OrderInfo {

    public static String serviceAddress="http://localhost:8080/orderinfo";

    private List<Order> orderList;

    public OrderInfo() {
        buildShiftTable();
    }

    public Order getShift(long code) {
        Order shift = new Order();
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getOrderId().equals(code)) {
                return orderList.get(i);
            }
        }
        return null;
    }

    private void buildShiftTable() {
        orderList = new ArrayList<Order>();
        try {
            List<List<String>> data = FileUtilOrder.readCsv("/Users/yangyifei/GitHub/APS-backend/OrderInfo/src/main/resources/orderInfo.csv");
            for (int i = 0; i < data.size(); i++) {
                Order order = new Order();
                List<String> item = data.get(i);
                order.setOrderId(Long.valueOf(item.get(0)));
                order.setMaterialId(Long.valueOf(item.get(1)));
                order.setDeadline(item.get(3));
                order.setCount(Integer.valueOf(item.get(2)));
                orderList.add(order);
            }
            Order order = new Order();
            order.setOrderId((long)(100086));
            order.setMaterialId((long)(100086));
            order.setCount((1000));
            order.setDeadline("2018/1/2");
            orderList.add(order);

        } catch (Exception e) {
            System.out.println("===初始化订单表示失败===");
            e.printStackTrace();
        }
    }

   /* public static void main(String[] args) {
        OrderInfo personManage = new OrderInfo();
        Endpoint endpoint= Endpoint.publish("http://0.0.0.0/orderinfo", personManage);
        System.out.println("person manage service is published: " + endpoint.isPublished());
    }
*/

}

