package br.com.banco;

import br.com.banco.clientes.Cliente;
import br.com.banco.contas.Conta;
import br.com.banco.contas.ContaCorrente;
import br.com.banco.contas.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00");

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente2);

        cc.depositar(1000);
        poupanca.depositar(500);

        cc.transferir(200, poupanca);

        System.out.println(cc);
        System.out.println(poupanca);
    }
}
