package com.example.demo.service.impl;

import com.example.demo.doamin.Log;
import com.example.demo.repository.LogRepository;
import com.example.demo.service.IDemoService;

public class DemoServiceImpl implements IDemoService {
    private LogRepository logRepository;

    public DemoServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public String showMessage(String message) {
        String result = null;
        if (message == null || message.length() == 0) {
            result = "Hello World!";
        } else {
            result = String.format("This is the message: %s ", message);
        }

        Log log = new Log();
        log.setMessage(result);
        this.logRepository.save(log);

        return result;
    }
    
}
