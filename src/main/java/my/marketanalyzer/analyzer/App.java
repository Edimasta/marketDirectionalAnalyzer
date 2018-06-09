package my.marketanalyzer.analyzer;

import my.marketanalyzer.analyzer.config.ConfigLoader;
import my.marketanalyzer.analyzer.config.OtherConfig;
import my.marketanalyzer.analyzer.config.ResourceConfig;

public class App {
    public static void main(String[] args) {
	System.out.println("Test");
	ResourceConfig configBean = ConfigLoader.getConfig(ResourceConfig.class);
	System.out.println("Resource Config");
	System.out.println(configBean.getAmount());
	System.out.println("Test");
	long currentTimeMillis = System.currentTimeMillis();
	OtherConfig configBean2 = ConfigLoader.getConfig(OtherConfig.class);
	System.out.println("loaded config in: " + (System.currentTimeMillis() - currentTimeMillis));
	System.out.println("Resource Config");
	System.out.println(configBean2.getAmount());
    }
}
