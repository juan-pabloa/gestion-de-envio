package org.example.aplication;

import org.example.domain.*;
import org.example.domain.gateway.IGestionEnvioGateway;

    public class GestionEnvioUseCase implements IGestionEnvioUseCase {

        private IGestionEnvioGateway iGestionEnvioGateway;
        private TipoEnvio tipoEnvio;

        public GestionEnvioUseCase (IGestionEnvioGateway iGestionEnvioGateway, TipoEnvio tipoEnvio){
          this.iGestionEnvioGateway = iGestionEnvioGateway;
          this.tipoEnvio = tipoEnvio;
        }

        @Override
        public String registrarEnvio(GestionEnvios envio) {
            GestionEnvios envioObj = new GestionEnvios();
            envioObj.setNombreEnvio(envio.getNombreEnvio());
            envioObj.setEstadoEnvio(EstadoEnvio.CREADO.name());
            envioObj.setTipoEnvio(envio.getTipoEnvio());
            envioObj.setValorEnvio(calcularEnvio(envio.getPeso(), envio.getTipoEnvio()));
           return iGestionEnvioGateway.registrarEnvio(envio);
        }

        @Override
        public double calcularEnvio(double peso, String tipoEnvio) {
         if (tipoEnvio.equals(Constantes.AEREO)){
          return this.tipoEnvio.calcularEnvio(peso);
         }
         return 0;
        }

        @Override
        public void notificarEnvio() {

        }
    }
