package tailorApp1.tailorApp1.service.auth;

import tailorApp1.tailorApp1.bo.AuthinticationResponse;
import tailorApp1.tailorApp1.bo.CreateLoginRequest;
import tailorApp1.tailorApp1.bo.CreateSignupRequest;

public interface AuthService {
    void signup(CreateSignupRequest createSignupRequest);

    AuthinticationResponse login(CreateLoginRequest createLoginRequest);


}