package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    DemoRepository demoRepository;

    public Demo save(Demo demo) {
        String lastname = demo.getLastname();
        String firstname = demo.getFirstname();
        if (!lastname.equals("") && !firstname.equals("")) {
            String fullname = demo.getLastname() + demo.getFirstname();
            demo.setFullname(fullname);
        }
        return demoRepository.save(demo);
    }
}