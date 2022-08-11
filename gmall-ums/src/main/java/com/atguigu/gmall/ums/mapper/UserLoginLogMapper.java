package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户登陆记录表
 * 
 * @author gangge
 * @email gangge@atguigu.com
 * @date 2022-08-11 17:47:20
 */
@Mapper
public interface UserLoginLogMapper extends BaseMapper<UserLoginLogEntity> {
	
}
