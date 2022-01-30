package br.com.gurps.controller;

import br.com.gurps.dto.PeculiarityDTO;
import br.com.gurps.service.PeculiarityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/peculiarity")
@CrossOrigin("*")
public class PeculiarityController {

    Logger logger = LoggerFactory.getLogger(PeculiarityController.class);

    @Autowired
    private PeculiarityService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody PeculiarityDTO peculiarityDTO) {
        MDC.put("Insert peculiarity: ", String.valueOf(UUID.randomUUID()));

        this.service.insertPeculiarity(peculiarityDTO);

        MDC.clear();
    }
}
