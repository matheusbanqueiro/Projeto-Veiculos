import java.text.DecimalFormat;

abstract class Veiculo {
	
	private String tipo, marca, modelo, cor, placa;
	private double aceleracao;
	private double tanque, km;
	private int chave, chaveCorreta;
	private final double tanqueCheio;
	
	public Veiculo(String tipo, String marca, String modelo, String cor, String placa, double tanque, int chave) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.tanqueCheio = tanque;
		this.tanque = tanque;
		setChave(chave);
	}
	
	public void acelerar(Veiculo v, double velocidade) {
		
		if(v.verificando(v) && getTanque() >= 5) {
			System.out.println("Acelerando "+ velocidade +" km/h");
			this.tanque -= velocidade;
			this.km += velocidade * 10;
			
			
		} else {
		System.out.println("Ligue o "+ getTipo() +" para acelerar!");
		}
	}
	
	public boolean ligar(Veiculo v) {

		if(v.verificando(v)) {
			System.out.println("\n");
			System.out.println("*********************");
			System.out.println( "* " + this.getTipo() + " está ligado(a)");
			System.out.println("*********************");
			return true;
		} else {
			System.out.println("\n");
			System.out.println("-=-=-=-=-=-=-=-");
			System.out.println("INSIRA A CHAVE!");
			System.out.println("-=-=-=-=-=-=-=-");
			return false;
		}
	}

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
	private String calTanque() {
		DecimalFormat df = new DecimalFormat("0.0");
		
		double calculo = getKm() / tanqueCheio;
		return df.format(calculo);
		
	}
	public void ligarFarois(Veiculo v) {

		if(v.verificando(v)) {
			System.out.println("*=*=*=*=*=*=*=*");
			System.out.println("Fárois ligados!");
			System.out.println("*=*=*=*=*=*=*=*");
		} else {
			System.out.println("Ligue o "+ getTipo() +" para acender os fárois!");
		}
	}
	
	
	public boolean verificando(Veiculo v) {
		
		if(getChave() == getChaveCorreta()) {
			return true;
		} else {
			return false;}
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public double getAceleracao() {
		return aceleracao;
	}
	public void setAceleracao(double aceleracao) {
		this.aceleracao = aceleracao;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public double getChave() {
		return chave;
	}
	public void setChave(int chave) {
			this.chave = chave;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getChaveCorreta() {
		return chaveCorreta;
	}
	public void setChaveCorreta(int chaveCorreta) {
		this.chaveCorreta = chaveCorreta;
	}

	public double getTanque() {
		return tanque;
	}

	public void setTanque(double tanque) {
		this.tanque = tanque;
	}

}
