package dev.gustavvocruz.nba_zone.repository;

import dev.gustavvocruz.nba_zone.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
