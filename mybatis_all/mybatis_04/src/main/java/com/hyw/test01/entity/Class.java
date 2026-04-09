package com.hyw.test01.entity;

import java.util.Objects;

/**
 * ClassName: Class
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/9 17:28
 * @Version 1.0
 */
public class Class {
    private int cid;
    private String cname;

    @Override
    public String toString() {
        return "Class{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return cid == aClass.cid && Objects.equals(cname, aClass.cname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, cname);
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Class() {
    }

    public Class(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }
}
