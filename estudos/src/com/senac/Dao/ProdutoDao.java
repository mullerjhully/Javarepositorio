package com.senac.Dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.senac.interfaces.Dao;
import com.senac.modelos.Produto;

public class ProdutoDao implements Dao<Produto>{

	private static Map<Integer, Produto> produtos = new LinkedHashMap<>();
	private static Integer id = 0;
	
	@Override
	public Produto cadastrar(Produto obj) {
		obj.setID(++id);
		produtos.put(obj.getID(), obj);
		return obj;
	}

	@Override
	public Produto editar(Produto obj) {
		produtos.put(obj.getID(), obj);
		return obj;
	}

	@Override
	public Produto selecionar(Integer id) {
		return produtos.get(id);
	}

	@Override
	public void excluir(Integer id) {
		produtos.remove(id);
	}

	@Override
	public List<Produto> consultar() {
		return new ArrayList<Produto>(produtos.values());
	}

	
	

}
