package com.gloryh.repository;

import com.gloryh.entity.Student;

import java.util.Collection;

/**
 * 学生实体类实现方法接口
 *
 * @author 黄光辉
 * @since 2020/9/24
 **/
public interface StudentRepository {
    /**
     * 查询所有学生信息
     *
     * @return 学生信息列表
     */
    public Collection<Student> findAll();

    /**
     * 按 id 查询学生信息
     *
     * @param id 学生id
     * @return 学生实体类
     */
    public Student findById(long id);

    /**
     * 按 id 删除学生信息
     *
     * @param id 学生id
     */
    public void deleteById(long id);

    /**
     * 更新或添加学生信息
     *
     * @param student 要更新或添加的学生信息
     */
    public void saveOrUpdate(Student student);
}
