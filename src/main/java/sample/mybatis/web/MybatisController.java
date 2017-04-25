package sample.mybatis.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.mybatis.mappers.RosterMapper;

/**
 * Created by mark on 4/25/17.
 */

@RestController
public class MybatisController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    final private RosterMapper roster;

    public MybatisController(RosterMapper roster) {
        this.roster = roster;
    }

    @RequestMapping("/mybatis")
    public String getName(){
        return roster.findByName("Ken").toString();
    }
}
