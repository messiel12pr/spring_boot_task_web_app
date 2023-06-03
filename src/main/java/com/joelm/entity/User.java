package com.joelm.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user", schema = "task_web_app_schema")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length=45, nullable=false, unique=true)
    private String username;

    @Column(length=45, nullable=false, unique=true)
    private String password;


}
