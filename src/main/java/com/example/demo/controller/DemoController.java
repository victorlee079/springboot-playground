package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.doamin.Input;
import com.example.demo.doamin.Output;
import com.example.demo.service.IDemoService;

@RestController
@RequestMapping("demo")
public class DemoController {
    private IDemoService demoService;

    public DemoController(IDemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("index")
    public Output showMessage(Input input) {
        Output output = new Output();
        output.setMessage(this.demoService.showMessage(input.getMessage()));
        return output;
    }
}
