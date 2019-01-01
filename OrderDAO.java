package org.o7planning.springprojectshoppingcart.dao;


import java.util.List;

import org.o7planning.springprojectshoppingcart.model.CartInfo;
import org.o7planning.springprojectshoppingcart.model.OrderDetailInfo;
import org.o7planning.springprojectshoppingcart.model.OrderInfo;
import org.o7planning.springprojectshoppingcart.model.PaginationResult;

public interface OrderDAO {

   public void saveOrder(CartInfo cartInfo);

   public PaginationResult<OrderInfo> listOrderInfo(int page,
           int maxResult, int maxNavigationPage);
   
   public OrderInfo getOrderInfo(String orderId);
   
   public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}