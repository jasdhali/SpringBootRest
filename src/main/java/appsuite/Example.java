package appsuite;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Example extends org.springframework.boot.web.support.SpringBootServletInitializer{

	@RequestMapping("/hello")
	public String home() {
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication app = new SpringApplication(Example.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return super.configure(builder);
	}*/
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

    private static Class<Example> applicationClass = Example.class;
}