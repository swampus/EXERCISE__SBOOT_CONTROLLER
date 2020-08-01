package com.swampus.exercise.task;

import com.swampus.exercise.not.modify.OurRestException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.util.NestedServletException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class Task6SeniorTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test() throws Exception {


        mockMvc.perform(get("/task6/senior/abcderfgertertdf"))
                .andExpect(status().isOk())
                .andExpect(content().string("OK"));


        try {
            mockMvc.perform(get("/task6/senior/abc"))
                    .andExpect(status().isInternalServerError())
                    .andExpect(result -> assertTrue(result.getResolvedException() instanceof OurRestException))
                    .andExpect(result -> assertEquals("String to small",
                            result.getResolvedException().getMessage()));

        } catch (NestedServletException e) {
            assertEquals("Request processing failed; nested exception is " +
                    "com.swampus.exercise.not.modify.OurRestException: String too small", e.getMessage());

        }

    }
}