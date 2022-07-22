package co.com.perficient.p2.controllers;

import co.com.perficient.p2.dto.TeamDto;
import co.com.perficient.p2.model.Team;
import co.com.perficient.p2.services.TeamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Juank544
 * @date : 21/07/2022
 **/
@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping
    public ResponseEntity<Team> create(@RequestBody Team team){
        return new ResponseEntity<>(teamService.create(team),HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Team>> findAll(){
        return ResponseEntity.ok(teamService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Team> findById(@PathVariable Long id){
        if (teamService.findById(id) != null) {
            return ResponseEntity.ok(teamService.findById(id));
        } return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Team> update(@RequestBody TeamDto teamDto, @PathVariable Long id){
        return ResponseEntity.ok(teamService.update(teamDto, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        teamService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
