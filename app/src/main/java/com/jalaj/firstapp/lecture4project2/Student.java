package com.jalaj.firstapp.lecture4project2;

/**
 * Created by jalajmehta on 7/3/16.
 */

public class Student {
    public Student(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name;
    private String phone;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
