package br.com.rest.api.application.domain.model;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * ProductModel
 */
public class ProductModel {

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
