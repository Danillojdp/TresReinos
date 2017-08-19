
public class Turma {
			//Atributos
	
	private String codigo;
	private String professor;
	private String Disciplina;
	
	
//-------------------------------------------------------------------------------------------------------------	
			//Métodos
	
	//Método Get e set
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getDisciplina() {
		return Disciplina;
	}
	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}
	
//-------------------------------------------------------------------------------------------------------------	
	
		//Metodo ToString
	
	@Override
	public String toString() {
		return "Turma [codigo=" + codigo + ", professor=" + professor + ", Disciplina=" + Disciplina + ", getCodigo()="
				+ getCodigo() + ", getProfessor()=" + getProfessor() + ", getDisciplina()=" + getDisciplina()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
//-------------------------------------------------------------------------------------------------------------	
	
		//Metodo Construtor
	
	public Turma(String codigo, String professor, String disciplina) {
		super();
		this.codigo = codigo;
		this.professor = professor;
		Disciplina = disciplina;
	}
	
	
}
