package service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ports.DeletarClienteInputPort;
import ports.EncontrarClienteInputPort;
import repository.ClienteRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class DeletarClienteUseCase implements DeletarClienteInputPort {

    private final ClienteRepository repository;

    private final EncontrarClienteInputPort findInputPort;


    @Override
    public void delete(String id) {
        findInputPort.find(id);
        repository.deleteById(id);

    }
}
