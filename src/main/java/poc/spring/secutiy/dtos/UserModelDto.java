package poc.spring.secutiy.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserModelDto {
    @NotBlank
    private String name;

    @NotBlank
    private String password;
}
