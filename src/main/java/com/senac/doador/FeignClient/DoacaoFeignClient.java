package com.senac.doador.FeignClient;

import com.senac.doador.Dto.DoacaoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(name = "doacao", url = "10.136.64.12",path = "/api/doacoes")
    public interface DoacaoFeignClient {

        @GetMapping (value = "/obterdoacoesdousuarioporid/{id}")
        public ResponseEntity<List<DoacaoDto>> listarDoacaoPorId(Integer id);
    }


