package br.com.rest.api.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import br.com.rest.api.adapters.repositories.ProductRepositoryAdapter;
import br.com.rest.api.infrastructure.repositories.ProductRepository;

/**
 * ProductRepositoryConfig
 */
@Component
public class ProductRepositoryConfig {

  @Bean
  public ProductRepositoryAdapter productRepositoryAdapter(ProductRepository productRepository) {
    return new ProductRepositoryAdapter(productRepository);
  }

}
