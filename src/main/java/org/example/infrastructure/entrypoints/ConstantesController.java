package org.example.infrastructure.entrypoints;

import org.example.application.IObtenerConstanteUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/constantes")
public class ConstantesController {

    private final IObtenerConstanteUseCase obtenerConstanteUseCase;

    public ConstantesController(IObtenerConstanteUseCase obtenerConstanteUseCase) {
        this.obtenerConstanteUseCase = obtenerConstanteUseCase;
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<String> obtenerConstante(@PathVariable String nombre) {
        String valor = obtenerConstanteUseCase.obtenerConstante(nombre);
        if (valor != null) {
            return ResponseEntity.ok(valor);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
