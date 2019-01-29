package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DemoService {
    @Autowired
    DemoRepository demoRepository;

    public List<Demo> findAll() {
        return demoRepository.findAll();
    }

    public Demo save(Demo demo) {
        String firstname = demo.getFirstname();
        String lastname = demo.getLastname();
        String fullname = !firstname.equals("") && !lastname.equals("") ? firstname + " " + lastname : "";
        demo.setFullname(fullname);
        return demoRepository.save(demo);
    }
}