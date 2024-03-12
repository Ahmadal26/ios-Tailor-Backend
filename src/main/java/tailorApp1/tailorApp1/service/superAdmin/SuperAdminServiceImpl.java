package tailorApp1.tailorApp1.service.superAdmin;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import tailorApp1.tailorApp1.Entity.RoleEntity;
import tailorApp1.tailorApp1.Entity.TailorEntity;
import tailorApp1.tailorApp1.Entity.UserEntity;
import tailorApp1.tailorApp1.bo.tailor.CreateTailorRequest;
import tailorApp1.tailorApp1.repository.RoleRepository;
import tailorApp1.tailorApp1.repository.TailorRepository;
import tailorApp1.tailorApp1.repository.UserRepository;
import tailorApp1.tailorApp1.util.Roles;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SuperAdminServiceImpl implements SuperAdminService{

    private final TailorRepository tailorRepository;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    private final RoleRepository roleRepository;

    private final UserRepository userRepository;

    public SuperAdminServiceImpl(TailorRepository tailorRepository, BCryptPasswordEncoder bCryptPasswordEncoder, RoleRepository roleRepository, UserRepository userRepository) {
        this.tailorRepository = tailorRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<TailorEntity> getAllTailor() {
        return tailorRepository.findAll();
    }





    @Override
    @Transactional
    public void addTailor(CreateTailorRequest createTailorRequest) {
        RoleEntity roleEntity= roleRepository.findRoleEntityByTitle(Roles.super_admin.name())
                .orElseThrow();
        UserEntity userEntity=new UserEntity();
        userEntity.setUsername(createTailorRequest.getUsername());
        userEntity.setEmail(createTailorRequest.getUsername());
        userEntity.setRoles(roleEntity);
        userEntity.setPassword(bCryptPasswordEncoder.encode(createTailorRequest.getPassword()));
        TailorEntity tailor = new TailorEntity();
        tailor.setTailorName(createTailorRequest.getTailorName());
        tailor.setConsultation(createTailorRequest.getConsultation());
        tailor.setLocation(createTailorRequest.getLocation());
        tailor.setDurationTime(createTailorRequest.getDurationTime());
        tailor.setGender(createTailorRequest.getGender());
        tailor.setImage(createTailorRequest.getImage());
        tailor.setAboutUs(createTailorRequest.getAboutus());
        tailor.setNumber(createTailorRequest.getNumber());
        tailor.setUserEntity(userEntity);

        tailorRepository.save(tailor);
        userRepository.save(userEntity);

    }


}