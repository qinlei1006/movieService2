package com.lovo.movie.service.impl;

import com.lovo.movie.dao.IOrderDao;
import com.lovo.movie.entity.OrderEntity;
import com.lovo.movie.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "orderService")
public class OrderServiceImpl implements IOrderService {
    @Autowired
  private IOrderDao orderDao;
    public void savaOrder(OrderEntity orderEntity) {
        orderDao.save(orderEntity);
    }

    @Override
    public OrderEntity getOrderEntityByOrderNum(String orderNum) {
        return orderDao.getOrderEntityByOrderNum(orderNum);
    }

    @Override
    @Transactional
    public void updateOrderBynum(String orderNum, int tag) {
        orderDao.updateOrderBynum(orderNum,tag);
    }

    @Override
    public List<OrderEntity> findAllOrder() {
        return (List<OrderEntity>) orderDao.findAll();
    }
}
