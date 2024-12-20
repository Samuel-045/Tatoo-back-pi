package com.codigo.tatuadoraBackEnd.services;

import java.text.ParseException;

import com.codigo.tatuadoraBackEnd.entidades.Pessoa;
import com.codigo.tatuadoraBackEnd.repositorio.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import java.util.Arrays;

@Service
public class DBService {
    @Autowired
    private PessoaRepositorio pessoaRepositorio;

    @Bean
    public void instanciarDB() throws ParseException {

        Pessoa pessoa1 = new Pessoa("12341","505.467.808-57");
        Pessoa pessoa2 = new Pessoa("1234","111.111.111-22");

        //trocar os dados quando iniciar o programa

        pessoaRepositorio.saveAll(Arrays.asList(pessoa1, pessoa2));
    }

}

