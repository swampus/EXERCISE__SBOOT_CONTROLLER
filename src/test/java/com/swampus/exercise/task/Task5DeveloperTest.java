package com.swampus.exercise.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class Task5DeveloperTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test() throws Exception {


        mockMvc.perform(get("/task5/hi"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hellow"));
    }
}