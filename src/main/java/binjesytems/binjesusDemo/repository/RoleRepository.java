package binjesytems.binjesusDemo.repository;

import binjesytems.binjesusDemo.Enums.Roles;
import binjesytems.binjesusDemo.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    RoleEntity findByTitle(Roles title);
}
