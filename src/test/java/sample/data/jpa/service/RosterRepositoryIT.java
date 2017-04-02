package sample.data.jpa.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sample.data.jpa.domain.Roster;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by mark on 4/2/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RosterRepositoryIT {

    @Autowired
    RosterRepository rosterRepository;

    @Test
    public void findRosters() throws Exception{
        Roster r = this.rosterRepository.findByName("Mark");
        assertThat(r.getEmail().equals("1@123.com"));
    }
}
