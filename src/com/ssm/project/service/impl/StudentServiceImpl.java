package com.ssm.project.service.impl;

import com.ssm.project.bean.Student;
import com.ssm.project.dao.StudentDao;
import com.ssm.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 代理类
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student selectOneById(int sid) {
        return studentDao.selectOneById(sid);
    }

    @Override
    public int updateOne(Student student) {
        return studentDao.updateOne(student);
    }

}
