package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;


public interface ClientService {
    Iterable<Cliente> buscartodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar (Long id);
}
