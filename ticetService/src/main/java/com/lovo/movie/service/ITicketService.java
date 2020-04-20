package com.lovo.movie.service;

import com.lovo.movie.entity.TicketEntity;

import java.util.List;

public interface ITicketService {
    /**
     * 查询出所有的票
     * @return
     */
    public List<TicketEntity> findAllTicket();

    /**
     * 保存
     *
     */
    public  void sava(List<TicketEntity> ticketEntityList);

    /**
     * 根据序号查询出电影票信息
     * @param index
     * @return
     */
    public TicketEntity getTicketByIndex(int index);

    /**
     * 根据序号修改
     * @param index
     */
    public  void updateTicketNum(int index);
}
