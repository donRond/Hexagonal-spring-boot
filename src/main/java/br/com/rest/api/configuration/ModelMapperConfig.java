package br.com.rest.api.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.rest.api.adapters.mapper.ModelMapperAdapter;

/**
 * ModelMapperConfig
 */
@Configuration
public class ModelMapperConfig {

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

  @Bean
  public ModelMapperAdapter modelMapperAdapter(ModelMapper modelMapper) {
    return new ModelMapperAdapter(modelMapper);
  }

}
