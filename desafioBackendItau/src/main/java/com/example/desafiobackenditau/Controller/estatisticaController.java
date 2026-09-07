package com.example.desafiobackenditau.Controller;

import com.example.desafiobackenditau.Controller.dto.estatisticaDto;
import com.example.desafiobackenditau.Service.estatisticaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/estatistica")
@RestController
public class estatisticaController {
    @Autowired
    private estatisticaService estatisticaService;
    @GetMapping
    public estatisticaDto estatisticaController(){
        return estatisticaService.estatistica();
    }
}
