package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class StudentRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public StudentRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Student> getAllStudents() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("FROM Student", Student.class).list();
    }

    public Student getStudentById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Student.class, id);
    }

    public void saveStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(student);
    }

    public void deleteStudent(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Student student = session.get(Student.class, id);
        if (student != null) {
            session.delete(student);
        }
    }
}
