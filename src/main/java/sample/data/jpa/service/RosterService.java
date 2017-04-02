package sample.data.jpa.service;

import sample.data.jpa.domain.Roster;

import java.util.List;

/**
 * Created by mark on 4/2/17.
 */
public interface RosterService {
    List<Roster> findList();
    Roster findByName(String name);
}
