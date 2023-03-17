package poc.spring.secutiy.controlllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import poc.spring.secutiy.dtos.UserModelDto;
import poc.spring.secutiy.models.UserModel;
import poc.spring.secutiy.services.UserModelService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserModelController {

    @Autowired
    UserModelService service;
    @PostMapping()
    public ResponseEntity<UserModelDto> save(@RequestBody @Valid UserModelDto userModelDto){
        return new ResponseEntity<>(service.save(userModelDto), HttpStatus.CREATED);
    }


    @GetMapping("/all")
    public ResponseEntity<List<UserModel>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserModel> findById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }
}
