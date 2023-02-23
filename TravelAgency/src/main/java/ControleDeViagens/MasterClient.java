package ControleDeViagens;

public class MasterClient extends AbstrataDescontos{
	

	public MasterClient(String oNome, String oCpf, String oSexo, String aIdade, String oTelefone, String oEmail,
			String oPlano) {
		super(oNome, oCpf, oSexo, aIdade, oTelefone, oEmail, oPlano);
		// TODO Auto-generated constructor stub
	}

	private double valor;

	@Override
	public double Desconto() {
		double comDesconto = valor*0.90;
		return comDesconto;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
