package Ficha5;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Manuel", "Fernandes", 25);
		p1.setSaldo(15);

		Pessoa p2 = new Pessoa("Maria", "Rodrigues", 46);
		p2.setSaldo(20);
		
		Pessoa p3 = new Pessoa("José", "Gonçalves", 50);
		p3.setSaldo(23.27);
		
		Mercado mercado = new Mercado();
		mercado.addPessoa(p1);
		mercado.addPessoa(p2);
		mercado.addPessoa(p3);
		
		System.out.println(mercado.getSaldoTotal());
		
		LoadFromFile testFile = new LoadFromFile();
		testFile.obterInformacaoFicheiro("pessoas.json");

	}

}
