package com.testeBack.testeback.services;



import com.testeBack.testeback.domain.Pessoa;
import com.testeBack.testeback.dto.PessoaDTO;
import com.testeBack.testeback.exceptions.ObjectNotFoundException;
import com.testeBack.testeback.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;


import java.util.Optional;


@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public Pessoa find(Integer id){
        Optional<Pessoa> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Pessoa não encontrado! Id: " + id + ", Tipo: " + Pessoa.class.getName()));
    }

    public Pessoa insert(Pessoa obj) {
        obj.setId(null);
        return repository.save(obj);
    }

  public Pessoa update(Pessoa obj) {
    find(obj.getId());
    return repository.save(obj);
  }

  public void delete(Integer id) {
    find(id);
    try {
      repository.deleteById(id);
    }catch (DataIntegrityViolationException e){
      throw  new DataIntegrityViolationException("Não é possivel excluir essa Pessoa");
    }

  }
    public Pessoa fromDto(PessoaDTO objDto) {
        return new Pessoa(objDto.getId(), objDto.getNome(), objDto.getEmail(), objDto.getSenha(), objDto.getConfirmaSenha());
    }
}
