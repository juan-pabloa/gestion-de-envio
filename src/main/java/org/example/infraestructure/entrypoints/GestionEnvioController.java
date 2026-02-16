package org.example.infraestructure.entrypoints;

import org.example.aplication.IGestionEnvioUseCase;
import org.example.infraestructure.EnvioDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/envio")
public class GestionEnvioController {

    private IGestionEnvioUseCase envio;

    public GestionEnvioController (IGestionEnvioUseCase envio){
       this.envio = envio;
    }

    @PostMapping("/registrar-envio")
    ResponseEntity guardarEnvio (@RequestBody EnvioDTO envioDto){
      String response = envio.registrarEnvio(envioDto.toDomain());
      return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
