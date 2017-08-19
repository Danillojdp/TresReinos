import java.time.LocalDate;


public class Aluno {
			//Atributos
	private String nome;
	private String RA;
	private String sexo;
	private LocalDate dataNascimento;
	
//-------------------------------------------------------------------------------------------------------------
	
			//métodos
	//Metodo Get e set
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
//-------------------------------------------------------------------------------------------------------------
	
	// Método ToString
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", RA=" + RA + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento
				+ ", getNome()=" + getNome() + ", getRA()=" + getRA() + ", getSexo()=" + getSexo()
				+ ", getDataNascimento()=" + getDataNascimento() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


//-------------------------------------------------------------------------------------------------------------	
	//Método Construtor
	
	public Aluno(String nome, String rA, String sexo, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		RA = rA;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}


//-------------------------------------------------------------------------------------------------------------
	//metodo para recuperar 

	public String getDataNascComoString(){
		return dataNascimento.getDayOfMonth() + "/" +
				dataNascimento.getMonthValue() + "/" +
				dataNascimento.getDayOfYear();
	}


}
