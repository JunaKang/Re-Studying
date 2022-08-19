package com.example.theore.dto;

public class MemberDto {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "MemberDto{" + "name='" + name + '}';
    }
}
