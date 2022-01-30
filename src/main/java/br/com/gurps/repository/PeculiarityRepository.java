package br.com.gurps.repository;

import br.com.gurps.entity.Peculiarity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeculiarityRepository  extends MongoRepository<Peculiarity, String> {
}
