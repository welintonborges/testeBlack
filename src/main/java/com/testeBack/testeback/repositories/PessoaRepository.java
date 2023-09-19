package com.testeBack.testeback.repositories;


import com.testeBack.testeback.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository  extends JpaRepository<Pessoa, Integer> {
}
