package tailorApp1.tailorApp1.controller.SuperAdmin;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tailorApp1.tailorApp1.Entity.TailorEntity;
import tailorApp1.tailorApp1.bo.tailor.CreateTailorRequest;
import tailorApp1.tailorApp1.service.superAdmin.SuperAdminService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/super_admin")
public class SuperAdminController {
    private final SuperAdminService superAdminService;

    public SuperAdminController(SuperAdminService superAdminService) {
        this.superAdminService = superAdminService;
    }



    @PostMapping("/add-tailor")
    public ResponseEntity<String> addTailor(@RequestBody CreateTailorRequest createTailorRequest) {
        superAdminService.addTailor(createTailorRequest);
        return ResponseEntity.ok("Added a Tailor");
    }





    @GetMapping("/tailor_list")
    public ResponseEntity<List<TailorEntity>> getAllGarages() {
        List<TailorEntity> allGarages = superAdminService.getAllTailor();
        return ResponseEntity.ok(allGarages);
    }



}