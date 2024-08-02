package com.itheima.reggie.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Orders;

/**
 * <p>
 * 订单表 服务类
 * </p>
 *
 * @author cc
 * @since 2022-05-30
 */
public interface OrderService extends IService<Orders> {

    public void submit(Orders orders);
}
