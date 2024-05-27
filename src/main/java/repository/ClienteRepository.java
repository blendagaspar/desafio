package repository;

import entities.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

    public Optional<Cliente> findById(String id);

    public void deleteById(String id);
}
