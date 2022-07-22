package co.com.perficient.p2.services;

import co.com.perficient.p2.dto.TeamDto;
import co.com.perficient.p2.model.Team;

import java.util.List;

public interface TeamService {
    Team create(Team team);
    List<Team> findAll();
    Team findById(Long id);
    Team update(TeamDto teamDto, Long id);
    void delete(Long id);
}
