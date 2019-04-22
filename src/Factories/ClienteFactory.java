package Factories;

import Clientes.Cliente;
import Clientes.Genero;

/**
  * Essa interface funciona como a Abstract Factory. É a interface principal para as Concrete Factories implementarem ela. 
  */

public interface ClienteFactory {
    Cliente criaCliente(String name, String cpf, int age, Genero genero, String vip);
}
