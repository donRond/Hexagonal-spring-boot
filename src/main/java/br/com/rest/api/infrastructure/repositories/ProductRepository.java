package br.com.rest.api.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rest.api.infrastructure.entities.ProductEntity;

/**
 * ProductRepository
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, UUID> {

}
