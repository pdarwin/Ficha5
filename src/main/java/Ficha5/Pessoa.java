package Ficha5;

import java.util.UUID;

public class Pessoa {

	private String primeiroNome;
	
	private String ultimoNome;
	
	private int idade;
	
	private double saldo;
	
	private UUID id;

	/**
	 * @param primeiroNome
	 * @param ultimoNome
	 * @param idade
	 */
	public Pessoa(String primeiroNome, String ultimoNome, int idade) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.idade = idade;
		this.saldo = 0;
		this.id = UUID.randomUUID();
	}

	
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", primeiroNome=" + primeiroNome + ", ultimoNome=" + ultimoNome + ", idade=" + idade
				+ ", saldo=" + saldo + "]";
	}



	/**
	 * @return the primeiroNome
	 */
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	/**
	 * @param primeiroNome the primeiroNome to set
	 */
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	/**
	 * @return the ultimoNome
	 */
	public String getUltimoNome() {
		return ultimoNome;
	}

	/**
	 * @param ultimoNome the ultimoNome to set
	 */
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	/**
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}

	
	
	
	
}
