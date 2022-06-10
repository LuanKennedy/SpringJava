package project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="jogos")
public class Jogo {
    
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private Double preco;
    private boolean disponivel;
    
    public Jogo() {}
    public Jogo(long id, String nome, Double preco, boolean disponivel) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.disponivel = disponivel;
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
    public String getNome() { return nome; }
    public void setNome(String n) { nome = n; }
    
    public Double getPreco() { return preco; }
    public void setPreco(Double p) { preco = p; }
    
    public boolean getDisponivel() { return disponivel; }
    public void setDisponivel(boolean d) { disponivel = d; }    
}