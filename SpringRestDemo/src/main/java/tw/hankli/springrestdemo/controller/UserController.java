package tw.hankli.springrestdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tw.hankli.springrestdemo.model.User;
import tw.hankli.springrestdemo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public User create(@RequestParam String name, @RequestParam String phone) {
        return userService.save(name, phone);
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    public User findOne(@PathVariable("id") Long id) {
        return userService.findOne(id);
    }
}
