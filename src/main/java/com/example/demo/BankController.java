package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankController {

    @Autowired
    BankRepository bankRepository;

    @RequestMapping("/")
    @ResponseBody
    public List<Bank_Account> getBank() {
        return bankRepository.findAll();
    }
}
