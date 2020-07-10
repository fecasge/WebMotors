
public class Agencia {
	public static void main(String args[]) {
		Carro c1, c2;
		Carro c3, c4;
		
		c1 = new Carro(1234,"Vokis","Fusquinha",1965, "Branco", 200000, true, 25000);
		c2 = new Carro(4321, "Fiote", "Marea Turbo", 1990, "Verde Musgo", 5000, true, 2500);
		
		System.out.println(c1.getCodigo() + " "+c1.getMarca()+" "+c1.getModelo());
		System.out.println(c2.getCodigo() + " "+c2.getMarca()+" "+c2.getModelo());
	
		c3 = c1;  // aqui eu criei cópias? NAO, eu só fiz a referência c3 apontar para o mesmo objeto de C1
		c4 = c2;  // idem para C4 em relação a C2
		
		// o que significa isso??
		
		// tudo o que eu fizer via referência c3, é refletido na referência c1
		// tudo o que eu fizer via referência c4, é refletido na referência c2
		
		c3.setMarca("Volkswagen");
		c4.setMarca("Fiat-Chrysler");
		
//		System.out.println(c1.getCodigo() + " "+c1.getMarca()+" "+c1.getModelo());
//		System.out.println(c2.getCodigo() + " "+c2.getMarca()+" "+c2.getModelo());
		
		c1.andar();
		c2.andar();
		
		c2.quebrar();
		
		c1.andar();
		c2.andar();
		
		c4.consertar();
		
		c1.andar();
		c2.andar();
		
		
		
		
	
		
		
	}

}
