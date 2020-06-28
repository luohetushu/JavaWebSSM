package com.ssm.project.dao.impl;

import com.ssm.project.bean.Student;
import com.ssm.project.dao.StudentDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 业务处理，只设计对数据库的处理（增、删、改、查），不涉及数据库的连接
 * 真实业务处理类
 */
@Repository("studentDao")
public class StudentDaoImpl extends SqlSessionDaoSupport implements StudentDao {


    /**
     * 自动装配（注入）
     * @param sqlSessionFactory
     */
    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public Student selectOneById(int sid) {
        //System.out.println("StudentDaoImpl---id: " + sid);
        return getSqlSession().selectOne("com.ssm.project.mapper.StudentMapper.selectStudentById", sid);
    }

    @Override
    public int updateOne(Student student) {
        return getSqlSession().update("com.ssm.project.mapper.StudentMapper.updateStudentById", student);
    }
}
