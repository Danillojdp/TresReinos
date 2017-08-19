import java.util.ArrayList;

public class Turma {
			//Atributos
	
	private String codigo;
	private String professor;
	private String Disciplina;
	private ArrayList <Aluno> alunos;
	
//-------------------------------------------------------------------------------------------------------------	
			//Métodos
	
	//Método Get e set
	
	public String getCodigo() {
		return codigo;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
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
		this.alunos  = new ArrayList<Aluno>();
	}
	
//-------------------------------------------------------------------------------------------------------------	
		
		//Método que adiciona 1 aluno na turma

		public void adicionarAluno(Aluno aluno) {
			this.alunos.add(aluno);
		}

		public String listaAlunos() {
			String retorno = "";
		
//-------------------------------------------------------------------------------------------------------------
			
			//Verificar se existem alunos na turma
			if (this.alunos.size() == 0) {
				retorno = "Nenhum aluno registrado na turma!";
			} else {
				
			
			
		//Navegar Pela Estrutura de Alunos
		for (int i = 0; i <this.alunos.size(); i++) {
				retorno = retorno + "Nome: " + this.alunos.get(i).getNome() + "\n";
		}
			}
		return retorno;
		
//-------------------------------------------------------------------------------------------------------------
				
		}
		}