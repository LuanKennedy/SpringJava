package project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="vendedores")
public class Vendedor {
    
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private int jogosDisponiveis;
    private String email;
    private String cpf_cnpj;
    
    public Vendedor() {}
    public Vendedor(long id, String nome,int jogosDisponiveis, String email, String cpf_cnpj) {
        this.id = id;
        this.nome = nome;
        this.jogosDisponiveis = jogosDisponiveis;
        this.email = email;
        this.cpf_cnpj = cpf_cnpj;
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    
    public String getNome() { return nome; }
    public void setNome(String n) { nome = n; }
    
    public int getJogosDisponiveis() { return jogosDisponiveis; }
    public void setJogosDisponiveis(int jD) { jogosDisponiveis = jD; }
    
    public String getEmail() { return email; }
    public void setEmail(String e) { email = e; } 
    
    public String get_cpf_cnpj() { return cpf_cnpj; }
    public void set_cpf_cnpj(String pfPj) { cpf_cnpj = pfPj; }
    
}