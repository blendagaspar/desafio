package service;

import entities.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ports.AtualizarClienteInputPort;
import ports.EncontrarClienteInputPort;
import repository.ClienteRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class AtualizarClienteUseCase implements AtualizarClienteInputPort {

    private final ClienteRepository repository;

    private final EncontrarClienteInputPort findInputPort;

    @Override
    public void update(Cliente cliente) {
        findInputPort.find(cliente.getId());
        repository.save(cliente);
    }
}
