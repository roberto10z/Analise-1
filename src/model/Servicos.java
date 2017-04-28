package model;

import java.util.Date;

public class Servicos {
	Date data;
 
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDescricacao() {
		return descricacao;
	}
	public void setDescricacao(String descricacao) {
		this.descricacao = descricacao;
	}
	double valor;
	String descricacao;
	
}
