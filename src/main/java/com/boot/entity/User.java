package com.boot.entity;

import lombok.*;

import java.io.Serializable;

/**
 * Created by Im.Yan on 2017/8/21.
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User implements Serializable{

    private Integer id;
    private String userName;
    private String address;
    private String password;
    private Integer deptId;
}
