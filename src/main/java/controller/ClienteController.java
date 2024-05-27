package controller;

import entities.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ports.AtualizarClienteInputPort;
import ports.CadastrarClienteInputPort;
import ports.DeletarClienteInputPort;
import ports.EncontrarClienteInputPort;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    @Autowired
    private EncontrarClienteInputPort encontrarClienteInputPort;
    @Autowired
    private AtualizarClienteInputPort atualizarClienteInputPort;
    @Autowired
    private DeletarClienteInputPort deletarClienteInputPort;
    @Autowired
    private CadastrarClienteInputPort cadastrarClienteInputPort;


    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody Cliente cliente) {
        cadastrarClienteInputPort.criar(cliente);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Cliente>> findById(@PathVariable final String id) {
        var cliente = encontrarClienteInputPort.find(id);
        return ResponseEntity.ok().body(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id,@RequestBody Cliente cliente) {
        cliente.setId(id);
        atualizarClienteInputPort.update(cliente);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final String id) {
        deletarClienteInputPort.delete(id);
        return ResponseEntity.noContent().build();
    }
}
