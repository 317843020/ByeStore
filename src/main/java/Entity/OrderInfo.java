package Entity;

import java.util.Date;

public class OrderInfo {
    private String orderno;

    private String shippingadd;

    private Long totalamount;

    private Date ordertime;

    private String bill;

    private String recipentname;

    private String phone;

    private String state;

    private Date returntime;

    private String expressway;

    private Date recipenttime;

    private Boolean deletestate;

    private String paymentway;

    private String paymentaccount;

    private String userid;

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getShippingadd() {
        return shippingadd;
    }

    public void setShippingadd(String shippingadd) {
        this.shippingadd = shippingadd == null ? null : shippingadd.trim();
    }

    public Long getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(Long totalamount) {
        this.totalamount = totalamount;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill == null ? null : bill.trim();
    }

    public String getRecipentname() {
        return recipentname;
    }

    public void setRecipentname(String recipentname) {
        this.recipentname = recipentname == null ? null : recipentname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getReturntime() {
        return returntime;
    }

    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }

    public String getExpressway() {
        return expressway;
    }

    public void setExpressway(String expressway) {
        this.expressway = expressway == null ? null : expressway.trim();
    }

    public Date getRecipenttime() {
        return recipenttime;
    }

    public void setRecipenttime(Date recipenttime) {
        this.recipenttime = recipenttime;
    }

    public Boolean getDeletestate() {
        return deletestate;
    }

    public void setDeletestate(Boolean deletestate) {
        this.deletestate = deletestate;
    }

    public String getPaymentway() {
        return paymentway;
    }

    public void setPaymentway(String paymentway) {
        this.paymentway = paymentway == null ? null : paymentway.trim();
    }

    public String getPaymentaccount() {
        return paymentaccount;
    }

    public void setPaymentaccount(String paymentaccount) {
        this.paymentaccount = paymentaccount == null ? null : paymentaccount.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}