package binjesytems.binjesusDemo.service.auth;

import binjesytems.binjesusDemo.bo.auth.AuthenticationResponse;
import binjesytems.binjesusDemo.bo.auth.CreateLoginRequest;
import binjesytems.binjesusDemo.bo.auth.CreateSignupRequest;
import binjesytems.binjesusDemo.bo.auth.LogoutResponse;


public interface AuthService {

    void signup(CreateSignupRequest createSignupRequest);

    AuthenticationResponse login(CreateLoginRequest createLoginRequest);

    void logout(LogoutResponse logoutResponse);
}
