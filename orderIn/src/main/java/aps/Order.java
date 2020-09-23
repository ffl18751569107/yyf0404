package aps;


import java.util.Date;

/**
 * orderInfo
 */
public class Order {
    Long orderId;
    //订单ID
    Long materialId;
    //物料ID
    Integer count;
    //物料数量
    String deadline;
    //交期


    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }



    //
}
