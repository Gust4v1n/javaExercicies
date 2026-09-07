package com.example.desafiobackenditau.Service;
import com.example.desafiobackenditau.Controller.dto.transacaoDto;
import com.example.desafiobackenditau.Exeptions.Created;
import com.example.desafiobackenditau.Exeptions.UnprocessableEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class transacaoService {
    public List<transacaoDto> transacaoDto = new ArrayList<>();

    public void registrarTransacao(transacaoDto dto){
        if(dto.dataHora().isAfter(OffsetDateTime.now())){
            throw new UnprocessableEntity();
        }
        if(dto.valor()<0){
            throw new UnprocessableEntity();
        }
        transacaoDto.add(dto);
        throw new Created();
    }

    public void limparTransacoes(){
        transacaoDto.clear();
        throw new Created();
    }

    //pra ser usado em estatistica, e tbm pra ver no GET :)
    public List<transacaoDto> exibirTransacoes(){
        return transacaoDto;
    }

}
