package org.example.infrastructure.entrypoints;

import org.example.application.IGestionEnvioUseCase;
import org.example.domain.GestionEnvios;
import org.example.infrastructure.EnvioDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    ResponseEntity<List<GestionEnvios>> actualizarEnvio (@PathVariable String nombreEnvio, @RequestParam String nombreNuevo){
        return new ResponseEntity<>(envio.actualizarEnvio(nombreEnvio, nombreNuevo),HttpStatus.CREATED);
    }
}
