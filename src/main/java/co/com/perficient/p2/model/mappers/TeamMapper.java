package co.com.perficient.p2.model.mappers;

import co.com.perficient.p2.model.dto.TeamDto;
import co.com.perficient.p2.model.entities.Team;
import org.mapstruct.Mapper;

/**
 * @author : Juank544
 * @date : 24/08/2022
 **/
@Mapper
public interface TeamMapper {
    Team mapTeam(TeamDto teamDto);
    TeamDto mapTeam(Team team);
}
