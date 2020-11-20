package com.gloryh.controller;

import com.gloryh.entity.Student;
import com.gloryh.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 测试框架是否搭建成功
 *
 * @author 黄光辉
 * @since 2020/9/26
 **/
@Controller
@RequestMapping("/hello")
public class HelloHandler {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public ModelAndView index() {
        System.out.println("index...");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", studentRepository.findAll());
        return modelAndView;
    }

    @GetMapping("/deleteById/{id}")
    public String delete(@PathVariable("id") long id) {
        studentRepository.deleteById(id);
        //删除后重定向到 http://localhost:8080/hello/findAll  完成刷新
        return "redirect:/hello/findAll";
    }

    @GetMapping("/findById/{id}")
    public ModelAndView findById(@PathVariable("id") long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        modelAndView.addObject("student", studentRepository.findById(id));
        return modelAndView;
    }

    @PostMapping("/update")
    public String update(Student student) {
        studentRepository.saveOrUpdate(student);
        //修改后重定向到 http://localhost:8080/hello/findAll  完成刷新
        return "redirect:/hello/findAll";
    }

    @PostMapping("/save")
    public String save(Student student) {
        studentRepository.saveOrUpdate(student);
        //添加后重定向到 http://localhost:8080/hello/findAll  完成刷新
        return "redirect:/hello/findAll";
    }
}
