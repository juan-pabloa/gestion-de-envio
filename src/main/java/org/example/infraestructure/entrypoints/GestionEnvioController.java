package org.example.infraestructure.entrypoints;

import org.example.aplication.IGestionEnvioUseCase;
import org.example.domain.GestionEnvios;
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
    ResponseEntity<GestionEnvios> guardarEnvio (@RequestBody EnvioDTO envioDto){
        GestionEnvios GestionEnvios = envio.registrarEnvio(envioDto.toDomain(), envioDto.getTipoNotificacion());
      return new ResponseEntity<>(GestionEnvios, HttpStatus.CREATED);
    }

    @GetMapping("/actualizar-envio/{nombreEnvio}")
    ResponseEntity<GestionEnvios> actualizarEnvio (@PathVariable String nombreEnvio){
        return new ResponseEntity<>(envio.actualizarEnvio(nombreEnvio),HttpStatus.CREATED);
    }
}
