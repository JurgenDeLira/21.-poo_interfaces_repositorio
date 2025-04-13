package org.jorgedelira.generics;

import org.jorgedelira.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<Cliente>(); //poner Cliente en el diamante es redundante
        clientes.add(new Cliente("Jorge", "De Lira"));

        Cliente jorge = (Cliente)clientes.iterator().next(); // el cast (Cliente) es

        
    }
}
