package Freeing.discoveryservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/health-check")
    public String check(){
        return "eureka sever 정상 작동";
    }
}
