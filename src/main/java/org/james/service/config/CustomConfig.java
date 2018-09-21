package org.james.service.config;

import org.james.service.model.SequenceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {

	@Bean(initMethod = "init", destroyMethod = "des")
	public SequenceBean sequenceBean() {
		return new SequenceBean();
	}

}
