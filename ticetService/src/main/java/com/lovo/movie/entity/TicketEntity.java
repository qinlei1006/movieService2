package com.lovo.movie.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 电影票
 */
@Entity
@Table(name = "sys_ticket")
public class TicketEntity {
    @Id
    @Column(name = "ticket_id",length = 32)
    @GenericGenerator(name = "ticket_uuid",strategy = "uuid")
    @GeneratedValue(generator = "ticket_uuid")
    private String ticketId;
    //序号
    @Column(name = "t_index")
    private int index;
     //电影名字
     @Column(name = "movie_name",length = 48)
    private String movieName;
    //价格
    @Column(name = "t_price")
    private  float ticketPrice;
    //数量
    @Column(name = "t_num")
    private  int  ticketNum;
    //标记 0-待出售 1-已出售
    private  int tag;

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
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

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
}
