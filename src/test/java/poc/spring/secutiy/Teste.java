package poc.spring.secutiy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
public class Teste {
    @Test
    public void teste(){
        System.out.println(Cript.bCryptPasswordEncoder().encode("1234")); ;
    }
}
