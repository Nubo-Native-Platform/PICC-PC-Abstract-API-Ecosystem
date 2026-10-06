package com.nubons.nnp.sso.abs.mapper.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author Gourab Guha
 *
 */
@Configuration
public class MapperConfig {
	
	@Bean
	public ModelMapper modelMapper() {
		
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		
		return modelMapper;
	}
}
