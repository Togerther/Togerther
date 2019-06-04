package com.example.mybatisplugdemo.base.service;

import com.example.mybatisplugdemo.base.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @ClassNameAbstractService
 * @Description
 * @Author ASUS
 * @Date2019/6/4 15:46
 * @Version V1.0
 **/
public abstract class AbstractService<T,ID> implements BaseService<T,ID> {

    @Autowired
    BaseMapper<T> baseMapper;

    @Override
    public Condition createCondition() {
        Class clz = this.getClass();
        ParameterizedType type = (ParameterizedType) clz.getGenericSuperclass();
        Type[] types = type.getActualTypeArguments();
        Condition condition = new Condition((Class<T>) types[0]);
        return condition;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer add(T t) {
        return baseMapper.insert(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer batchAdd(List<T> list) {
        return baseMapper.insertList(list);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer deleteById(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer deleteByExample(Example e) {
        return baseMapper.deleteByExample(e);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer updateByPrimaryKeySelective(T t) {
        return baseMapper.updateByPrimaryKeySelective(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer batchUpdateByPrimaryKey(List<T> list) {
        list.stream().forEach(t -> {
            baseMapper.updateByPrimaryKeySelective(t);
        });
        return list.size();
    }

    @Override
    public T findById(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<T> findByExample(Example e) {
        return baseMapper.selectByExample(e);
    }
}
