package Factories;

import Clientes.Cliente;
import Clientes.Genero;
import Clientes.Socio;

/**
  * Seguindo o padrão A.F, essa é uma das fabricas (Classes instanciadoras) concretas, isto é, ela implementa a interface
  * ClienteFactory e implementa o método abstrato da interface para instanciar um objeto do tipo Sócio. 
  */

public class ConcreteSocioFactory implements ClienteFactory {

    @Override
    public Cliente criaCliente(String name, String cpf, int age, Genero genero, String vip) {
        Cliente socio = new Socio(name, cpf, age, genero, vip);
        return socio;
    }
}
