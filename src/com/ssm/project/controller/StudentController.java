package com.ssm.project.controller;

import com.ssm.project.bean.Student;
import com.ssm.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器：用于处理用户请求，并封装响应到视图的数据
 * 使用注解方式：自定义处理用户请求并封装响应数据的方法
 * todo 该控制器是单例模式，在服务器启动时创建对象
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * 用于处理带参数的用户请求，并进行转发或者重定向
     * 设置返回值 String，使用 SpringMVC 方式进行重定向与转发
     * @param student 处理请求的方法的对象参数，用来获取请求地址的参数值，todo 请求地址的参数名与对象的成员属性名一致
     * @param map 用来封装响应到视图的数据，保存在 request 域中
     * @return
     */
    @RequestMapping("/select.form")
    public String selectStudent(Student student, ModelMap map){
        //System.out.println("id: " + student.getId());
        map.addAttribute("student", studentService.selectOneById(student.getId()));
        return "student";  // todo  要求 [dispatcher]-servlet.xml 配置文件中有配置视图渲染器
    }

}
