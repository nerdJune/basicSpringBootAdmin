package io.jh.localadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class LocalAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocalAdminApplication.class, args);
    }

}
