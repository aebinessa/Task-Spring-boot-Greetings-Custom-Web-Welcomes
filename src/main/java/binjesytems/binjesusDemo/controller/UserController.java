package binjesytems.binjesusDemo.controller;

import binjesytems.binjesusDemo.requestClasses.CreateUserRequest;
import binjesytems.binjesusDemo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create-user")
    public ResponseEntity<String> createUser(@RequestBody CreateUserRequest createUserRequest) {
        userService.saveUser(createUserRequest);
        return ResponseEntity.ok("user created successfully");
    }

}
