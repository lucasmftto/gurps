package br.com.gurps.controller;

import br.com.gurps.dto.CharacterDTO;
import br.com.gurps.entity.Character;
import br.com.gurps.service.CharacterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/character")
@CrossOrigin("*")
public class CharacterController {

    Logger logger = LoggerFactory.getLogger(CharacterController.class);

    @Autowired
    private CharacterService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody CharacterDTO characterDTO) {
        MDC.put("Insert Character: ", String.valueOf(UUID.randomUUID()));

        this.service.insertCharacter(characterDTO);

        MDC.clear();
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Character>> findAll() {
        MDC.put("FindAdd Character: ", String.valueOf(UUID.randomUUID()));

        List<Character> result = this.service.findAll();

        MDC.clear();

        return ResponseEntity.status(HttpStatus.OK)
                .body(result);
    }
}
