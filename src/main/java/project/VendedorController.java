package project;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.*;

@RestController
class VendedorController {
    
    @Autowired
    private VendedorRepo vendedorRepo;
    public VendedorController () {}
    
    @GetMapping("/api/vendedores")
    Iterable<Vendedor> getVendedores () {return vendedorRepo.findAll(); }
    
    @GetMapping("/api/vendedores/{id}")
    Optional<Vendedor> getVendedor (@PathVariable long id) {return vendedorRepo.findById(id); }
    
    @PostMapping("/api/vendedores")
    Vendedor createVendedor(@RequestBody Vendedor v) {return vendedorRepo.save(v); }
    
    @PutMapping("/api/vendedores/{vendedoresId}")
    Optional<Vendedor> updateVendedor(@RequestBody Vendedor vendedor, @PathVariable long vendedoresId) {
        Optional<Vendedor> opt = this.getVendedor(vendedoresId);
        if (opt.isPresent() && opt.get().getId() == vendedor.getId()) {return Optional.of(vendedorRepo.save(vendedor));}
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao alterar dados do vendedor com id " + vendedoresId);
    }
    
    @DeleteMapping(value = "/api/vendedores/{id}")
    void deleteVendedor(@PathVariable long id) {vendedorRepo.deleteById(id);}
}