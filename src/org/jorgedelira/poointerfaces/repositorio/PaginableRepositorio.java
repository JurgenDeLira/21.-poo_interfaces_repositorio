package org.jorgedelira.poointerfaces.repositorio;

import org.jorgedelira.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
