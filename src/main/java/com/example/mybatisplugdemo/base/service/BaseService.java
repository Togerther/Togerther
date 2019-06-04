package com.example.mybatisplugdemo.base.service;

import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ClassNameBaseService
 * @Description
 * @Author ASUS
 * @Date2019/6/4 15:45
 * @Version V1.0
 **/
public interface BaseService<T,ID> {

    /**
     * 创建 example
     *
     * @return
     */
    Condition createCondition();

    /**
     * 新增
     *
     * @param t
     * @return
     */
    Integer add(T t);

    /**
     * 批量新增
     *
     * @param list
     * @return
     */
    Integer batchAdd(List<T> list);

    /**
     * 主键ID删除
     *
     * @param id
     * @return
     */
    Integer deleteById(ID id);

    /**
     * 条件example刪除
     * @param e
     * @return
     */
    Integer deleteByExample(Example e);

    /**
     * 主键ID Selective更新
     *
     * @param t
     * @return
     */
    Integer updateByPrimaryKeySelective(T t);

    /**
     * 主键ID Selective 批量更新
     *
     * @param list
     * @return
     */
    Integer batchUpdateByPrimaryKey(List<T> list);

    /**
     * 主键ID 查询
     *
     * @param id
     * @return
     */
    T findById(ID id);

    /**
     * example 查询
     *
     * @param e
     * @return
     */
    List<T> findByExample(Example e);


}
