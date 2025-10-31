package com.senac.doador.FeignClient;

import com.senac.doador.Dto.DoacaoDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


    @FeignClient(name = "Otavio", url = "10.136.64.201",path = "/api/doacao")
    public interface DoacaoFeignClient {

        @GetMapping ("/criarDoacaoPorID")
        DoacaoDto criarDoacaoPorId();
    }


