package com.gloryh.repository.impl;

import com.gloryh.entity.Student;
import com.gloryh.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 学生实体类实现方法
 *
 * @author 黄光辉
 * @since 2020/9/24
 **/
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    /**
     * Map 代替数据库
     */
    private static Map<Long,Student> studentMap;
    static {
        studentMap =new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",20));
        studentMap.put(2L,new Student(2L,"李四",21));
        studentMap.put(3L,new Student(3L,"王五",22));
    }
    /**
     * 查询所有学生信息
     *
     * @return 学生信息列表
     */
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    /**
     * 按 id 查询学生信息
     *
     * @param id 学生id
     * @return 学生实体类
     */
    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    /**
     * 按 id 删除学生信息
     *
     * @param id 学生id
     */
    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }

    /**
     * 更新或添加学生信息
     *
     * @param student 要更新或添加的学生信息
     */
    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }
}
