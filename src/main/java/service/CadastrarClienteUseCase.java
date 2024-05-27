package service;

import entities.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ports.CadastrarClienteInputPort;
import repository.ClienteRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class CadastrarClienteUseCase implements CadastrarClienteInputPort {

    private final ClienteRepository repository;

    public void criar(Cliente cliente){
        repository.insert(cliente);
    }
}
