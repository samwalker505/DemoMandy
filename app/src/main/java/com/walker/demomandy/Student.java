package com.walker.demomandy;

/**
 * Created by samwalker on 25/2/16.
 */
public class Student {
    int sid = 1;
    String classNo = "5E";
    String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
