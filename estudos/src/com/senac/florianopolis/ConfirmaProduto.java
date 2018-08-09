package com.senac.florianopolis;

import java.util.List;

import javax.swing.JOptionPane;

import com.senac.Dao.ProdutoDao;
import com.senac.modelos.Produto;

public class ConfirmaProduto {
	
	private static ProdutoDao produtoDao = new ProdutoDao();
	
	public static Produto cadastro(){
		Produto produto = new Produto();
		produto.setNome(JOptionPane.showInputDialog(null,"Digite o Produto","Cadastro",JOptionPane.INFORMATION_MESSAGE));
		produto.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Preço","Cadastro Preço",JOptionPane.INFORMATION_MESSAGE)));
		produto.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Peso","Cadastro Peso",JOptionPane.INFORMATION_MESSAGE)));
		produto.setDtFabricante(JOptionPane.showInputDialog(null,"Digite a data fabricação","Cadastro",JOptionPane.INFORMATION_MESSAGE));
		produto.setDtValidade(JOptionPane.showInputDialog(null,"Digite a data de Validade","Cadastro ",JOptionPane.INFORMATION_MESSAGE));
		//return produtoDao.cadastrar(produto);
		return produto;
		
	}
	public static Produto ConsultarProduto() {
		int ID = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ID do Produto","Consultar",JOptionPane.INFORMATION_MESSAGE));
		return produtoDao.selecionar(ID);
	}
	
	public static List<Produto> ConsultarProdutos() {
		return produtoDao.consultar();
	}
	
	public static Produto AtualizarProduto() {
		Produto produto = new Produto();
		produto.setID(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ID do Produto","Consultar",JOptionPane.INFORMATION_MESSAGE)));
		produto.setNome(JOptionPane.showInputDialog(null,"Digite o nome do Produto","Cadastro Nome",JOptionPane.INFORMATION_MESSAGE));
		produto.setPreco(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Preço","Cadastro Preço",JOptionPane.INFORMATION_MESSAGE)));
		produto.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Peso","Cadastro Peso",JOptionPane.INFORMATION_MESSAGE)));
		produto.setDtFabricante(JOptionPane.showInputDialog(null,"Digite a data fabricação","Cadastro",JOptionPane.INFORMATION_MESSAGE));
		produto.setDtValidade(JOptionPane.showInputDialog(null,"Digite a data de Validade","Cadastro ",JOptionPane.INFORMATION_MESSAGE));
		return produtoDao.editar(produto);
	}
	public static void ExcluirProduto() {
		int ID = Integer.parseInt(JOptionPane.showInputDialog(null,ConsultarProdutos()+"\nDigite o ID do Produto","Consultar",JOptionPane.INFORMATION_MESSAGE));
		int confirmDialog = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o produto?","Excluir Produto",JOptionPane.INFORMATION_MESSAGE);
		if (confirmDialog == JOptionPane.OK_OPTION) {
			produtoDao.excluir(ID);
			JOptionPane.showMessageDialog(null, "Produto excluído com sucesso");
		}
	}
	
}