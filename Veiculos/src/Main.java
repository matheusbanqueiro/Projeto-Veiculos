
public class Main {
	
	public static void main(String[] args) {
		
		//Chave para ligar o carro = 2
		Carro c = new Carro("Carro", "Chevrolet", "Onix 1.0", "Branco", "H8JK9LI0",60.0, 2);
		
		c.ligar(c);
		c.ligarFarois(c);
		
		c.acelerar(c, 10);
		c.acelerar(c, 15);
	
		c.informacoesVeiculo(c);
		
		
		//Chave para ligar a moto = 4
		Moto m = new Moto("Moto", "Honda", "CBR", "Azul", "J8H9J0",40.0, 3);
		
		m.ligar(m);
		
		m.acelerar(m, 10);
		m.acelerar(m, 15);
		
		m.informacoesVeiculo(m);
		
		//Chave para ligar a moto = 10
		Caminhao ca = new Caminhao("Caminhao", "Scania", "770 V8", "Preto", "H7A9L0", 100.0, 10);
		
		ca.ligar(ca);
		ca.ligarFarois(ca);
		ca.informacoesVeiculo(ca);
	}
	
}
