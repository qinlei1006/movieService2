package com.lovo.pay.service.impl;

import com.lovo.pay.dao.IPayDao;
import com.lovo.pay.entity.OrderEntity;
import com.lovo.pay.service.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value ="payService" )
public class PayService implements IPayService {
    @Autowired
    private IPayDao payDao;

    public void savaOrder(OrderEntity orderEntity) {
        //如果存在就不再保存
     int count=   payDao.findOrderByNum(orderEntity.getOrderNum());
     if(count==0) {
         payDao.save(orderEntity);
     }
    }
}
