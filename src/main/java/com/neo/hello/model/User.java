package com.neo.hello.model;

public class User {
    private String name;
    private int age;
    private String pass;

    public void setName(String name){
        this.name=name;
    }


    public void setAge(int age){
        this.age=age;
    }

    public void setPass(String pass){
        this.pass=pass;
    }
    public String getName(){
           return this.name;
       }
    public int getAge(){
        return this.age;
    }
    public String getPass(){
        return this.pass;
    }

}
