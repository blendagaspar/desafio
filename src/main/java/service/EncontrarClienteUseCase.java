package service;

import entities.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ports.EncontrarClienteInputPort;
import repository.ClienteRepository;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class EncontrarClienteUseCase implements EncontrarClienteInputPort {

    private final ClienteRepository repository;

    @Override
    public Optional<Cliente> find(String id) {
       return repository.findById(id);
    }
}
