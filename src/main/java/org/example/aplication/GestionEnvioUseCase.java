package org.example.aplication;

import org.example.domain.*;
import org.example.domain.gateway.IGestionEnvioGateway;
import org.example.domain.gateway.IRegistrarNotificacionGateway;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GestionEnvioUseCase implements IGestionEnvioUseCase {

        private IGestionEnvioGateway iGestionEnvioGateway;
        private TipoEnvio tipoEnvio;
        private final Map<String, TipoEnvio> estrategias;
        private final IRegistrarNotificacionGateway notificacion;

        public GestionEnvioUseCase (IGestionEnvioGateway iGestionEnvioGateway, List<TipoEnvio> tipos, IRegistrarNotificacionGateway notificacion){
          this.iGestionEnvioGateway = iGestionEnvioGateway;
          this.tipoEnvio = tipoEnvio;
          this.notificacion = notificacion;
            this.estrategias = tipos.stream()
                    .collect(Collectors.toMap(
                            TipoEnvio::soporta,
                            Function.identity()
                    ));
        }

        @Override
        public GestionEnvios registrarEnvio(GestionEnvios envio, String tipoNotificacion) {
            GestionEnvios envioObj = new GestionEnvios();
            envioObj.setNombreEnvio(envio.getNombreEnvio());
            envioObj.setPeso(envio.getPeso());
            envioObj.setEstadoEnvio(EstadoEnvio.CREADO.name());
            envioObj.setTipoEnvio(envio.getTipoEnvio());
            envioObj.setValorEnvio(calcularEnvio(envio.getPeso(), envio.getTipoEnvio()));
            envioObj.setNotificacion(notificarEnvio(tipoNotificacion));
            envioObj.setTipoEnvio(envio.getTipoEnvio());
           return iGestionEnvioGateway.registrarEnvio(envioObj);
        }

        @Override
        public double calcularEnvio(double peso, String tipoEnvio) {

            TipoEnvio estrategia = estrategias.get(tipoEnvio);
            return estrategia.calcularEnvio(peso);
        }

        @Override
        public Notificacion notificarEnvio(String tipoNotificiacion) {
           if (tipoNotificiacion.equals("SMS")){
               System.out.println("se envio notificacion via sms");
           }else{
               System.out.println("se envio notificacion via email");
           }
           Notificacion notificacion = new Notificacion();
           notificacion.setFechaNotificacion(LocalDateTime.now());
           notificacion.setTipoNotificacion(tipoNotificiacion);
           return notificacion;
        }

    @Override
    public GestionEnvios actualizarEnvio(String nombreEnvio) {
       return iGestionEnvioGateway.registrarEnvio(iGestionEnvioGateway.actualizarEnvio(nombreEnvio));
    }

}
