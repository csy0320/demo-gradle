package cn.jjdcn.demo.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String username;
    private Integer age;
    private String email;
    private String password;
}
