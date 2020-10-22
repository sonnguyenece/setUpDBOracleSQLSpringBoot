package com.example.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Bank_Account {
    @Id
    Long id;
    String full_name;
    double balance;
}
