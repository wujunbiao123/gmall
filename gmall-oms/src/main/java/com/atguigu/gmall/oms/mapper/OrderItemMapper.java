package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author gangge
 * @email gangge@atguigu.com
 * @date 2022-08-11 17:40:53
 */
@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItemEntity> {
	
}
