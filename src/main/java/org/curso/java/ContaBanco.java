package org.curso.java;

import java.util.Objects;
import java.util.StringJoiner;

public class ContaBanco {
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldoCliente;

    public ContaBanco(int numeroConta, String agencia, String nomeCliente, double saldoCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldoCliente = saldoCliente;
    }

    public ContaBanco() {
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaBanco that = (ContaBanco) o;
        return numeroConta == that.numeroConta && Objects.equals(agencia, that.agencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroConta, agencia);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "Olá ", "")
                .add(nomeCliente)
                .add("obrigado por criar uma conta em nosso banco")
                .add("sua agência é " + agencia)
                .add("conta " + numeroConta)
                .add("e seu saldo " + saldoCliente + " já esta disponível para saque")
                .toString();
    }
}
