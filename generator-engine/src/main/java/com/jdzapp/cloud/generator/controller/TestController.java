package com.jdzapp.cloud.generator.controller;

import com.jdzapp.cloud.generator.template.FreemarkerTemplateEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private FreemarkerTemplateEngine freemarkerTemplateEngine;

    @RequestMapping("/{filename}")
    public String test(@PathVariable String filename) throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("packageName","com.jdzapp.cloud.generator");
        map.put("tableComment","测试");
        map.put("author",System.getProperty("user.name"));
        map.put("date", LocalDateTime.now());
        map.put("tableName","test");
        map.put("modelName","generator");
        map.put("className","Test");
        freemarkerTemplateEngine.writer(map,"controller.java","/Users/zex/WorkSpace/JavaProjects/cloud/template/"+filename);
        return "Success";
    }

}
