package com.bahar.springauthorizationserver;

import com.bahar.springauthorizationserver.model.User;
import com.bahar.springauthorizationserver.repository.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataConfig {
    @Bean
    ApplicationRunner dataLoader(UserRepository userRepository, PasswordEncoder encoder) {
        return args -> {
            userRepository.save(
                    new User("bahar", encoder.encode("bahar"), "ROLE_ADMIN")
            );
        };
    }
}
