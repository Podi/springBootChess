package edu.corvinus.springBootLottery.Repository;
import edu.corvinus.springBootLottery.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import edu.corvinus.springBootLottery.Entity.Role;
public interface PlayerRepository extends JpaRepository<Player, Long> {
    // Ide kerülhetnek további egyedi lekérdezések, ha szükséges
}
