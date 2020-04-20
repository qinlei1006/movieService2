package com.lovo.movie.controller;

import com.lovo.movie.entity.OrderEntity;
import com.lovo.movie.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private IOrderService orderService;

    /**
     * 添加订单
     * @param orderEntity
     */
    @RequestMapping("savaOrder")
    public void savaOrder(@RequestBody OrderEntity orderEntity){
        orderService.savaOrder(orderEntity);
    }

    /**
     * 根据订单编号查询订单对象
     * @param orderNum
     * @return
     */
    @RequestMapping("getOrderEntityByOrderNum/{orderNum}")
    public OrderEntity getOrderEntityByOrderNum(@PathVariable("orderNum") String orderNum){
        return orderService.getOrderEntityByOrderNum(orderNum);
    }

    /**
     * 根据订单编号修改订单状态
     * @param orderNum
     * @param tag
     */
    @RequestMapping("updateOrderBynum/{orderNum}/{tag}")
    public void updateOrderBynum(@PathVariable("orderNum") String orderNum,@PathVariable("tag")int tag){
        orderService.updateOrderBynum( orderNum,tag);
    }

    /**
     * 查询所有订单
     * @return
     */
    @RequestMapping("findAllOrder")
    public List<OrderEntity> findAllOrder(){
        return orderService.findAllOrder();
    }
}
