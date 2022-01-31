package br.com.gurps.service.impl;

import br.com.gurps.dto.CharacterDTO;
import br.com.gurps.entity.Character;
import br.com.gurps.repository.CharacterRepository;
import br.com.gurps.service.CharacterService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void insertCharacter(CharacterDTO characterDTO) {
        this.repository.save(mapper.map(characterDTO, Character.class));
    }

    @Override
    public List<Character> findAll() {
        return this.repository.findAll();
    }
}
