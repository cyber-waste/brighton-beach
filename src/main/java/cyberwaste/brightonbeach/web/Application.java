package cyberwaste.brightonbeach.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan
@EnableAutoConfiguration
@ImportResource({
    "applicationContext-jpa.xml", "applicationContext-security.xml", 
    "applicationContext-webflow.xml", "applicationContext-webmvc.xml"
})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
