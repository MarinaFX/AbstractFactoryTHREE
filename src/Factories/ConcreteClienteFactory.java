package Factories;

import Clientes.Cliente;
import Clientes.Genero;

/**
  * Seguindo o padrão A.F, essa é uma das fabricas (Classes instanciadoras) concretas, isto é, ela implementa a interface
  * ClienteFactory e implementa o método abstrato da interface para instanciar um objeto do tipo Cliente. 
  */

public class ConcreteClienteFactory implements ClienteFactory {

    @Override
    public Cliente criaCliente(String name, String cpf, int age, Genero genero, String vip) {
        Cliente cliente = new Cliente(name, cpf, age, genero);
        return cliente;
    }
}
