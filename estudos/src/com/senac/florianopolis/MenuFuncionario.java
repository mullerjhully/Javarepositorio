package com.senac.florianopolis;

import javax.swing.JOptionPane;

import com.senac.Dao.FuncionarioDao;
import com.senac.modelos.Funcionario;

public class MenuFuncionario {
	public static void showMenufuncionario () {
		Integer menu = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada :\n"
				+ "1. Incluir funcionario\n"
				+ "2. Editar Funcionario\n"
				+ "3.Listar Funcionario \n"
				+ "4.Listar todos os Funcionarios \n"
				+ "5.Excluir Funcionario\n"
				+ "6.Voltar"
				));
		Funcionario f1 = null;
		FuncionarioDao funcionarioDao = new FuncionarioDao();
		
		switch (menu){
		case 1:
			f1 = ConfirmaFuncionario.cadastro();
			JOptionPane.showMessageDialog(null, f1);
			showMenufuncionario();
			break;
		case 2:
			f1 = ConfirmaFuncionario.AtualizarFuncionario();
			JOptionPane.showMessageDialog(null, f1);
			showMenufuncionario();
			break;
		case 3:
			f1 = ConfirmaFuncionario.ConsultarFuncionario();
			JOptionPane.showMessageDialog(null, f1);
			showMenufuncionario();
			break;
		case 4:
			JOptionPane.showMessageDialog(null, ConfirmaFuncionario.ConsultarFuncionarios());
			showMenufuncionario();
			break;
		case 5:
			ConfirmaFuncionario.ExcluirFuncionario();
			showMenufuncionario();
			break;
		case 6:
			Tela.menuprincipal();
			break;
		}
	}

}
