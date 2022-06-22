package br.com.generation.heranca;

public class Animal {
	
	private String nome;
	private int idade;
	private String Som;
	
	public void Som(String Som) {
		this.Som = Som;
		System.out.println(Som);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String isSom() {
		return Som;
	}
	public void setSom(String Som) {
		this.Som = Som;
	}	
}
