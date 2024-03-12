package tailorApp1.tailorApp1.repository;
;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tailorApp1.tailorApp1.Entity.RoleEntity;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    @Query(value = "SELECT * FROM role r where r.title = :title",nativeQuery = true)
    Optional<RoleEntity> findRoleEntityByTitle(String title);}