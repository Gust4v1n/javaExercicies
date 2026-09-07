package com.example.desafiobackenditau.Controller.dto;
/*"count": 10,
   "sum": 1234.56,
   "avg": 123.456,
   "min": 12.34,
   "max": 123.56*/
public record estatisticaDto(int count, Double sum, Double avg, Double min, Double max) {
    public estatisticaDto{
        //se nao tiver transacao a media retorna NaN, isso faz retornar 0 :)
        if(avg.isNaN()){
            avg=0.0;
        }
    }
}
