package project;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.*;

@RestController
class JogoController {
    
    @Autowired
    private JogoRepo jogoRepo;
    public JogoController () {}
    
    @GetMapping("/api/jogos")
    Iterable<Jogo> getJogos () {return jogoRepo.findAll(); }
    
    @GetMapping("/api/jogos/{id}")
    Optional<Jogo> getJogo(@PathVariable long id) {return jogoRepo.findById(id); }
    
    @PostMapping("/api/jogos")
    Jogo createJogo(@RequestBody Jogo j) {return jogoRepo.save(j); }
    
    @PutMapping("/api/jogos/{jogosId}")
    Optional<Jogo> updateJogo(@RequestBody Jogo jogo, @PathVariable long jogosId) {
        Optional<Jogo> opt = this.getJogo(jogosId);
        if (opt.isPresent() && opt.get().getId() == jogo.getId()) {return Optional.of(jogoRepo.save(jogo));}
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Erro ao alterar dados do jogo com id " + jogosId);
    }
    
    @DeleteMapping(value = "/api/jogos/{id}")
    void deleteJogo(@PathVariable long id) {jogoRepo.deleteById(id);}
}