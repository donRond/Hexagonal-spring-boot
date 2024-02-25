package br.com.rest.api.application.domain.port.outbound;

import java.util.List;
import java.util.UUID;

import br.com.rest.api.infrastructure.entities.ProductEntity;

/**
 * ProductRepositoryPort
 */
public interface ProductRepositoryPort {
  ProductEntity save(ProductEntity productEntity);

  ProductEntity findById(UUID id);

  List<ProductEntity> findAll();
}
