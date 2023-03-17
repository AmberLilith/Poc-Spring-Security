package poc.spring.secutiy.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AuthenticationDto {
    @NotBlank
    private String login;
    @NotBlank
    private String password;
}
