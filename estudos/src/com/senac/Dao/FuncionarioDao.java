package com.senac.Dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.senac.interfaces.Dao;
import com.senac.modelos.Funcionario;

public class FuncionarioDao  implements Dao<Funcionario>{
	private static Map<Integer,Funcionario> funcionarios = new LinkedHashMap<>();
	private static Integer id = 0;
@Override
public Funcionario cadastrar(Funcionario obj) {
	obj.setID(++id);
	funcionarios.put(obj.getID(), obj);
	return obj;
	
}

@Override
public Funcionario editar(Funcionario obj) {
	funcionarios.put(obj.getID(), obj);
	return obj;
}

@Override
public Funcionario selecionar(Integer id) {
	return funcionarios.get(id);
}

@Override
public void excluir(Integer id) {
	funcionarios.remove(id);
	
}

@Override
public List<Funcionario> consultar() {
	return new ArrayList<Funcionario>(funcionarios.values());
}
}
