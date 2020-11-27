package br.matos.spring02.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.matos.spring02.dto.UserDto;
import br.matos.spring02.model.User;

public interface UserDAO extends CrudRepository<User, Integer>{

    public User findByEmail(String email);

    @Query(value = "Select new UserDto(u.nome, u.email) from User u where u.cod = :cod")
    public UserDto buscaPorId(@Param("cod") Integer cod);

}
    

