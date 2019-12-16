package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApp {
    /**
     * -javaagent:/Users/backache/workspace/project/my/test-java-agent/spring-bean-agent/target/spring-bean-agent-1.0-SNAPSHOT.jar
     */
    public static void main(String[] args) {
        SpringApplication.run(WebApp.class, args);
    }
}
