package br.com.rest.api.application.domain.port.inbound;

import java.util.UUID;
import java.util.List;
import br.com.rest.api.infrastructure.dtos.ProductDto;

/**
 * ProductServicePort
 */
public interface ProductServicePort {
  ProductDto save(ProductDto productDto);

  ProductDto findById(UUID id);

  List<ProductDto> findAll();
}
