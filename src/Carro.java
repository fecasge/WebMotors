
public class Carro {
	private int     codigo;
	private String  marca;
	private String  modelo;
	private int     ano;
	private String  cor;
	private int     km;
	private boolean automatico;
	private float   preco;
	private boolean quebrado;
	
	// metodo construtor
	public Carro(int codigo, String marca, String modelo, int ano, String cor, int km, boolean aut, float preco) {
		this.codigo     = codigo;
		this.marca      = marca;
		this.modelo     = modelo;
		this.ano        = ano;
		this.cor        = cor;
		this.km         = km;
		this.automatico = aut;
		this.preco      = preco;
		this.quebrado   = false;
	}
	
	
	// gets / sets
	
	// get => recuperar
	// set => atribuir/modificar
		
	// padrão: setNOMEDOATRIBUTO
		
	// modificador tipo_retorno nome(listaParametros)
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public boolean isAutomatico() {
		return automatico;
	}
	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void quebrar() {
		quebrado = true;
		System.out.println("Carro "+modelo+" esta quebrado!");
	}
	
	public void consertar() {
		quebrado = false;
		System.out.println("Carro "+modelo+ " esta consertado!");
	}
	
	public void andar() {
		if (quebrado) {
			System.out.println("Nao consigo andar com o carro "+modelo+" pois esta quebrado");
		}
		else {
			System.out.println(modelo+" vruuuummmmm");
		}
	}
}