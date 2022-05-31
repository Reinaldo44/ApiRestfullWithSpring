package com.DigitalInovation.service;

import com.DigitalInovation.model.Cliente;

public interface ClienteServiceInterface {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
