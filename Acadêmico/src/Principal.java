
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//-----------------------------------------------------------------------------------------------------------------------		

		//Instanciando as Classes
		
		Aluno a1 = new Aluno("Jorge Danillo", "21603818", 21, "Computação", "Noturno", "Masculino");
		
		Disciplina d1 = new Disciplina("LTP1", "Computação", 40);
	
		
//-----------------------------------------------------------------------------------------------------------------------		
		
		//Printar na tela
		
		/*System.out.println(a1.getNome());
		System.out.println(d1.getNome());
		*/
		
		System.out.println(a1.imprimirAluno());
		System.out.println(d1.imprimirDisciplina());
		
		
	}

}
