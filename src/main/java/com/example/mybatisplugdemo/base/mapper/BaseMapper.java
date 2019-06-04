package com.example.mybatisplugdemo.base.mapper;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ClassNameBaseMapper
 * @Description
 * @Author ASUS
 * @Date2019/6/4 15:34
 * @Version V1.0
 **/
@Repository
public interface BaseMapper<T> extends tk.mybatis.mapper.common.BaseMapper<T>,
        MySqlMapper<T> ,
        ExampleMapper<T> {
}
