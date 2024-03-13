package tailorApp1.tailorApp1.service.user;

import tailorApp1.tailorApp1.Entity.TailorEntity;
import tailorApp1.tailorApp1.Entity.UserEntity;
import tailorApp1.tailorApp1.bo.CreateSignupRequest;
import tailorApp1.tailorApp1.bo.user.GetUserRequest;

import java.util.List;

public interface UserService {


    void saveUser(CreateSignupRequest createSignupRequest);



    void submitRequest(Long tailorId);


    List<UserEntity> allUsers();
    GetUserRequest getUser(Long id);
    List<TailorEntity> getAllTailors();

}