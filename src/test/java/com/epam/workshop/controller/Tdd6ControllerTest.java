package com.epam.workshop.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class Tdd6ControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getCount() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/?startDate=2017-01-01&endDate=2018-01-01").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}