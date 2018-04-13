package com.qpf.model;
public class User {
    private int id;
    private String name;
    private int age;
    private int gender;
    private String password;
    private String email;
    private String heading;
    private String create_time;
    private String update_time;

    public User(){}

    public User(int id) {
        this.id = id;
    }

    public User(String name, int age, int gender, String password, String email, String heading, String update_time) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.password = password;
        this.email = email;
        this.heading = heading;
        this.update_time = update_time;
    }

    public User(String name, int age, int gender, String password, String email, String update_time) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.password = password;
        this.email = email;
        this.update_time = update_time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getHeading() {
        return heading;
    }

    public String getCreate_time() {
        return create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", heading='" + heading + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                '}';
    }
}
