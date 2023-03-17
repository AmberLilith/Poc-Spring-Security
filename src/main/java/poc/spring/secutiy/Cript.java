package poc.spring.secutiy;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Cript {


    public static BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
