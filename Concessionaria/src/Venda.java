import java.util.Calendar;

public class Venda {
	//Atributos
	private Comprador comprador;
	private Vendedor vendedor;
	private Veiculo veiculo;
	private double preço;
	private String formaPagamento;
	private Calendar data;
	
	
	
	//Get e set	
	
	public Comprador getComprador() {
		return comprador;
	}
	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	
	
	//Metodo Construtor
	
	public Venda(Comprador comprador, Vendedor vendedor, Veiculo veiculo, double preço, String formaPagamento,
			Calendar data) {
		super();
		this.comprador = comprador;
		this.vendedor = vendedor;
		this.veiculo = veiculo;
		this.preço = preço;
		this.formaPagamento = formaPagamento;
		this.data = data;
	}
	
	
	
	//Metodo para retornar data como String
	public String getDataComoString(){
		return this.data.get(Calendar.DAY_OF_MONTH) + "/" +
				this.data.get(Calendar.MONTH) + "/" +
				this.data.get(Calendar.YEAR);
	
	}
	
	
	//Metodo para "imprimir" nota fiscal
	public String gerarNotaFiscal (){
		return "------- Nota Fiscal da Venda -------\n" +
				"Data da Venda: " + getDataComoString() + "\n" +
				"Valor da Venda: R$" + this.preço + "\n" +
				"\n" +
				"--- Dados do Veículo --- \n" +
				"Modelo: " + this.veiculo.getModelo() + "\n" +
				"Fabricante: " + this.veiculo.getFabricante() + "\n" + 
				"Ano: " + this.veiculo.getAno() + "\n" +
				"/n" +
				"--- Dados do Veiculo \n" +
				"Nome: " + this.comprador.getCPF()+ "\n" +
				"CPF: " + this.comprador.getCPF() + "\n" +
				"\n" +
				"--- Dados do Vendedor --- \n" +
				"Nome: " + this.vendedor.getNome() + "\n" +
				"Matricula: " + this.vendedor.getMatricula() + "\n";
		
	
	
	}
	
	
	
	
	
}
