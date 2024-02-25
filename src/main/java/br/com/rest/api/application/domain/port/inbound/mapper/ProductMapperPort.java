package br.com.rest.api.application.domain.port.inbound.mapper;

import br.com.rest.api.infrastructure.dtos.ProductDto;
import br.com.rest.api.infrastructure.entities.ProductEntity;

/**
 * ProductMapper
 */
public interface ProductMapperPort {

  ProductDto toDto(ProductEntity productEntity);

  ProductEntity toEntity(ProductDto productDto);
}
