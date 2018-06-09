package my.marketanalyzer.analyzer.config;

import org.springframework.context.annotation.Bean;

public class ResourceConfig implements Config {
    @Bean
    public int getAmount() {
	return 3;
    }
}
