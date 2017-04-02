package sample.data.jpa.service;

import org.springframework.stereotype.Component;
import sample.data.jpa.domain.Roster;

import javax.transaction.Transactional;
import java.util.List;


/**
 * Created by mark on 4/2/17.
 */
@Component("rosterService")
@Transactional
public class RosterServiceImpl implements RosterService {

    private final RosterRepository rosterRepository;

    public RosterServiceImpl(RosterRepository rosterRepository){
        this.rosterRepository = rosterRepository;
    }

    @Override
    public List<Roster> findList() {
        return rosterRepository.getAll();
    }

    @Override
    public Roster findByName(String name) {
        return rosterRepository.findByName(name);
    }

}
