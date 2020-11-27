package br.matos.spring02.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // essa classe será amarzenada no BD
@Table(name = "user") //nome da tabela no BD

@Getter @Setter @NoArgsConstructor
public class User {

    @Id // este campo é chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //1,2,3,4......
    
    @Column(name = "codigo")
    private int cod;

    @Column(name = "nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "senha", length = 30, nullable = false)
    private String senha;

    /* public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    } */
    
    @OneToMany(mappedBy = "usuario")
    @JsonIgnoreProperties("usuario")
    private List<Anuncio> anuncios;

    public User(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
   
}
