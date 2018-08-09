package com.senac.florianopolis;

import javax.swing.JOptionPane;

import com.senac.Dao.ProdutoDao;
import com.senac.modelos.Produto;

/**
 * Classe para escolha de opções de produto
 * @author Aluno
 *
 */
public class MenuProduto {
	
	/**
	 * Método para mostrar o menu para o usuário
	 */
	public static void showMenu () {
		Integer menu = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada :\n"
				+ "1. Incluir produto\n"
				+ "2. Editar Produto\n"
				+ "3.Listar Produto \n"
				+ "4.Listar todos os Produtos \n"
				+ "5.Excluir Produto\n"
				+ "6.Voltar"
				));
		Produto p1 = null;
		ProdutoDao produtoDAO = new ProdutoDao();
		switch (menu){
		case 1:
			p1 = ConfirmaProduto.cadastro();
			JOptionPane.showMessageDialog(null, produtoDAO.cadastrar(p1));
			showMenu();
			break;
		case 2:
			p1 = ConfirmaProduto.AtualizarProduto();
			JOptionPane.showMessageDialog(null, p1);
			showMenu();
			break;
		case 3:
			p1 = ConfirmaProduto.ConsultarProduto();
			JOptionPane.showMessageDialog(null, p1);
			showMenu();
			break;
		case 4:
			JOptionPane.showMessageDialog(null, ConfirmaProduto.ConsultarProdutos());
			showMenu();
			break;
		case 5:
			ConfirmaProduto.ExcluirProduto();
			showMenu();
			break;
		case 6:
			Tela.menuprincipal();
			break;
		}
	}
}
