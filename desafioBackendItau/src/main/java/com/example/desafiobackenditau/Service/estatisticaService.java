package com.example.desafiobackenditau.Service;

import com.example.desafiobackenditau.Controller.dto.estatisticaDto;
import com.example.desafiobackenditau.Controller.dto.transacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*"count": 10,
   "sum": 1234.56,
   "avg": 123.456,
   "min": 12.34,
   "max": 123.56*/

//nao usei o DoubleSummaryStatistics que o desafio deu de dica pq n sei usar kkkkkkkkkk
@Service
public class estatisticaService {
    public List<estatisticaDto> estatisticaDto = new ArrayList<>();
    @Autowired
    private transacaoService transacaoService;


    public int count(){
        return transacaoService.exibirTransacoes().size();
    }

    public double sum(){
        double valorTotal = 0;
        for(int i =0;i<count();i++){
            valorTotal+=transacaoService.exibirTransacoes().get(i).valor();
        }
        return valorTotal;
    }

    public double avg(){
        return sum()/count();
    }

    public double min(){
        double menorValor = 0;
        for(int i =0;i<count();i++){
            if(i==0){
                menorValor=transacaoService.exibirTransacoes().get(i).valor();
            }
            else if(transacaoService.exibirTransacoes().get(i).valor()<menorValor){
                menorValor=transacaoService.exibirTransacoes().get(i).valor();
            }
        }
        return menorValor;
    }

    public double max(){
        double maiorValor = 0;
        for(int i =0;i<count();i++){
            if(transacaoService.exibirTransacoes().get(i).valor()>maiorValor){
                maiorValor=transacaoService.exibirTransacoes().get(i).valor();
            }
        }
        return maiorValor;
    }

    public estatisticaDto estatistica(){
        estatisticaDto dto = new estatisticaDto(count(),sum(),avg(), min(), max());
        return dto;
    }
}
