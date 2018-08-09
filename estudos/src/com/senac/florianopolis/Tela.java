package com.senac.florianopolis;

import javax.swing.JOptionPane;

import com.senac.florianopolis.MenuEnum;
import com.senac.modelos.Funcionario;
import com.senac.modelos.Produto;

public class Tela {
	public static void main(String[] args) {
		menuprincipal();
	}
	
	public static void menuprincipal() {
		Integer menu = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada :\n"
				+ "1. Produto\n"
				+ "2.  Funcionario\n"
				));
		MenuEnum menuEnum = MenuEnum.parse(menu);
		switch (menuEnum) {
		case PRODUTO:
			MenuProduto.showMenu();
			break;
		case FUNCIONARIO:
			MenuFuncionario.showMenufuncionario();
			break;
		}
	}
	
	
	
	
}
