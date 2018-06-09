package my.marketanalyzer.analyzer.config;

import java.util.HashMap;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class ConfigLoader {
    private static HashMap<Class<?>, AnnotationConfigApplicationContext> configToContextMapper = new HashMap<>();

    public static <T extends Config> T getConfig(Class<T> configClass) {
	AnnotationConfigApplicationContext context = configToContextMapper.get(configClass);
	if (context == null) {
	    context = loadContextInitially(configClass);
	    configToContextMapper.put(configClass, context);
	    // test
	}
	return context.getBean(configClass);
    }

    private static AnnotationConfigApplicationContext loadContextInitially(Class<?> configClass) {
	return new AnnotationConfigApplicationContext(configClass);
    }
}

/**
 * Marker interface for Configuration classes
 * 
 * @author Edi
 *
 */
@Configuration
interface Config {
}
