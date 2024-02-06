package binjesytems.binjesusDemo.service;

import binjesytems.binjesusDemo.entity.UserEntity;
import binjesytems.binjesusDemo.repository.UserRepository;
import binjesytems.binjesusDemo.requestClasses.CreateUserRequest;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(CreateUserRequest createUserRequest) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(createUserRequest.getName());
        userEntity.setEmail(createUserRequest.getEmail());
        userEntity.setPhoneNumber(createUserRequest.getPhone());
        userRepository.save(userEntity);

    }
}
