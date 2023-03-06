package com.api.NifsAPIServer.controller;

import com.api.NifsAPIServer.domain.RequestDataVO;
import com.api.NifsAPIServer.service.Nifs2DataDAO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.MultiValueMap;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {

    @Mock
    private Nifs2DataDAO service;

    @InjectMocks
    private MainController controller;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void testGetNifs2Data() throws Exception {
        RequestDataVO requestDataVO = new RequestDataVO();
        requestDataVO.setStartDate(LocalDateTime.parse("2023-02-22")); //ERROR!
        requestDataVO.setEndDate(LocalDateTime.parse("2023-02-22")); //ERROR!

        // populate the nifs2DataList with test data

        mockMvc.perform(get("/getNifs2Data")
                        .param("serviceKey", "RERqTEcrS29VUlRUaFBydk5SRldvdz09")
                        .param("startDate","20230227")
                        .param("endDate","20230227").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}