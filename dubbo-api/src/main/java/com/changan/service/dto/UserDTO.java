package com.changan.service.dto;

/**
 * dubbo3 服务之间传递数据 DTO
 *
 * @author zab
 * @date 2023/7/15 13:15
 */
public class UserDTO {
    private String name;
    private Integer age;

    public UserDTO(){}

    public UserDTO(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
