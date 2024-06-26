package br.edu.up.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
    private String Nome;
    private String Telefone;
    private String Email;
    private double VlrMaxCredito;
    private double VlrEmprestado;
    private static List<Cliente> clientes = new ArrayList<>();

    public Cliente(double VlrMaxCredito) {
        this.VlrMaxCredito = VlrMaxCredito;
        this.VlrEmprestado = 0.0;
    }

    public abstract double emprestar(double valor);

    public abstract double devolver(double valor);

    public double getSaldo() {
        return VlrEmprestado;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getVlrMaxCredito() {
        return VlrMaxCredito;
    }

    public double getVlrEmprestado() {
        return VlrEmprestado;
    }

    protected void setVlrEmprestado(double VlrEmprestado) {
        this.VlrEmprestado = VlrEmprestado;
    }

    public static void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }
}
