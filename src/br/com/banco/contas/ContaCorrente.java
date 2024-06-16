package br.com.banco.contas;

import br.com.banco.clientes.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia=" + getAgencia() +
                ", numero=" + getNumero() +
                ", saldo=" + getSaldo() +
                ", cliente=" + getCliente().getNome() +
                '}';
    }
}
