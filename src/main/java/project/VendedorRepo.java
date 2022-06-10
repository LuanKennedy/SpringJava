package project;

import org.springframework.data.repository.CrudRepository;
import java.util.*;


public interface VendedorRepo extends CrudRepository<Vendedor, Long> {
    Vendedor save(Vendedor v);
    Iterable<Vendedor> findAll();
    Optional<Vendedor> findById(Long id);
    void delete(Vendedor v);
}

