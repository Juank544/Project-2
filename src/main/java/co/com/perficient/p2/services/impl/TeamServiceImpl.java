package co.com.perficient.p2.services.impl;

import co.com.perficient.p2.dto.TeamDto;
import co.com.perficient.p2.model.Team;
import co.com.perficient.p2.repository.TeamRepository;
import co.com.perficient.p2.services.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Juank544
 * @date : 19/07/2022
 **/
@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public Team create(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    @Override
    public Team findById(Long id) {
        return teamRepository.findById(id).isPresent() ? teamRepository.findById(id).get() : null;
    }

    @Override
    public Team update(TeamDto newTeam, Long id) {
        Team currentTeam = findById(id);
        currentTeam.setCar(newTeam.getCar());
        return teamRepository.save(currentTeam);
    }

    @Override
    public void delete(Long id) {
        teamRepository.deleteById(id);
    }
}
