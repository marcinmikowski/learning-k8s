package pl.mikus.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearningK8sApplication {

    @GetMapping("/message")
    public String displayMessage() {
        return "Congratulations! You successfully deployed your application to Kubernetes.";
    }

    public static void main(String[] args) {
        SpringApplication.run(LearningK8sApplication.class, args);
    }

}
