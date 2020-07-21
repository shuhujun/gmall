package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author shuhujun
 * @email 2455431256@qq.com
 * @date 2020-07-21 09:00:30
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
