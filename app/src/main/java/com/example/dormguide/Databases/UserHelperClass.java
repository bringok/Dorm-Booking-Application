package com.example.dormguide.Databases;


public class UserHelperClass {

   private String name,username,email,password,phoneNo,gender,age;


    public UserHelperClass(String name, String username, String email, String password, String phoneNo, String gender,String age) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.age = age;
    }

    public UserHelperClass() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}