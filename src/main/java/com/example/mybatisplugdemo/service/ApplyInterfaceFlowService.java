package com.example.mybatisplugdemo.service;

import com.example.mybatisplugdemo.base.service.BaseService;
import com.example.mybatisplugdemo.entity.ApplyInterfaceFlow;

import java.util.List;

/**
 * @ClassNameApplyInterfaceFlowService
 * @Description
 * @Author ASUS
 * @Date2019/6/4 16:18
 * @Version V1.0
 **/
public interface ApplyInterfaceFlowService extends BaseService<ApplyInterfaceFlow,Integer> {

    List<ApplyInterfaceFlow> findAll();
}
