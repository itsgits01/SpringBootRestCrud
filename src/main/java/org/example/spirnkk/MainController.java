package org.example.spirnkk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/demo")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody User addNewUser(@RequestParam String name, @RequestParam String email) {
        User springUser = new User();
        springUser.setName(name);
        springUser.setEmail(email);
        userRepository.save(springUser);
        return springUser;
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody String deleteUser(@PathVariable Integer id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return "User deleted successfully!";
        } else {
            return "User not found!";
        }
    }

    @PutMapping(path="/update/{id}")
    public @ResponseBody String updateUserName(@PathVariable Integer id, @RequestParam String name) {
        return userRepository.findById(id).map(user -> {
            user.setName(name);
            userRepository.save(user);
            return "User name updated successfully!";
        }).orElse("User not found!");
    }
}
