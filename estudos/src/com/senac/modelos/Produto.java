package com.senac.modelos;

public class Produto {
	private String Nome;
	private double preco;
	private String DtFabricante;
	private String DtValidade;
	private double peso;
	private int ID;
	
	
	public Produto() {
		super();
	
	}
	
	public Produto(String nome, double preco, String dtFabricante, String dtValidade, double peso, int iD) {
		super();
		Nome = nome;
		this.preco = preco;
		DtFabricante = dtFabricante;
		DtValidade = dtValidade;
		this.peso = peso;
		ID = iD;
	}

	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDtFabricante() {
		return DtFabricante;
	}
	public void setDtFabricante(String dtFabricante) {
		DtFabricante = dtFabricante;
	}
	public String getDtValidade() {
		return DtValidade;
	}
	public void setDtValidade(String dtValidade) {
		DtValidade = dtValidade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "Produto [Nome=" + Nome + ", preco=" + preco + ", DtFabricante=" + DtFabricante + ", DtValidade="
				+ DtValidade + ", peso=" + peso + ", ID=" + ID + "]";
	}

	
	}
