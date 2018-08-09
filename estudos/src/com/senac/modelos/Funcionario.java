package com.senac.modelos;

public class Funcionario {
	private String Nome;
	private String DataNascimento;
	private String Setor;
	private int ID;
	
	
	public Funcionario() {
		super();

	}

	public Funcionario(String nome, String dataNascimento, String setor, int iD) {
		super();
		Nome = nome;
		DataNascimento = dataNascimento;
		Setor = setor;
		ID = iD;
	}

	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getSetor() {
		return Setor;
	}
	public void setSetor(String setor) {
		Setor = setor;
	}

	@Override
	public String toString() {
		return "Funcionario [Nome=" + Nome + ", DataNascimento=" + DataNascimento + ", Setor=" + Setor + ", ID=" + ID
				+ "]";
	}
		
	
	
	
	
}
