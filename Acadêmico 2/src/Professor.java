
public class Professor {
		//Atributos
	private String nome;
	private String matricula;
	private String titulação;
	private String CPF;
	

//-------------------------------------------------------------------------------------------------------------
	
			//Métodos
	
	//Método Get e Set
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTitulação() {
		return titulação;
	}
	public void setTitulação(String titulação) {
		this.titulação = titulação;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
//-------------------------------------------------------------------------------------------------------------
	//Método ToString
	
	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", matricula=" + matricula + ", titulação=" + titulação + ", CPF=" + CPF
				+ ", getNome()=" + getNome() + ", getMatricula()=" + getMatricula() + ", getTitulação()="
				+ getTitulação() + ", getCPF()=" + getCPF() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

	
//-------------------------------------------------------------------------------------------------------------
	
	//Metodo Construtor
	
	public Professor(String nome, String matricula, String titulação, String cPF) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.titulação = titulação;
		CPF = cPF;
	}
	
}
