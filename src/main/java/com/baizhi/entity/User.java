package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bz_user")
public class User implements Serializable {
    @Id
    private Integer id;
    @Column(name = "user_name")
    private String  name;
    private String  password;
    private Integer type;
}
