package my.marketanalyzer.analyzer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherConfig implements Config {
    @Bean
    public int getAmount() {
	return 3;
    }
}
