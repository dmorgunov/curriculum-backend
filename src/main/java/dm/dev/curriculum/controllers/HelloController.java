package dm.dev.curriculum.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import dm.dev.curriculum.model.Department;

@RestController
public class HelloController {

    @GetMapping("")
    public Department s() {
        return new Department();
    }

}
