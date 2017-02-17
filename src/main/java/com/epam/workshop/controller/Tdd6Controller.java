package com.epam.workshop.controller;

import com.epam.workshop.dto.ResultDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tdd6Controller {

    private final Logger logger = LoggerFactory.getLogger(Tdd6Controller.class);

    @CrossOrigin
    @RequestMapping("/")
    public ResultDto count(@RequestParam(value = "startDate") final String startDate,
                           @RequestParam(value = "endDate") final String endDate) {
        final ResultDto resultDto = new ResultDto();

        // Format of input dates is YYYY-MM-DD
        logger.info("startDate value is '{}'", startDate);
        logger.info("endDate value is '{}'", endDate);

        // Fake result, you should replace it with your own
        resultDto.setCount(-"Welcome to TDD-6 workshop".length());

        return resultDto;
    }

}
