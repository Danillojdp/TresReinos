import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		//Criar objeto da classe Comprador 
		Comprador c1 = new Comprador("Jorge Danillo", "05139809117", 21);
		
		
		//Tentando imprimir o objeto c1
		System.out.println(c1);
		
		
		
		//Recuperar os atributos de c1
				System.out.println("Nome: " + c1.getNome());
				System.out.println("CPF: " + c1.getCPF());
				System.out.println("Idade: " + c1.getIdade());
				
		
		
/*		Preencher atributos de c1
		c1.setNome("Jorge Danillo");
		c1.setCPF("051.398.091-17");
		c1.setIdade(21);
*/
		
		//Tudo de novo
		Comprador c2 = new Comprador("Maria", "051.369.852-17", 19);
		
/*		Preencher os atributos de c2
		c2.setNome("Maria da Silva");
		c2.setCPF("023.456.789-12");
		c2.setIdade(19);
*/
		//Recuperar os atributos de c2
		System.out.println("Nome: " + c2.getNome());
		System.out.println("CPF: " + c2.getCPF());
		System.out.println("Idade: " + c2.getIdade());
		
		//Crida classe Vendedor
		
		Vendedor v1 = new Vendedor();
		
		//instanciar vendedor
		//Vendedor = v1 
		
		//Calcular salario do mes
		System.out.println(v1.calcularSalarioMes(10,  5));
		
		
		//Preencher atributos de v1
	
		v1.setNome("Jorge");
		v1.setMatricula("21603818");
		v1.setSalario(1000);
		
		//Recuperar os atributos de v1
		System.out.println("Nome do vendedor: " + v1.getNome());
		System.out.println("Matricula: " + v1.getMatricula());
		System.out.println("Salario: " + v1.getSalarioBase());
		
		//Criar Veiculo
		Veiculo veicl = new Veiculo(1000.00, "2017", "up", "VW","0", 100.00);
			System.out.println(veicl);
			
		// Calendario
		Calendar data = Calendar.getInstance();
		data.set(Calendar.YEAR, 2017);
		data.set(Calendar.MONTH, Calendar.AUGUST);
		data.set(Calendar.DAY_OF_MONTH, 11);
		
		//Rigistrar vendaar objeto 
	
		Venda venda1 = new Venda(c1, v1, veicl, veicl.getPreço(), "A Vista",data);
			
		System.out.println(venda1.getComprador().getNome());
		System.out.println(venda1.getVendedor().getNome());
		System.out.println(venda1.getVeiculo().getModelo());
	}

	

	
	
	
	
	
}
