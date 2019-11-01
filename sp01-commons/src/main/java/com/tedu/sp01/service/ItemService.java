package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**根据订单号获取商品信息*/
	List<Item> getItems(String orderId);
	/**减少库存*/
	void decreaseNumbers(List<Item> list);

}
