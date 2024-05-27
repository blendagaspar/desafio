package entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Data
public class Cliente {


    @Id
    private String id;
    private String getId;
    private String nome;
    private int idade ;
    private String  email;
    private Endereco endereco;
    private Conta conta;
}
