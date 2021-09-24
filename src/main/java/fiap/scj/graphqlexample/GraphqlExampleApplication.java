package fiap.scj.graphqlexample;

import fiap.scj.graphqlexample.configs.GraphqlConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(GraphqlConfiguration.class)
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class GraphqlExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlExampleApplication.class, args);
    }

}
