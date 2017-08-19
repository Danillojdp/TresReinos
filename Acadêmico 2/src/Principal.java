import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//Criando a data
		LocalDate dataNascA1 = LocalDate.of(1974, 4, 12);
		
	
		//LocalDate.of(1974, 4, 12));
//-------------------------------------------------------------------------------------------------------------		
			//Instanciando os objetos
		
		Disciplina d1 = new Disciplina("LTP1", "Ciência da Computação", 40);
		Professor p1 = new Professor("Marcos Vinicius", "258654", "Mestrado", "02536921475");
		Turma t1 = new Turma("Turma A", "Marcos Vinicius", "Programação");
	
//-------------------------------------------------------------------------------------------------------------			
			//Instanciando objetos da classe aluno
		
				Aluno a1 = new Aluno("Jorge", "25114", "Masculino", LocalDate.of(1974, 4, 12));
				Aluno a2 = new Aluno("Maria", "2655", "Feminino", LocalDate.of(1974, 4, 12));
				Aluno a3 = new Aluno("Jose", "2658", "Masculino", LocalDate.of(1974, 4, 12));
				Aluno a4 = new Aluno("Tamara", "2653", "Feminino", LocalDate.of(1974, 4, 12));
				Aluno a5 = new Aluno("Samara", "2651", "Feminino", LocalDate.of(1974, 4, 12));
				Aluno a6 = new Aluno("Damara", "2656", "Feminino", LocalDate.of(1974, 4, 12));
				
//-------------------------------------------------------------------------------------------------------------		
			// Adicionar alunos na turma
				
		t1.adicionarAluno(a1);
		t1.adicionarAluno(a2);
		t1.adicionarAluno(a3);
		t1.adicionarAluno(a4);
		t1.adicionarAluno(a5);
		t1.adicionarAluno(a6);
	
		System.out.println(t1.listaAlunos());
		
	

			//Imprimindo informações basicas
		
			//Aluno
		System.out.println(a1.getNome());
		System.out.println(a1.getRA());
		System.out.println(a1.getSexo());
		System.out.println(a1.getClass());
		System.out.println(a1.getDataNascimento());
		
		
			
			//Disciplina
		System.out.println(d1.getNome());
		System.out.println(d1.getCurso());
		System.out.println(d1.getCargaHoraria());
		
			//Professor
		System.out.println(p1.getNome ());
		System.out.println(p1.getMatricula());
		System.out.println(p1.getTitulação());
		System.out.println(p1.getCPF());

			//Turma
		System.out.println(t1.getCodigo());
		System.out.println(t1.getProfessor());
		System.out.println(t1.getDisciplina());
		
			//Imprimindo o nome do aluno que esta no ArryList da turma 
		System.out.println(t1.getAlunos().get(0).getNome());
	
		
		
			//Determonar Mencao e aprovacao com base na nota
		Calculadora c = new Calculadora();
		String mencao = c.CalcularMencao(6.7);
		System.out.println("Mencao: " + mencao + " e RESULTADO: " + c.CalcularResultado(mencao));
	}
}
