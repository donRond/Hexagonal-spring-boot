package br.com.rest.api.infrastructure.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import br.com.rest.api.application.domain.model.ProductModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * ProductEntity
 */
@Entity
@Table(name = "TB_PRODUCTS")
public class ProductEntity extends ProductModel implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;
  private String name;
  private String description;
  private BigDecimal value;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

}
