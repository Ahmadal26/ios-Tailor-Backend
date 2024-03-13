package tailorApp1.tailorApp1.controller.user;




import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tailorApp1.tailorApp1.Entity.UserEntity;
import tailorApp1.tailorApp1.bo.user.GetUserRequest;
import tailorApp1.tailorApp1.service.user.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {

        this.userService = userService;

    }

    @GetMapping("/user-list")
    public List<UserEntity> getAllUsers() {
        return userService.allUsers();
    }


    @GetMapping("/get-user")
    public ResponseEntity<GetUserRequest> getUser(@RequestParam Long id) {
        GetUserRequest getUserRequest = userService.getUser(id);
        return ResponseEntity.ok().body(getUserRequest);
    }



    @PostMapping("/request")
    public ResponseEntity<String> submitRequest(@RequestParam Long tailorId) {
        userService.submitRequest(tailorId);
        return ResponseEntity.ok("User added a Request !!! ");
    }


}