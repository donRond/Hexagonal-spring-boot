package br.com.rest.api.infrastructure.web;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rest.api.application.domain.port.inbound.ProductServicePort;
import br.com.rest.api.infrastructure.dtos.ProductDto;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;

/**
 * ProductController
 */

@RestController
@RequestMapping("/products")
public class ProductController {

  @Autowired
  ProductServicePort productServicePort;

  @PostMapping
  public ResponseEntity<ProductDto> save(@RequestBody @Valid ProductDto productDto) {
    return ResponseEntity.status(HttpStatus.CREATED).body(productServicePort.save(productDto));
  }

  @GetMapping("/{id}")
  public ResponseEntity<ProductDto> findById(@PathParam(value = "id") UUID id) {
    return ResponseEntity.status(HttpStatus.OK).body(productServicePort.findById(id));
  }

  // apenas via de teste para o lazygit
  @GetMapping
  public ResponseEntity<List<ProductDto>> findAll() {
    return ResponseEntity.status(HttpStatus.OK).body(productServicePort.findAll());
  }

}
