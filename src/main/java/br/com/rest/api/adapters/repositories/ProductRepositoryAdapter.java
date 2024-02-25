package br.com.rest.api.adapters.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import br.com.rest.api.application.domain.port.outbound.ProductRepositoryPort;
import br.com.rest.api.infrastructure.entities.ProductEntity;
import br.com.rest.api.infrastructure.repositories.ProductRepository;

/**
 * ProductRepositoryAdapter
 */
public class ProductRepositoryAdapter implements ProductRepositoryPort {

  final private ProductRepository productRepository;

  public ProductRepositoryAdapter(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public ProductEntity save(ProductEntity productEntity) {
    return productRepository.save(productEntity);
  }

  @Override
  public ProductEntity findById(UUID id) {
    Optional<ProductEntity> optionalProdutEntity = productRepository.findById(id);
    return optionalProdutEntity.get();
  }

  @Override
  public List<ProductEntity> findAll() {
    return productRepository.findAll();
  }

}
