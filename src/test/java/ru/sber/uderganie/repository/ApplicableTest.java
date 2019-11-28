package ru.sber.uderganie.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;
import ru.sber.uderganie.UderganieApplication;
import ru.sber.uderganie.model.Employee;

@SpringBootTest(classes = UderganieApplication.class)
public class ApplicableTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    public void saveTest() throws Exception {

    }
}
