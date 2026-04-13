package com.hyw.test01.entity;

/**
 * Classcname: Clazz
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/13 8:34
 * @Version 1.0
 */
public class Clazz {
    private int cid;
    private String cname;

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getcname() {
        return cname;
    }

    public void setcname(String cname) {
        this.cname = cname;
    }

    public Clazz(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Clazz() {
    }
}
