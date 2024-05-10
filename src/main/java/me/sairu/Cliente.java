package me.sairu;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Cliente {

    private Banco banco;
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private String senha;
}