package com.spring5.java.demo1;

/**
 * core、beans、context、expression四个主要的jar包
 */
public class User {
    private Integer id;
    private String name;
    private String password;
    private Department department;

    public User(){}

    public User(Integer id,String name,String password){
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public User(Integer id, String name, String password, Department department) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", department=" + department +
                '}';
    }
}
