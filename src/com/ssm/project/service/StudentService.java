package com.ssm.project.service;

import com.ssm.project.bean.Student;

/**
 * 代理业务处理实现接口
 */
public interface StudentService {

    /**
     * 查询一则
     * @param sid
     * @return
     */
    public Student selectOneById(int sid);

    /**
     * 更新一则
     * @param student
     * @return
     */
    public int updateOne(Student student);

}
