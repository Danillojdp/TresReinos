
public class Disciplina {
				//ATRIBUTOS
	
	private String nome;
	private String curso;
	private int cargaHoraria;
	
//-----------------------------------------------------------------------------------------------------------------------
	
				//MÉTODOS
	
		//MÉTODO GET E SET
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	
	
//-----------------------------------------------------------------------------------------------------------------------	
	
	
			//MÉTODO CONSTRUTOR
	
	 public Disciplina(String nome, String curso, int cargaHoraria) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.cargaHoraria = cargaHoraria;
	}
	
//-----------------------------------------------------------------------------------------------------------------------	
			
	
			//MÉTODO toString
	
	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", curso=" + curso + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
	
//-----------------------------------------------------------------------------------------------------------------------
	
			//MÉTODO CRIADO EM SALA PELO PROFESSOR
			
			public String imprimirDisciplina() {
				return "Dados do Aluno \n"  +
						"Nome: " + getNome() + "\n" + 
						"Curso: " + getCurso() + "\n" +
						"Carga Horaria: " + getCargaHoraria();
				
			
			
			}
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
