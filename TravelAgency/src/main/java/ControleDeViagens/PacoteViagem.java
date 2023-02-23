package ControleDeViagens;

public class PacoteViagem {
	private String diarias;
	private String destino;
	private double precoPorPessoa;
	private double valorTotal;
	private int diaCheckIn;
	private int diaCheckOut;
	private int mesCheckIn;
	private int mesCheckOut;
	
	public void calculoCheckOut(int diaCheckIn, int mesCheckIn){
		this.diaCheckIn = diaCheckIn;
		this.mesCheckIn = mesCheckIn;
		this.diaCheckOut = diaCheckIn+2;
		this.mesCheckOut = mesCheckIn;
		if(this.diaCheckOut>30) {
			this.diaCheckOut=diaCheckOut-30;
			this.mesCheckOut=this.mesCheckIn+1;
			if(this.mesCheckOut>=13) {
				this.mesCheckOut = this.mesCheckOut-12;
			}
		}	
	}
	
	public double pacote1(int numAcompanhantes) {
		this.diarias = "sex/sáb/dom";
		this.destino = "Rio de Janeiro";
		this.precoPorPessoa = 2500;
		this.valorTotal = precoPorPessoa + (numAcompanhantes*precoPorPessoa);
		return valorTotal;
	}
	
	public double pacote2(int numAcompanhantes) {
		this.diarias = "sex/sáb/dom";
		this.destino = "Minas Gerais";
		this.precoPorPessoa = 1800;
		this.valorTotal = precoPorPessoa + (numAcompanhantes*precoPorPessoa);
		return valorTotal;
	}
	
	public double pacote3(int numAcompanhantes) {
		this.diarias = "sex/sáb/dom";
		this.destino = "Bahia";
		this.precoPorPessoa = 3500;
		this.valorTotal = precoPorPessoa + (numAcompanhantes*precoPorPessoa);
		return valorTotal;
	}
	public double pacote4(int numAcompanhantes) {
		this.diarias = "sex/sáb/dom";
		this.destino = "Santa Catarina";
		this.precoPorPessoa = 2800;
		this.valorTotal = precoPorPessoa + (numAcompanhantes*precoPorPessoa);
		return valorTotal;
	}
	
	
	public String getDiarias() {
		return diarias;
	}
	public void setDiarias(String diarias) {
		this.diarias = diarias;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getPrecoPorPessoa() {
		return precoPorPessoa;
	}
	public void setPrecoPorPessoa(double precoPorPessoa) {
		this.precoPorPessoa = precoPorPessoa;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	
	public int getDiaCheckIn() {
		return diaCheckIn;
	}
	public void setDiaCheckIn(int diaCheckIn) {
		this.diaCheckIn = diaCheckIn;
	}
	public int getDiaCheckOut() {
		return diaCheckOut;
	}
	public void setDiaCheckOut(int diaCheckOut) {
		this.diaCheckOut = diaCheckOut;
	}
	public int getMesCheckIn() {
		return mesCheckIn;
	}
	public void setMesCheckIn(int mesCheckIn) {
		this.mesCheckIn = mesCheckIn;
	}
	public int getMesCheckOut() {
		return mesCheckOut;
	}
	public void setMesCheckOut(int mesCheckOut) {
		this.mesCheckOut = mesCheckOut;
	}
	
}
