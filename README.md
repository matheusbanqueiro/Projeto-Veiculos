# Projeto Veiculos 🚚🚗🛵

> Criei um projeto usando minha imaginação, onde o usuário pode ligar o carro, ligar os farois e acelerar a quantidade que ele quiser. 

E ao final mostra infromações do carro "normais" e "técnicas"


	public void informacoesVeiculo(Veiculo v) {
		
		System.out.println("\n");
		System.out.println(":::::::::::::::::::::::::::::");
		System.out.println(":::: INFORMAÇÕES NORMAIS ::::");
		System.out.println(":::: Tipo: " + getTipo());
		System.out.println(":::: Marca: " + getMarca());
		System.out.println(":::: Modelo: " + getModelo());
		System.out.println(":::: Cor: " + getCor());
		System.out.println(":::: Placa: " + getPlaca());
		System.out.println(":::::::::::::::::::::::::::::");
		System.out.println(":::: INFORMAÇÕES TÉCNICAS :::");
		System.out.println(":::: Tanque Inicial: " + this.tanqueCheio + "L");
		System.out.println(":::: Tanque Final: " + getTanque() + "L");
		System.out.println(":::: Percorreu: " + getKm() + " Km");
		System.out.println(":::: Seu veiculo consome 1L a cada " + v.calTanque() + " quilômetros");
		System.out.println(":::: Chave: " + v.verificando(v));
		System.out.println(":::::::::::::::::::::::::::::");
	}

Aqui utilizei:

+ Classes abstratas 
+ Interfaces
+ Atributos (public, protected, private)
+ Getters and Setters
+ Heranças
+ Composições
