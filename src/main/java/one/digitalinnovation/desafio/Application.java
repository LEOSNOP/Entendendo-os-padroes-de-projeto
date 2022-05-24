package one.digitalinnovation.desafio;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot via Spring initializr
 * com modulos:
 * Spring Data JPA
 * H2 Database
 * OpenFeign
 */
@EnableFeignClients
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
