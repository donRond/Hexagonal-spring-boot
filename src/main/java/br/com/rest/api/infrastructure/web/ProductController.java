package br.com.rest.api.infrastructure.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rest.api.application.domain.port.inbound.ProductServicePort;
import br.com.rest.api.infrastructure.dtos.ProductDto;
import jakarta.validation.Valid;

/**
 * ProductController
 */

@RestController
@RequestMapping("/products")
public class ProductController {

  @Autowired
  ProductServicePort productServicePort;

  public ResponseEntity<ProductDto> save(@RequestBody @Valid ProductDto productDto) {
    return ResponseEntity.status(HttpStatus.OK).body(productServicePort.save(productDto));
  }

}
