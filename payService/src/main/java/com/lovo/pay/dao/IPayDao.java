package com.lovo.pay.dao;


import com.lovo.pay.entity.OrderEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IPayDao extends CrudRepository<OrderEntity,String> {
    /**
     * 查询订单号存在的数量
     * @param orderNum
     * @return
     */
    @Query("select count(o) as num from OrderEntity o where o.orderNum=?1")
    public int findOrderByNum(String orderNum);
}
