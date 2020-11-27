package br.matos.spring02.dto;

import br.matos.spring02.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDto {
    private String nome;
    private String email;

    
    

  /*   public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    } */

    public UserDto(User user){
        this.nome = user.getNome();
        this.email = user.getEmail();
    }
    
}
