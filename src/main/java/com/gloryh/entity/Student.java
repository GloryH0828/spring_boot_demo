package com.gloryh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 学生实体类
 *
 * @author 黄光辉
 * @since 2020/9/24
 **/
@Data
@AllArgsConstructor
public class Student {
    private long id;
    private String name;
    private int age;
}
