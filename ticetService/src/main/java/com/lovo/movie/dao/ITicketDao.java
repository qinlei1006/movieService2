package com.lovo.movie.dao;

import com.lovo.movie.entity.TicketEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ITicketDao extends CrudRepository<TicketEntity,String> {

    @Query("from TicketEntity where index=?1 and tag=0")
    public TicketEntity getTicketByIndex(int indexs);
//   @Modifying
//   @Query("update TicketEntity set ticketNum=ticketNum-1 where index=?1")
//    public void updateTicketByIndex(int indexs);
}
