package Ficha5;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		LoadFromFile lff = new LoadFromFile();
		
		List<Pessoa> pessoas = lff.obterInformacaoFicheiro("pessoas.json");
		
		pessoas.get(0).setSaldo(15);
		pessoas.get(1).setSaldo(20);
		pessoas.get(2).setSaldo(23.27);
		
		Mercado mercado = new Mercado();
		mercado.setPessoas(pessoas);
		
		System.out.println(mercado.getSaldoTotal());
		
		System.out.println(mercado);

	}

}
