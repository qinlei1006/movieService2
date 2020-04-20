package com.lovo.pay.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sys_order_pay")
public class OrderEntity implements Serializable {
    @Id
    @Column(name = "order_id",length = 32)
    @GenericGenerator(name = "order_uuid",strategy = "uuid")
    @GeneratedValue(generator = "order_uuid")
    private String orderId;
    @Column(name = "order_num",length = 48)
    private String orderNum;//订单编号
    //序号
    @Column(name = "order_index")
    private int index;
    //电影名字
    @Column(name = "movie_name",length = 48)
    private String movieName;
    //购买价格
    @Column(name = "ticke_price")
    private  float tickePrice;
    //购买数量
    @Column(name = "ticke_num")
    private  int  tickeNum;
    private int tag;// 0-未付款 1-已付款 2-已出票
    @Column(name = "user_name",length = 48)
    private  String userName;//用户 要保证唯一

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public float getTickePrice() {
        return tickePrice;
    }

    public void setTickePrice(float tickePrice) {
        this.tickePrice = tickePrice;
    }

    public int getTickeNum() {
        return tickeNum;
    }

    public void setTickeNum(int tickeNum) {
        this.tickeNum = tickeNum;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
