package sample.data.jpa.service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sample.data.jpa.domain.Roster;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by mark on 4/2/17.
 */
@Transactional
public interface RosterRepository extends CrudRepository<Roster, Long> {


    @Query("select r from Roster r")
    List<Roster> getAll();

    Roster findByName(String name);
}
