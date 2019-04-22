package Factories;

import Clientes.Cliente;
import Clientes.Genero;

public class ConcreteClienteFactory implements ClienteFactory {

    @Override
    public Cliente criaCliente(String name, String cpf, int age, Genero genero, String vip) {
        Cliente cliente = new Cliente(name, cpf, age, genero);
        return cliente;
    }
}
