package co.com.perficient.p2.services.impl;

import co.com.perficient.p2.model.dto.TeamDto;
import co.com.perficient.p2.model.mappers.TeamMapper;
import co.com.perficient.p2.repository.TeamRepository;
import co.com.perficient.p2.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * @author : Juank544
 * @date : 19/07/2022
 **/
@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

    @Autowired
    private final TeamMapper mapper;
    @Autowired
    private final TeamRepository teamRepository;

    @Override
    public TeamDto create(TeamDto teamDto) {
        return mapper.mapTeam(teamRepository.save(mapper.mapTeam(teamDto)));
    }

    @Override
    public List<TeamDto> findAll() {
        return teamRepository.findAll()
                .stream().map(mapper::mapTeam)
                .collect(Collectors.toList());
    }

    @Override
    public TeamDto findById(Long id) {
        return mapper.mapTeam(teamRepository.findById(id)
                .orElseThrow(NoSuchElementException::new));
    }

    @Override
    public TeamDto update(TeamDto newTeam, Long id) {
        //TODO revisar error (non-transient entity has a null id)
        TeamDto currentTeam = findById(id);
        currentTeam.setCar(newTeam.getCar());
        return mapper.mapTeam(teamRepository.save(mapper.mapTeam(currentTeam)));
    }

    @Override
    public void delete(Long id) {
        try {
            teamRepository.deleteById(id);
        } catch (NoSuchElementException e) {
            throw new RuntimeException(e);
        }
    }
}
