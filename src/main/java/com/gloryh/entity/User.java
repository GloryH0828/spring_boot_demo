package com.gloryh.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 数据校验 测试 实体类
 *
 * @author 黄光辉
 * @since 2020/9/29
 **/
@Data
public class User {
    @NotNull(message = "id不能为空")
    private Long id;
    @NotEmpty(message = "姓名不能为空")
    @Length(min = 2,message = "姓名长度不得小于2")
    private String username;
    @Min(value =16,message = "年龄不得小于16")
    private int age;
    @NotEmpty(message = "密码不得为空")
    private String password;
}
