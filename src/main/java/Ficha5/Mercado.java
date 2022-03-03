package Ficha5;

import java.util.ArrayList;
import java.util.List;

public class Mercado {

	private List<Pessoa> pessoas;

	/**
	 * @param pessoas
	 */
	public Mercado() {
		this.pessoas = new ArrayList<Pessoa>();
	}
	
	public void addPessoa (Pessoa pessoa)
	{
		pessoas.add(pessoa);
	}

	public double getSaldoTotal ()
	{
		double saldo = 0;
		for (Pessoa pessoa : pessoas)
		{
			saldo += pessoa.getSaldo();
		}
		
		return saldo;
	}
	
	
	@Override
	public String toString() {
		return "Mercado [pessoas=" + pessoas + "]";
	}

	/**
	 * @return the pessoas
	 */
	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	/**
	 * @param pessoas the pessoas to set
	 */
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	
	
}
