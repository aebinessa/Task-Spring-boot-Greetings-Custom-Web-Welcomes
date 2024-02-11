package binjesytems.binjesusDemo.service.user;

import binjesytems.binjesusDemo.bo.user.CreateUserRequest;
import binjesytems.binjesusDemo.bo.user.UpdateUserStatusRequest;

public interface UserService {
    void saveUser(CreateUserRequest createUserRequest);

    void updateUserStatus(Long userID, UpdateUserStatusRequest updateUserStatusRequest);

}
