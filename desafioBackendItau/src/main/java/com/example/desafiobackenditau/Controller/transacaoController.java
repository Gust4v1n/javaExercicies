package com.example.desafiobackenditau.Controller;

import com.example.desafiobackenditau.Controller.dto.transacaoDto;
import com.example.desafiobackenditau.Service.transacaoService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transacao")
@RequiredArgsConstructor
public class transacaoController {
    private transacaoDto transacaoDto;

    @Autowired
    private transacaoService transacaoService;

    @PostMapping
    public void registrarTransacao(@RequestBody transacaoDto dto){
        transacaoService.registrarTransacao(dto);
    }

    @GetMapping
    public List<transacaoDto> verTransacao(){
        return transacaoService.exibirTransacoes();
    }

    @DeleteMapping
    public void limparTransacoes(){
        transacaoService.limparTransacoes();
    }
}
