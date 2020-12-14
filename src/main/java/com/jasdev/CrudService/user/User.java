package com.jasdev.CrudService.user;
import com.fasterxml.jackson.annotation.JsonFilter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@JsonFilter("userFilter")
public class User {

    private String name;

    private String gender;

   @Min(value = 10, message = "Age must above 10 years old")
   @Max(value = 55, message = "Age must below 55 years old")
    private Integer age;

    public User(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
