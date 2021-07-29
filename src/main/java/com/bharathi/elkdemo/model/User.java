package com.bharathi.elkdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer age;
    private String phoneNumber;
    private String aadhaarNumber;
}
