package entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Conta {

    private String agencia;
    private String conta_corrente;
    private Integer saldo ;
    private Integer credito;
    private Integer debito;
}
