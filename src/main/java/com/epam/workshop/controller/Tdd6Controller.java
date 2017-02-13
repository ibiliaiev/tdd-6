package com.epam.workshop.controller;

import com.epam.workshop.dto.ResultDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tdd6Controller {

    @CrossOrigin
    @RequestMapping("/")
    public ResultDto count() {
        final ResultDto resultDto = new ResultDto();
        resultDto.setCount("Welcome to TDD-6 workshop".length());
        return resultDto;
    }

}
