package com.example.mybatisplugdemo.service.impl;

import com.example.mybatisplugdemo.base.service.AbstractService;
import com.example.mybatisplugdemo.entity.ApplyInterfaceFlow;
import com.example.mybatisplugdemo.service.ApplyInterfaceFlowService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * @ClassNameApplyInterfaceFlowServiceImpl
 * @Description
 * @Author ASUS
 * @Date2019/6/4 16:19
 * @Version V1.0
 **/
@Service
public class ApplyInterfaceFlowServiceImpl extends AbstractService<ApplyInterfaceFlow,Integer> implements ApplyInterfaceFlowService {

    @Override
    public List<ApplyInterfaceFlow> findAll() {
        Condition condition = createCondition();
        return findByExample(condition);
    }
}
