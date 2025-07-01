package com.exedee.omiga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@EnableJpaAuditing
@SpringBootApplication(scanBasePackages = {
		"com.exedee.omiga.core",
		"com.exedee.omiga.web",
		"com.exedee.omiga.integration"

})
@EnableJpaRepositories(basePackages = "com.exedee.omiga.core.repository")
@EntityScan(basePackages = "com.exedee.omiga.core.model")
public class OmigaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmigaApplication.class, args);
	}

}
