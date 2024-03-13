package tailorApp1.tailorApp1.service.user;



import org.springframework.http.RequestEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import tailorApp1.tailorApp1.Entity.TailorEntity;
import tailorApp1.tailorApp1.Entity.UserEntity;
import tailorApp1.tailorApp1.bo.CreateSignupRequest;
import tailorApp1.tailorApp1.bo.user.GetUserRequest;
import tailorApp1.tailorApp1.repository.TailorRepository;
import tailorApp1.tailorApp1.repository.UserRepository;
import tailorApp1.tailorApp1.service.auth.UserDetailUtil;
import tailorApp1.tailorApp1.util.Request;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    private final TailorRepository tailorRepository;

    // private final RequestRepository requestRepository;


    public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder, TailorRepository tailorRepository, TailorRepository tailorRepository1) {
        this.userRepository = userRepository;

        this.bCryptPasswordEncoder = bCryptPasswordEncoder;

        this.tailorRepository = tailorRepository1;
    }

    @Override
    public void saveUser(CreateSignupRequest createSignupRequest) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(createSignupRequest.getUsername());

        userEntity.setPassword(createSignupRequest.getPassword());
        userEntity.setEmail(createSignupRequest.getEmail());
        userRepository.save(userEntity);

    }

    @Override
    public void submitRequest(Long tailorId) {

    }

    @Override
    public List<UserEntity> allUsers() {
        return null;
    }


//    @Override
//    public void submitRequest(Long garageId) {
//        UserEntity userEntity=userRepository.findById(UserDetailUtil.userDetails().getId())
//                .orElseThrow();
//        TailorEntity tailorEntity= tailorRepository.findById(tailorId)
//                .orElseThrow();
//        RequestEntity request= new RequestEntity();
//        request.setRequestStatus(Request.WAITING);
//        request.setVehicleModel(endUserEntity.getVehicleModel());
//        request.setVehicleType(endUserEntity.getVehicleType());
//        request.setVehicleYear(endUserEntity.getVehicleYear());
//        request.setGarageEntity(garageEntity);
//        request.setUserEntity(endUserEntity.getUserEntity());
//        requestRepository.save(request);
//    }


    @Override
    public GetUserRequest getUser(Long id) {
        UserEntity userEntity = userRepository.getById(id);
        GetUserRequest getUserRequest = new GetUserRequest();
        getUserRequest.setUsername(userEntity.getUsername());
        getUserRequest.setPassword(userEntity.getPassword());
        getUserRequest.setEmail(userEntity.getEmail());
        getUserRequest.setId(userEntity.getId());
        return getUserRequest;
    }

    @Override
    public List<TailorEntity> getAllTailors() {
        return null;
    }

}