package com.lovo.movie.dao;

import com.lovo.movie.entity.OrderEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IOrderDao extends CrudRepository<OrderEntity,String> {

    @Query("from OrderEntity where orderNum=?1")
    public OrderEntity getOrderEntityByOrderNum(String orderNum);

    /**
     * 修改订单状态
     * @param orderNum
     */
    @Modifying
    @Query("update OrderEntity set tag=?2 where orderNum=?1")
    public  void updateOrderBynum(String orderNum,int tag);
}
