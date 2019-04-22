package Factories;

import Clientes.Cliente;
import Clientes.Genero;

public interface ClienteFactory {
    Cliente criaCliente(String name, String cpf, int age, Genero genero, String vip);
}
