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


import br.matos.spring02.dao.AnuncioDAO;
import br.matos.spring02.model.Anuncio;

@RestController
@CrossOrigin("*")
@RequestMapping("/anuncio")

public class AnuncioController {

    @Autowired
        private AnuncioDAO dao;

    @PostMapping("/new")
        public ResponseEntity<Anuncio> inserirAnuncio(@RequestBody Anuncio anuncio){
           Anuncio newAnuncio = dao.save(anuncio);

           return ResponseEntity.ok(newAnuncio);

        }

        @GetMapping("/id/{id}") // aqui vai a variavel para buscar no bd entre {}
        public ResponseEntity<Anuncio> buscaPorCodigo(@PathVariable int id){ // a variavel do metodo tem q ser msm da linha anterior
           Anuncio anuncio  = dao.findById(id).orElse(null);

           if (anuncio != null){
     
               return ResponseEntity.ok(anuncio);
           }
           return ResponseEntity.notFound().build();
        }

        @GetMapping ("/all")
        public List<Anuncio> listarTodos(){
            List<Anuncio> lista = (List<Anuncio>) dao.findAll();

            return lista;
        }

        @GetMapping("/value/{valor}")
        public List<Anuncio> listarPorValor(@PathVariable double valor){
            List<Anuncio> lista = (List<Anuncio>) dao.findByValorGreaterThan(valor);

            return lista;
        }
    
}
