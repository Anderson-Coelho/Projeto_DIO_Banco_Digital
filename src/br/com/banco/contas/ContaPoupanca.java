package br.com.banco.contas;

import br.com.banco.clientes.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + getAgencia() +
                ", numero=" + getNumero() +
                ", saldo=" + getSaldo() +
                ", cliente=" + getCliente().getNome() +
                '}';
    }
}
