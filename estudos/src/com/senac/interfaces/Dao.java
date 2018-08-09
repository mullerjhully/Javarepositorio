package com.senac.interfaces;

import java.util.List;

public interface Dao<E> {
	public E cadastrar (E obj);
	public E editar (E obj);
	public E selecionar (Integer id);
	public void excluir(Integer id);
	public List<E> consultar();
}
