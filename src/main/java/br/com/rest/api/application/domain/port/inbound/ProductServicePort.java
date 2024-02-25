package br.com.rest.api.application.domain.port.inbound;

import br.com.rest.api.infrastructure.dtos.ProductDto;

/**
 * ProductServicePort
 */
public interface ProductServicePort {
  ProductDto save(ProductDto productDto);
}
