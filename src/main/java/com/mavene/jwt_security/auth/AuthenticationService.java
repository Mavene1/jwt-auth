package com.mavene.jwt_security.auth;

import com.mavene.jwt_security.user.Role;
import com.mavene.jwt_security.user.User;
import com.mavene.jwt_security.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public AuthenticationService(UserRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    public AuthenticationRensponse register(RegisterRequest request) {
        var user = User
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();

        return null;
    }

    public AuthenticationRensponse authenticate(AuthenticationRequest request) {
        return null;
    }
}
