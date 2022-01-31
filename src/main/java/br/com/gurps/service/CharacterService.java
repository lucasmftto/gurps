package br.com.gurps.service;

import br.com.gurps.dto.CharacterDTO;
import br.com.gurps.entity.Character;

import java.util.List;

public interface CharacterService {
    void insertCharacter(CharacterDTO characterDTO);

    List<Character> findAll();
}
