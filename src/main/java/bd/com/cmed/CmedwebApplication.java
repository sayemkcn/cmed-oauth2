package bd.com.cmed;

import bd.com.cmed.services.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@SpringBootApplication
public class CmedwebApplication {
    @Autowired
    private CustomUserDetailsService userDetailsService;

    public static void main(String[] args) {
        SpringApplication.run(CmedwebApplication.class, args);
    }
    @Autowired
    public void authenticationManager(AuthenticationManagerBuilder builder) throws Exception {
        builder.userDetailsService(userDetailsService);
    }
}
