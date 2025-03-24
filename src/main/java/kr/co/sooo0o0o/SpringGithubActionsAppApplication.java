package kr.co.sooo0o0o;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringGithubActionsAppApplication {

    @Value("${spring.application.name}")
    private String appName;
    @Value("${app.version}")
    private String appVersion;


    public static void main(String[] args) {
        SpringApplication.run(SpringGithubActionsAppApplication.class, args);
    }

    @GetMapping("/")
    public String index(){
        return appName+"-"+appVersion;
    }

}
