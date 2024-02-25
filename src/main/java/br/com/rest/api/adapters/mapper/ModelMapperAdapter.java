package br.com.rest.api.adapters.mapper;

import org.modelmapper.ModelMapper;

import br.com.rest.api.application.domain.port.inbound.mapper.ProductMapperPort;
import br.com.rest.api.infrastructure.dtos.ProductDto;
import br.com.rest.api.infrastructure.entities.ProductEntity;

/**
 * ModelMapperAdapter
 */
public class ModelMapperAdapter implements ProductMapperPort {

  private ModelMapper modelMapper;

  public ModelMapperAdapter(ModelMapper modelMapper) {
    this.modelMapper = modelMapper;
  }

  @Override
  public ProductDto toDto(ProductEntity productEntity) {
    return modelMapper.map(productEntity, ProductDto.class);
  }

  @Override
  public ProductEntity toEntity(ProductDto productDto) {
    ProductEntity productEntity = modelMapper.map(productDto, ProductEntity.class);
    return productEntity;
  }

}
