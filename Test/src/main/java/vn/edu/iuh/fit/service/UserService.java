package vn.edu.iuh.fit.service;


import vn.edu.iuh.fit.authen.UserPrincipal;
import vn.edu.iuh.fit.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
