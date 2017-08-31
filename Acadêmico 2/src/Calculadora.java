
public class Calculadora {
			///determina a mencao com base na nota
	public String CalcularMencao(double nota){
		String mencao = "";

		if (nota >= 9) {
			mencao = "SS";
		} else {
			if (nota>= 7){
			mencao = "MS";
		} else {
			if (nota>=5){
				mencao = "MM";
		} else {
			if (nota>3){
				mencao = "MI";
		} else {
			if (nota >= 0.1){
				mencao = "II";
		} else {
			mencao = "SR";
		}
			}
				}
			
					}
						}
	return 	mencao;
	}

	
	
	
	
	//determina o resultado com base na mencao
	
	public String CalcularResultado(String mencao){
		String resultado = "";
		
		if (mencao =="SS" || mencao == "MS" || mencao == "SS") {
			resultado = "Aprovado";
		}else{
			resultado = "Reprovado";
		}
		return resultado;
		
	}
	
	
	
	
				
}
