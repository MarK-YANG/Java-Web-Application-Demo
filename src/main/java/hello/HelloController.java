package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mark on 4/1/17.
 */

@RestController //@RestController combines @Controller and @ResponseBody, two annotations
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }
}
