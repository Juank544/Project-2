package co.com.perficient.p2.controllers;

import co.com.perficient.p2.model.dto.TeamDto;
import co.com.perficient.p2.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping
    public ResponseEntity<TeamDto> create(@RequestBody TeamDto teamDto){
        return new ResponseEntity<>(teamService.create(teamDto),HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TeamDto>> findAll(){
        return ResponseEntity.ok(teamService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeamDto> findById(@PathVariable Long id){
        return ResponseEntity.ok(teamService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TeamDto> update(@RequestBody TeamDto teamDto, @PathVariable Long id){
        return ResponseEntity.ok(teamService.update(teamDto, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        teamService.delete(id);
        return ResponseEntity.ok().build();
    }
}
