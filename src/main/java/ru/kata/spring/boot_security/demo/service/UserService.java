package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;
import java.util.Set;

public interface UserService extends UserDetailsService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user, Set<Long> roleIds);
    //void editUser(Long id, User user);
    void deleteUser(Long id);
    List<Role> getAllRoles();
    User findByEmail(String email);
    void editUser(Long id, String firstName, String lastName, int age, String email, String password, Set<Long> roleIds);
}
