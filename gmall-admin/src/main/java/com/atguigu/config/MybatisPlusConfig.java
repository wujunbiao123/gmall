/**
 * Copyright (c) 2016-2019 谷粒开源 All rights reserved.
 * <p>
 * https://www.guli.cloud
 * <p>
 * 版权所有，侵权必究！
 */

package com.atguigu.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.optimize.JsqlParserCountOptimize;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis-plus配置
 *
 * @author Mark sunlightcs@gmail.com
 */
@Configuration
public class MybatisPlusConfig {
    /*
           使用mybatis-plus步骤：

           1. 配置目录中引入映射文件
           2. 在启动类上添加@MapperScan扫描所有mapper/dao接口
           3. 编写XxxMapper接口实现BaseMapper\<T\>即可
           4. 编写XxxService接口继承IService\<T\>，编写xxxServiceImpl实现类继承ServiceImpl<XxxMapper,  XxxEntity>
           5. 查询分页要添加分页过滤器：
       */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
        // paginationInterceptor.setOverflow(false);
        // 设置最大单页限制数量，默认 500 条，-1 不受限制
        // paginationInterceptor.setLimit(500);
        // 开启 count 的 join 优化,只针对部分 left join

        //  paginationInterceptor.setCountSqlParser(new JsqlParserCountOptimize(true));
        //TODO 蒙的
        paginationInterceptor.setSqlParser(new JsqlParserCountOptimize());
        return paginationInterceptor;
    }


    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }

  /*  @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }*/


}
