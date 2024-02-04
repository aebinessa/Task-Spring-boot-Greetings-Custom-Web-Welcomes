package binjesytems.binjesusDemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController

public class SystemController {
    @GetMapping("/sayHi")
    public String sayHi() {
        return "welcome to binjesystems";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Hello " + name;
    }

    @PostMapping("/farewell")
    public String farewell(@RequestBody FieldsRequest request){

        return "Farewell " + request.getName();
    }


}
