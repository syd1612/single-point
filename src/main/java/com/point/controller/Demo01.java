package com.point.controller;

import com.point.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Demo01 {
    @RequestMapping("/demo01")
    public String demo01(Model models){
        String demo="新的一天真开心";
        String hello="123456";
        models.addAttribute("demo",demo);
        models.addAttribute("hello",hello);
        return "hello";
    }
    @RequestMapping("/demo02")
    @ResponseBody
    public List<Student> demo02(Model models, HttpServletRequest request){
        System.out.println("======== 遍历  ============");
        List<Student> list=new ArrayList<Student>();
        Student stu1=new Student(1,"花里胡哨",10);
        Student stu2=new Student(2,"sss",120);
        Student stu3=new Student(3,"sss22",130);
        Student stu4=new Student(4,"ss333",170);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        models.addAttribute("list",list);
        return list;
    }
}
