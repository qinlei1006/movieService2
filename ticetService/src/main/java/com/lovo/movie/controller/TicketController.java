package com.lovo.movie.controller;

import com.lovo.movie.entity.TicketEntity;
import com.lovo.movie.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {

    @Autowired
    private ITicketService ticketService;

    /**
     * 查询所有电影票
     * @return
     */
    @RequestMapping("findAllTicket")
    public List<TicketEntity> findAllTicket(){
        return ticketService.findAllTicket();
    }

    /**
     * 根据电影票查询出电影对象
     * @param index
     * @return
     */
    @RequestMapping("ticketByIndex/{index}")
    public TicketEntity ticketByIndex(@PathVariable("index") int index){
        return ticketService.getTicketByIndex(index);
    }

    /**
     * 根据序列号将电影票数量减一
     * @param index
     * @return
     */
    @RequestMapping("updateTicketNum/{index}")
    public String updateTicketNum(@PathVariable("index") int index){
        ticketService.updateTicketNum(index);
        return "ok";
    }


}
