package org.example.infraestructure;

import org.example.aplication.GestionEnvioUseCase;
import org.example.aplication.IGestionEnvioUseCase;
import org.example.domain.EnvioAereo;
import org.example.domain.EnvioMaritimo;
import org.example.domain.EnvioTerrestre;
import org.example.domain.TipoEnvio;
import org.example.domain.gateway.IGestionEnvioGateway;
import org.example.infraestructure.drivenadapters.EnviosRepository;
import org.example.infraestructure.drivenadapters.IEnviosRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBean {

    @Bean
    public TipoEnvio envioAereo() {
        return new EnvioAereo();
    }

    @Bean
    public TipoEnvio envioTerrestre() {
        return new EnvioTerrestre();
    }

    @Bean
    public TipoEnvio envioMaritimo() {
        return new EnvioMaritimo();
    }

    @Bean
    public IGestionEnvioUseCase iGestionEnvioUseCase(IGestionEnvioGateway iGestionEnvioGateway, TipoEnvio tipoEnvio){
        return new GestionEnvioUseCase(iGestionEnvioGateway, tipoEnvio);
    }

    @Bean
    public IGestionEnvioGateway iGestionEnvioGateway(IEnviosRepository repository){
        return new EnviosRepository(repository);
    };

}
