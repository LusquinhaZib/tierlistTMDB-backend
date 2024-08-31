package com.lusquinhazib.tierlist.controller;

import com.lusquinhazib.tierlist.controller.response.CarroResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("/ping")
    public CarroResponse ping(){
        var carro = new CarroResponse();
        carro.setVelocidade(100);
        carro.setMarca("Volquis");
        return carro;
    }

}
