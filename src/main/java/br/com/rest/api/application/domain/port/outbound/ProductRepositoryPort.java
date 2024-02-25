package br.com.rest.api.application.domain.port.outbound;

import br.com.rest.api.infrastructure.entities.ProductEntity;

/**
 * ProductRepositoryPort
 */
public interface ProductRepositoryPort {
  ProductEntity save(ProductEntity productEntity);
}
