package vn.edu.iuh.fit.service;

import vn.edu.iuh.fit.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);

}
