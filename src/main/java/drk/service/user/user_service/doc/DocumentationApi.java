package drk.service.user.user_service.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DocumentationApi {

    @Bean
    public OpenAPI docApi () {
        return new OpenAPI().info(
                new Info()
                        .description("list all endpoints for API")
                        .title("DOCUMENTATION API User Service")
                        .version("1.0")
                        .contact(
                                new Contact().name("Daniel Kremes")
                                        .email("danielkremes06@gmail.com")
                        )
        );
    }
}
