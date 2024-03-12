package tailorApp1.tailorApp1.service.superAdmin;

import tailorApp1.tailorApp1.Entity.TailorEntity;
import tailorApp1.tailorApp1.bo.tailor.CreateTailorRequest;

import java.util.List;

public interface SuperAdminService {
    List<TailorEntity> getAllTailor();


    void addTailor(CreateTailorRequest createGarageRequest);


}