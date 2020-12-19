package com.jdzapp.cloud.generator.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jdzapp.cloud.generator.entity.GeModel;
import com.jdzapp.cloud.generator.req.Pageable;
import com.jdzapp.cloud.generator.service.IGeModelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 字段 前端控制器
 * </p>
 *
 * @author zex
 * @since 2020-12-19
 */
@RestController
@RequestMapping("/v1/generator/models")
@Api(tags = "字段控制器")
public class GeModelController {

    @Autowired
    private IGeModelService iGeModelService;

    @GetMapping("/{id}")
    @ApiOperation(value = "通过id查询字段")
    public GeModel get(@PathVariable String id) {
        return iGeModelService.getById(id);
    }

    @GetMapping
    @ApiOperation(value = "查询字段列表")
    public IPage<GeModel> list(Pageable pageable,GeModel model){
        return iGeModelService.page(pageable.convert(),new LambdaQueryWrapper<GeModel>()
        .eq(GeModel::getId,model.getId())
        .like(StringUtils.isNotBlank(model.getName()),GeModel::getName,model.getName())
        .like(StringUtils.isNotBlank(model.getCode()),GeModel::getCode,model.getCode()));
    }

}
