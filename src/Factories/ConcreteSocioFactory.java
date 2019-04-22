package Factories;

import Clientes.Cliente;
import Clientes.Genero;
import Clientes.Socio;

public class ConcreteSocioFactory implements ClienteFactory {

    @Override
    public Cliente criaCliente(String name, String cpf, int age, Genero genero, String vip) {
        Cliente socio = new Socio(name, cpf, age, genero, vip);
        return socio;
    }
}
