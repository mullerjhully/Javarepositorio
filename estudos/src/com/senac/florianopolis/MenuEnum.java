package com.senac.florianopolis;

public enum MenuEnum {
	PRODUTO(1), FUNCIONARIO(2);
	
	private Integer numero;
	
	private MenuEnum(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public static MenuEnum parse(Integer numero) {
		for (MenuEnum menu : MenuEnum.values()) {
			if (menu.getNumero() == numero) {
				return menu;
			}
		}
		return null;
	}
}
