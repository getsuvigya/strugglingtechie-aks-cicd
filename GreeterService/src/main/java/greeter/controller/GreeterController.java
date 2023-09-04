package greeter.controller;

import greeter.GreetingCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GreeterController {
    @Autowired
    RestTemplate restTemplate;
    /*@GetMapping("/greetingcard/{id}")
    public GreetingCard getGreetingCardDetails(@PathVariable("id")String id){
        return restTemplate.getForEntity("http://greeting-cards-service.default.svc.cluster.local:9093/greetingcard/"+id, GreetingCard.class).getBody();
    }*/
    @GetMapping("/greetingcard/{id}")
    public String getGreetingCardDetails(@PathVariable("id")String id){
        return "Hello "+id;
    }
}
