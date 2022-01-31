package br.com.gurps.repository;

import br.com.gurps.entity.Character;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacterRepository extends MongoRepository<Character, String> {
}
