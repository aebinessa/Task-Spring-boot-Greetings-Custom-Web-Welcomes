package binjesytems.binjesusDemo.service.user;

import binjesytems.binjesusDemo.Enums.Status;
import binjesytems.binjesusDemo.bo.user.UpdateUserStatusRequest;
import binjesytems.binjesusDemo.entity.UserEntity;
import binjesytems.binjesusDemo.repository.UserRepository;
import binjesytems.binjesusDemo.bo.user.CreateUserRequest;
import binjesytems.binjesusDemo.service.user.UserService;
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

    @Override
    public void updateUserStatus(Long userID, UpdateUserStatusRequest updateUserStatusRequest) {
        UserEntity userEntity=userRepository.findById(userID)
                .orElseThrow();
        if(!updateUserStatusRequest.getStatus().equals("ACTIVE") && !updateUserStatusRequest.getStatus().equals("INACTIVE")){
            throw new IllegalArgumentException("The status should be ACTIVE or INACTIVE");
        }
        userEntity.setStatus(Status.valueOf(updateUserStatusRequest.getStatus()));
        userRepository.save(userEntity);

    }
}
