package org.example.infraestructure.entrypoints;

import org.example.domain.exception.EnvioException;
import org.example.domain.exception.ResponseError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


import java.time.LocalDateTime;

@ControllerAdvice
public class GestionEnvioControllerAdvice {


    @ExceptionHandler(EnvioException.class)
    public ResponseEntity<ResponseError> handlePesoInvalidoException (EnvioException ex){
        ResponseError error = new ResponseError();
        error.setMessage(ex.getMessage());
        error.setStatus(400);
        error.setDate(LocalDateTime.now());
        return ResponseEntity.badRequest().body(error);
    }
}
