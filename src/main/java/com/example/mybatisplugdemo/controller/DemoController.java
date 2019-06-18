package com.example.mybatisplugdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.mybatisplugdemo.entity.ApplyInterfaceFlow;
import com.example.mybatisplugdemo.service.ApplyInterfaceFlowService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @ClassNameDemoController
 * @Description
 * @Author ASUS
 * @Date2019/6/4 14:48
 * @Version V1.0
 **/
@RestController
public class DemoController {

    @Autowired
    ApplyInterfaceFlowService applyInterfaceFlowService;


    @RequestMapping("test")
    public String test(){
        PageHelper.startPage(1,10);
        List<ApplyInterfaceFlow> all = applyInterfaceFlowService.findAll();
        return JSONObject.toJSONString(all);
    }

    @RequestMapping("insert")
    public Integer insert(){
        ApplyInterfaceFlow applyInterfaceFlow = new ApplyInterfaceFlow();
        applyInterfaceFlow.setApplyNo("21454237yhsaga");
        applyInterfaceFlow.setFlowCode("sefeatggt4ewtw");
        applyInterfaceFlowService.add(applyInterfaceFlow);
        return applyInterfaceFlow.getId();
    }
}
