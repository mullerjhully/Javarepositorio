package com.senac.florianopolis;

import java.util.List;

import javax.swing.JOptionPane;

import com.senac.Dao.FuncionarioDao;
import com.senac.modelos.Funcionario;

public class ConfirmaFuncionario {

private static FuncionarioDao funcionarioDao = new FuncionarioDao();
	
	public static Funcionario cadastro(){
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(JOptionPane.showInputDialog(null,"Digite o Nome do Funcionario","Cadastro",JOptionPane.INFORMATION_MESSAGE));
		funcionario.setDataNascimento(JOptionPane.showInputDialog(null,"Digite a data de nascimento","Cadastro ",JOptionPane.INFORMATION_MESSAGE));
		funcionario.setSetor(JOptionPane.showInputDialog(null,"Digite o Setor","Cadastro",JOptionPane.INFORMATION_MESSAGE));
		return  funcionarioDao.cadastrar( funcionario);
		
	}
	public static Funcionario ConsultarFuncionario() {
		int ID = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ID do Funcionario","Consultar",JOptionPane.INFORMATION_MESSAGE));
		return funcionarioDao.selecionar(ID);
	}
	
	public static List<Funcionario> ConsultarFuncionarios() {
		return funcionarioDao.consultar();
	}
	
	public static Funcionario AtualizarFuncionario() {
		Funcionario funcionario = new Funcionario();
		int ID = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ID do Funcionario","Consultar",JOptionPane.INFORMATION_MESSAGE));
		funcionario.setID(ID);
		funcionario.setNome(JOptionPane.showInputDialog(null,"Digite o Nome do Funcionario","Cadastro",JOptionPane.INFORMATION_MESSAGE));
		funcionario.setDataNascimento(JOptionPane.showInputDialog(null,"Digite a data de nascimento","Cadastro Preço",JOptionPane.INFORMATION_MESSAGE));
		funcionario.setSetor(JOptionPane.showInputDialog(null,"Digite o Setor","Cadastro Peso",JOptionPane.INFORMATION_MESSAGE));
		return funcionarioDao.editar(funcionario);
	}
	public static void ExcluirFuncionario() {
		int ID = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ID do Funcionario","Consultar",JOptionPane.INFORMATION_MESSAGE));
		int confirmDialog = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o produto?","Excluir Produto",JOptionPane.INFORMATION_MESSAGE);
		if (confirmDialog == JOptionPane.OK_OPTION) {
			funcionarioDao.excluir(ID);
			JOptionPane.showMessageDialog(null, "Funcionario excluído com sucesso");
		}
	}
	
}
