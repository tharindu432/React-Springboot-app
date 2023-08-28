package com.fullstackApp.fullstackApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class EmployeeController {

@GetMapping("/employees")
    public String getEmployee(){
        return "hello";


    }
}
