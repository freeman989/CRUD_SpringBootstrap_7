package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages="web.repository")
@EnableTransactionManagement
@EntityScan(basePackages="web.model")
public class SpringBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootstrap.class, args);
    }
}
