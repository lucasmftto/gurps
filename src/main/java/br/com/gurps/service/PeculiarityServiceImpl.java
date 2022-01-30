package br.com.gurps.service;

import br.com.gurps.dto.PeculiarityDTO;
import br.com.gurps.entity.Peculiarity;
import br.com.gurps.repository.PeculiarityRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeculiarityServiceImpl implements PeculiarityService{

    @Autowired
    private PeculiarityRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void insertPeculiarity(PeculiarityDTO peculiarityDTO) {
        this.repository.save(mapper.map(peculiarityDTO, Peculiarity.class));
    }
}
