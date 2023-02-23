package ControleDeViagens;

public class BlueClient extends AbstrataDescontos{

	public BlueClient(String oNome, String oCpf, String oSexo, String aIdade, String oTelefone, String oEmail,
			String oPlano) {
		super(oNome, oCpf, oSexo, aIdade, oTelefone, oEmail, oPlano);
		// TODO Auto-generated constructor stub
	}
	
	private double valor;

	@Override
	public double Desconto() {
		double comDesconto = valor*0.95;
		return comDesconto;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
