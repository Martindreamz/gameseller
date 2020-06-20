package repo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import repo.Model.Game;

public interface GameRepository extends JpaRepository<Game, Integer>{

}
