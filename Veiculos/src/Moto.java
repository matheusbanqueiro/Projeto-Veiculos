
public class Moto extends Veiculo {
	
	
	public Moto(String tipo, String marca, String modelo, String cor, String placa,double tanque, int chave) {
		super(tipo, marca, modelo, cor, placa, tanque, chave);
	}

	@Override
	public int getChaveCorreta() {
		return 4;
	}
	
	
	

	}
	
