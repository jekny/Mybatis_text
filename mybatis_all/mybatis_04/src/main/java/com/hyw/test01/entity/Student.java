package com.hyw.test01.entity;

import java.util.Objects;

/**
 * ClassName: Student
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/9 17:27
 * @Version 1.0
 */
public class Student {
    private int sid;
    private String sname;
    private Class clazz;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sid == student.sid && Objects.equals(sname, student.sname) && Objects.equals(clazz, student.clazz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, sname, clazz);
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", clazz=" + clazz +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public Student(int sid, String sname, Class clazz) {
        this.sid = sid;
        this.sname = sname;
        this.clazz = clazz;
    }

    public Student() {
    }
}
