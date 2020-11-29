package se.datasektionen.calypso.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Config {

	private final String baseUrl;
	private final String apiKey;

	public Config(@Value("${APPLICATION_URL}") String baseUrl, @Value("${LOGIN2_KEY}") String apiKey) {
		this.baseUrl = baseUrl;
		this.apiKey = apiKey;
	}

}
