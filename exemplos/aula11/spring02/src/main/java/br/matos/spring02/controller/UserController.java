package br.matos.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.matos.spring02.dao.UserDAO;
import br.matos.spring02.dto.UserDto;
import br.matos.spring02.model.User;


    @RestController
    @CrossOrigin("*")
    @RequestMapping("/user")

    public class UserController {

        @Autowired
        private UserDAO dao;

        // http://localhost:8080/user/id/1
        @GetMapping("/id/{id}") // aqui vai a variavel para buscar no bd entre {}
        public ResponseEntity<UserDto> buscaPorCodigo(@PathVariable int id){ // a variavel do metodo tem q ser msm da linha anterior
           User userFinded = dao.findById(id).orElse(null);

           if (userFinded != null){
               UserDto userdto = new UserDto (userFinded);
               return ResponseEntity.ok(userdto);
           }
           return ResponseEntity.notFound().build();
        }

       
        @PostMapping("/new")
        public ResponseEntity<User> inserirUsuario(@RequestBody User user){
           User newUser = dao.save(user);

           return ResponseEntity.ok(newUser);

        }

        @GetMapping("/all")
    public List<User> listarTodos(){
        List<User> lista = (List<User>) dao.findAll();

        return lista;
    }

    @PostMapping("/email")
    public ResponseEntity<UserDto> buscarPorEmail(@RequestBody User user){
        User userFinded = dao.findByEmail(user.getEmail());

        if(userFinded != null){
            UserDto userDto = new UserDto(userFinded);
            return ResponseEntity.ok(userDto);
        }
        return ResponseEntity.notFound().build();
    }

}


       

