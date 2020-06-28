package com.ssm.project.dao;

import com.ssm.project.bean.Student;

/**
 * 真实业务处理实现接口
 */
public interface StudentDao {

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
