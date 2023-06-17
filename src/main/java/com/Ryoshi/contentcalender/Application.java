package com.Ryoshi.contentcalender;

import com.Ryoshi.contentcalender.config.ContentCalendarProperties;
import com.Ryoshi.contentcalender.model.Content;
import com.Ryoshi.contentcalender.model.Status;
import com.Ryoshi.contentcalender.model.Type;
import com.Ryoshi.contentcalender.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
@EnableConfigurationProperties(ContentCalendarProperties.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository){
		return args -> {
			Content c = new Content(
					null,
					"NEW DSASA",
					"ADSDSADSDSADSADSADSADDSADSADSA",
					Status.IDEA,
					Type.ARTICLE,
					LocalDateTime.now(),
					null,
					"");
			repository.save(c);
		};
	}

}
