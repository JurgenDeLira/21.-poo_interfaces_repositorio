package org.jorgedelira.poointerfaces.repositorio;

import org.jorgedelira.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);





}
