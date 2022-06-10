package project;

import org.springframework.data.repository.CrudRepository;
import java.util.*;


public interface JogoRepo extends CrudRepository<Jogo, Long> {
    Jogo save(Jogo j);
    Iterable<Jogo> findAll();
    Optional<Jogo> findById(Long id);
    void delete(Jogo j);
}
