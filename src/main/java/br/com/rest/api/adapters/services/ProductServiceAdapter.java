package br.com.rest.api.adapters.services;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.rest.api.application.domain.port.inbound.ProductServicePort;
import br.com.rest.api.infrastructure.dtos.ProductDto;
import br.com.rest.api.infrastructure.entities.ProductEntity;
import br.com.rest.api.application.domain.port.outbound.ProductRepositoryPort;
import br.com.rest.api.application.domain.port.inbound.mapper.ProductMapperPort;

/**
 * ProductServiceAdapter
 */
public class ProductServiceAdapter implements ProductServicePort {

  private final ProductRepositoryPort productRepositoryPort;
  private final ProductMapperPort productMapperPort;

  public ProductServiceAdapter(ProductRepositoryPort productRepositoryPort, ProductMapperPort productMapperPort) {
    this.productRepositoryPort = productRepositoryPort;
    this.productMapperPort = productMapperPort;
  }

  @Override
  public ProductDto save(ProductDto productDto) {
    return productMapperPort.toDto(productRepositoryPort.save(productMapperPort.toEntity(productDto)));
  }

  @Override
  public ProductDto findById(UUID id) {
    return productMapperPort.toDto(productRepositoryPort.findById(id));
  }

  @Override
  public List<ProductDto> findAll() {

    List<ProductEntity> listProductEntity = productRepositoryPort.findAll();
    List<ProductDto> listProductDto = listProductEntity.stream()
        .map(productEntity -> productMapperPort.toDto(productEntity)).collect(Collectors.toList());

    return listProductDto;
  }

}
