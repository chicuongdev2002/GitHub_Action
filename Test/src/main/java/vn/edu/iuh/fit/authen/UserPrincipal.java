package vn.edu.iuh.fit.authen;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Getter@Setter
public class UserPrincipal  {
    private Long userId;
    private String username;
    private String password;

}
