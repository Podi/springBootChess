package edu.corvinus.springBootLottery.Repository;

import edu.corvinus.springBootLottery.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    // Ide kerülhetnek további egyedi lekérdezések, ha szükséges
}
