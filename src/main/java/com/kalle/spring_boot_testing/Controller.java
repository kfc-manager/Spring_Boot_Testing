package com.kalle.spring_boot_testing;

import com.kalle.spring_boot_testing.person.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;

@RestController
@RequestMapping(path = "/api/v1")
public class Controller {

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person home() {
        Person person = new Person(1, "Kilian", "Calefice", LocalDate.of(2000, Month.SEPTEMBER, 7));
        return person;
    }

}
