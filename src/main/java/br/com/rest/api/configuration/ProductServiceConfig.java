package br.com.rest.api.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.rest.api.adapters.services.ProductServiceAdapter;
import br.com.rest.api.application.domain.port.inbound.mapper.ProductMapperPort;
import br.com.rest.api.application.domain.port.outbound.ProductRepositoryPort;

/**
 * ProductServiceConfig
 */
@Configuration
public class ProductServiceConfig {

  @Bean
  public ProductServiceAdapter productServicePort(
      ProductRepositoryPort productRepositoryPort,
      ProductMapperPort productMapperPort) {
    return new ProductServiceAdapter(productRepositoryPort, productMapperPort);
  }

}
