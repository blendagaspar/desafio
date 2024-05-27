package ports;

import entities.Cliente;

import java.util.Optional;

public interface EncontrarClienteInputPort {

    Optional<Cliente> find(String id);
}
