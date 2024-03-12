package tailorApp1.tailorApp1.controller.auth;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tailorApp1.tailorApp1.bo.AuthinticationResponse;
import tailorApp1.tailorApp1.bo.CreateLoginRequest;
import tailorApp1.tailorApp1.bo.CreateSignupRequest;
import tailorApp1.tailorApp1.service.auth.AuthService;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public ResponseEntity<String> createUser(@RequestBody CreateSignupRequest createSignupRequest){
        authService.signup(createSignupRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("User Created");
    }

    @PostMapping("/signin")
    public ResponseEntity<AuthinticationResponse> login(@RequestBody CreateLoginRequest createLoginRequest){
        AuthinticationResponse response=authService.login(createLoginRequest);
        HttpStatus status= HttpStatus.OK;
        if (response == null){
            status= HttpStatus.BAD_REQUEST;
        }

        return new ResponseEntity<>(response, status);
    }

//    @PostMapping("/logout")
//    public ResponseEntity<Void> logout(@RequestBody LogoutResponse logoutResponse){
//        authService.logout(logoutResponse);
//        return new ResponseEntity<>(HttpStatus.OK);
//   }
}