package com.jdzapp.cloud.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 字段
 * </p>
 *
 * @author zex
 * @since 2020-12-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="GeField对象", description="字段")
public class GeField implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty(value = "字段名称")
    private String name;

    @ApiModelProperty(value = "字段编码")
    private String code;

    @ApiModelProperty(value = "字段类型")
    private String type;

    @ApiModelProperty(value = "字段长度")
    private Integer length;

    @ApiModelProperty(value = "小数点长度")
    private Integer decimalPoint;

    @ApiModelProperty(value = "是否为空")
    private Boolean notNull;

    @ApiModelProperty(value = "是否为主键")
    private Boolean primaryKey;

    @ApiModelProperty(value = "默认值")
    private String defaultValue;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createAt;

    @ApiModelProperty(value = "所属模型ID")
    private String modelId;


}
