package ru.neoflex.practice.controller;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "", produces = "application/json")
@OpenAPIDefinition(
        info = @Info(
                title = "Калькулятор",
                description = "Практика",
                contact = @Contact(
                        name = "Севастьянов Егор",
                        email = "egorchik210@gmail.com",
                        url = "https://github.com/TheIgor23"
                )
        )
)

@Tag(name = "Калькулятор", description = "Математические действия над числами")

public class CalcController {

    @GetMapping("/plus/{a}/{b}")
    public double plus(@PathVariable double a, @PathVariable double b) {

        return a+b;
    }

    @GetMapping("/div/{a}/{b}")
    public double div(@PathVariable double a, @PathVariable double b) {

        return a/b;
    }

    @GetMapping("/mult/{a}/{b}")
    public double mult(@PathVariable double a, @PathVariable double b) {

        return a*b;
    }

    @GetMapping("/minus/{a}/{b}")
    public double minus (@PathVariable double a, @PathVariable double b) {
        return a-b;
    }
}