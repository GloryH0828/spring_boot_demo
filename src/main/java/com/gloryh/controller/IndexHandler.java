package com.gloryh.controller;

import com.gloryh.entity.Student;
import com.gloryh.entity.User;
import com.gloryh.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * 与 HTML 的整合 测试方法
 *
 * @author 黄光辉
 * @since 2020/9/27
 **/
@Controller
@RequestMapping("/index")
public class IndexHandler {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/index")
    public ModelAndView index() {
        System.out.println("index...");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", studentRepository.findAll());
        return modelAndView;
    }

    @GetMapping("/index2")
    public String index2(Map<String, String> map) {
        map.put("name", "张三");
        return "index2";
    }

    @GetMapping("/index3")
    public String index3(Map<String, Boolean> map) {
        map.put("flag", true);
        return "index2";
    }

    @GetMapping("/eq")
    public String eq(Model model) {
        model.addAttribute("age", 30);
        return "index";
    }

    @GetMapping("/switch")
    public String switchTest(Model model) {
        model.addAttribute("gender", "女");
        return "index";
    }

    @GetMapping("/validate")
    public void validate(@Valid User user, BindingResult bindingResult) {
        //打印 user 信息
        System.out.println(user);
        //判断 BindingResult 是否收集到错误信息
        if (bindingResult.hasErrors()) {
            //收集到，打印错误代码+错误信息
            List<ObjectError> objectErrors = bindingResult.getAllErrors();
            for (ObjectError objectError:objectErrors) {
                System.out.println(objectError.getCode()+":"+objectError.getDefaultMessage());
            }
        }
    }

}
