package com.senac.doador.Controller;

import com.senac.doador.Dto.CreateUserDto;
import com.senac.doador.Entity.Doador;
import com.senac.doador.Service.DoadorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doador")
@CrossOrigin("*")
public class DoadorController {

    private final DoadorService doadorService;

    public DoadorController(DoadorService doadorService) {
        this.doadorService = doadorService;
    }

    @GetMapping("/listar")
    public List<Doador> listarTodosDoadores() {
        return doadorService.listarTodos();
    }

    @PostMapping("/novo")
    public ResponseEntity<Doador> criarNovoDoador(@RequestBody CreateUserDto dto) {
        Doador doadorSalvo = doadorService.criarDoador(dto);
        return ResponseEntity.status(201).body(doadorSalvo);
    }
}