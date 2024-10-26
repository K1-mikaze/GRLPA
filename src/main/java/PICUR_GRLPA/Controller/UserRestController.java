package PICUR_GRLPA.Controller;

import PICUR_GRLPA.Model.User;
import PICUR_GRLPA.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/GRLPA")
public class UserRestController {

    @Autowired
    private UserRepository User_repository;

    @GetMapping("/usuarios")
    public List<User> AllUsers() {
        return User_repository.findAll();
    }

    @GetMapping("/usuarios/{id}")
    public Optional<User> Find_By_Id(@PathVariable("id") Long id) {
        return User_repository.findById(id);
    }

    @PostMapping("/usuario")
    public User Create_User(@RequestBody User user) {
        return User_repository.save(user);
    }

    @PutMapping("/usuario/{id}")
    public User Update_User(@PathVariable Long id, @RequestBody User user) {
        return User_repository.save(user);
    }

    @DeleteMapping("/usuario/{id}")
    public void Delete_User(@PathVariable("id") Long id) {
        User_repository.deleteById(id);
    }
}
