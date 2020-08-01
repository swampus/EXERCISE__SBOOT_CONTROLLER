package com.swampus.exercise.task;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.swampus.exercise.not.modify.NumberHolder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class Task4DeveloperTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testKey() throws Exception {

        NumberHolder numberHolder = new NumberHolder();
        numberHolder.setA(1);
        numberHolder.setB(2);
        numberHolder.setC(4);

        mockMvc.perform(post("/task4/num_holder")
                .content(asJsonString(numberHolder))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("7"));
    }

    private String asJsonString(final Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            final String jsonContent = mapper.writeValueAsString(obj);
            return jsonContent;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}