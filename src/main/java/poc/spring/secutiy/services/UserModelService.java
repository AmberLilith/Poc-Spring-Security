package poc.spring.secutiy.services;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poc.spring.secutiy.Cript;
import poc.spring.secutiy.dtos.UserModelDto;
import poc.spring.secutiy.models.UserModel;
import poc.spring.secutiy.repositories.UserModelRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserModelService {

    @Autowired
    UserModelRepository userModelRepository;

    public UserModelDto save(UserModelDto userModelDto){
        UserModel userModel = new UserModel(userModelDto.getName(), Cript.bCryptPasswordEncoder().encode(userModelDto.getPassword()));
        UserModel userModelResponse = userModelRepository.save(userModel);
        UserModelDto userModelDtoResponse = new UserModelDto();
        BeanUtils.copyProperties(userModelResponse, userModelDtoResponse);
        return userModelDtoResponse;
    }

//    public Optional<UserModel> findByName(String name){
//        return userModelRepository.findByName(name);
//    }

    public List<UserModel> findAll() {
        return userModelRepository.findAll();
    }

    public UserModel findById(Long userId) {
        return userModelRepository.findById(userId).orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
    }
}
