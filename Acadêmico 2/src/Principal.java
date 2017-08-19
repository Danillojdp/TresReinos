import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//Criando a data
		Calendar dataNascA1 = Calendar.getInstance();
		dataNascA1.set(Calendar.YEAR, 1974);
		dataNascA1.set(Calendar.MONTH, Calendar.APRIL);
		dataNascA1.set(Calendar.DAY_OF_MONTH, 12);
		
		
	
	
		
//-------------------------------------------------------------------------------------------------------------		

			//Instanciando os objetos
		
		Aluno a1 = new Aluno("Jorge Danillo", "21603818", "Masculino", dataNascA1);
		Disciplina d1 = new Disciplina("LTP1", "Ciência da Computação", 40);
		Professor p1 = new Professor("Marcos Vinicius", "258654", "Mestrado", "02536921475");
		Turma t1 = new Turma("Turma A", "Marcos Vinicius", "Programação");
	
		
//-------------------------------------------------------------------------------------------------------------	

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
		
		
		
	}

}
