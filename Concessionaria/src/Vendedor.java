
public class Vendedor {
	//Atributos
	private String nome;
	
	private String matricula;
	
	private double salarioBase;



	
	public String toString () {
		return "nome: " + this.nome + " / matricula: " + this.matricula +
				"/ salario Base: " + this.salarioBase;
		
	}
	
	
	public void Comprador (String nome, String matricula, double salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.salarioBase = salario;
	}
	
	
	
	//Metodos
	
	public String getNome(){
		return nome;
	}
	
	public String getMatricula(){
		return matricula;
		
	}
	
	public double getSalarioBase (){
		return salarioBase;
	}

	
	
	public void setNome (String nome){
		this.nome = nome;
		
	}
	
	public void setMatricula (String matricula){
		this.matricula = matricula;
	}
	
	public void setSalario (double salario){
		this.salarioBase = salario;
	}
	
	//calcular salario do mes
	
	public String calcularSalarioMes (double percentual, int qtdeVendas) {
		/*
		 * O salario do mês é calculado usando o salario base
		 * mais um percentual do salário base multiplicadp pela
		 * quantidade de vendas.

	
		double salarioPercentual = salarioBase * (percentual)/100;
		double salarioVariavel = salarioPercentual * qtdeVendas;
		double salariodoMes = salarioBase + salarioVariavel;
	
	return "Rs" + salariodoMes;
		

	
		 */
		
	
		return "Rs" + ((salarioBase + ((salarioBase) * (percentual/100)) * qtdeVendas));
		
		
		
	}
	
}
	


