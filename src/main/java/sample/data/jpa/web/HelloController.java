package sample.data.jpa.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sample.data.jpa.service.RosterService;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by mark on 4/1/17.
 */

@Controller //@RestController combines @Controller and @ResponseBody, two annotations
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private RosterService rosterService;

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        logger.debug("This is a debug message");
        logger.info("This is a info message");
        logger.warn("This is a warn message");
        logger.error("This is a error message");
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/data")
    @ResponseBody
    @Transactional(readOnly = true)
    public String dataJPA(){
        return this.rosterService.findByName("Mark").toString();
    }

    
}
