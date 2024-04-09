package vn.edu.iuh.fit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.entity.Token;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
