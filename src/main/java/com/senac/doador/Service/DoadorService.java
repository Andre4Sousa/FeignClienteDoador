package com.senac.doador.Service;


import com.senac.doador.Dto.CreateUserDto;
import com.senac.doador.Entity.Doador;
import com.senac.doador.Repository.DoadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoadorService {

    private final DoadorRepository doadorRepository;


    public DoadorService(DoadorRepository doadorRepository) {
        this.doadorRepository = doadorRepository;
    }

    public List<Doador> listarTodos() {
        return doadorRepository.findAll();
    }

    public Doador listarPorId(int id) {
        return doadorRepository.findById(id).orElse(null);
    }


    public Doador criarDoador(CreateUserDto createUserDto) {


        Doador novoDoador = new Doador();

        novoDoador.setId(createUserDto.id());
        novoDoador.setNome(createUserDto.nome());
        novoDoador.setEndereco(createUserDto.endereco());
        novoDoador.setStatus(1);

        doadorRepository.save(novoDoador);
        return novoDoador;
    }
}
