package tailorApp1.tailorApp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tailorApp1.tailorApp1.Entity.TailorEntity;

@Repository
public interface TailorRepository extends JpaRepository<TailorEntity,Long> {

}