package br.com.catalogo.modelo;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DodosDoAutor(@JsonAlias("name") String autor,
                           @JsonAlias("birth_year") Integer anoNascimento,
                           @JsonAlias("death_year") Integer anoFalecimento) {
}
