package com.aftabthedeveloper.projects.cicdsample.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AppControllerTest {

    @InjectMocks
    private AppController controller;

    @Test
    void info() {
        Assertions.assertEquals("This is a CI/CD Sample application",controller.info());
    }
}