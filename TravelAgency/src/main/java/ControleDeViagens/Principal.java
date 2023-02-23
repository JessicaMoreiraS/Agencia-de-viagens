package ControleDeViagens;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PacoteViagem pacoteEscolhido = new PacoteViagem();
		
		
		StandardClient p1 = new StandardClient("Mauricio", "111.111.111-11", "Masculino", "20", "4040-4040", "mauricio@gmail.com", "StandardClient");
		BlueClient p2 = new BlueClient("Julia", "222.222.222-22", "Feminino", "47", "5050-5050", "julia@gmail.com", "BlueClient");
		MasterClient p3 = new MasterClient("Carla", "333.333.333-33", "Feminino", "35", "6060-6060", "carla@gmail.com", "MasterClient");
		MasterClient p4 = new MasterClient("Ricardo", "444.444.444-44", "Masculino", "50", "7070-7070", "ricardo@gmail.com", "MasterClient");
		
		//    Vetor para armazenar clientes   
		Cadastro[] clientes = new Cadastro[4];
		clientes[0] = p1;
		clientes[1] = p2;
		clientes[2] = p3;
		clientes[3] = p4;
		
		String[] formasDePagamento = {"PIX", "Cartão de Crédito", "Cartão de Débito", "Boleto"};
		
		for(;;) {
			System.out.println(" ");
			System.out.println("Gostaria de comprar um pacote de viagem? \n1- Sim \n2- Não");
			int respostaCompra = in.nextInt();
			if(respostaCompra == 1) {
				in.nextLine();
				
//			     Recolher as informacoes necessarias do cliente:
				System.out.println("Digite o CPF do Cliente:");
				String respostaCpf = in.nextLine();
				
				System.out.println("Qual pacote deseja comprar? \n1-pacote1 (3 dias - Rio de Janeiro - R$2500,00) \n2-Pacote2 (3 dias - Minas Gerais - R$1800,00) \n3-Pacote3 (3 dias - Bahia - R$3500,00) \n4-Pacote4 (3 dias - Santa Catarina - R$2800,00)");
				int respostaPacote = in.nextInt();
				
				System.out.println("Quantos acompanhantes: ");
				int numDeAcompanhantes = in.nextInt();
				
				System.out.println("Número do mês do Check-in:");
				int respostaMesCheckIn = in.nextInt();
				
				System.out.println("Dia de Check-in:");
				int respostaDiaCheckIn = in.nextInt();
				
				System.out.println("Escolha a forma de pagamento: \n1-PIX \n2-Cartão de Crédito \n3-Cartão de Débito \n4-Boleto");
				int respostaFormaPagamento = in.nextInt();
				
				
				//   For para encontrar o cliente e para a impressao das informacoes    
				for(int x=0; x<clientes.length; x++) {
					if(clientes[x].getCpf().equals(respostaCpf)) {
						System.out.println("  ");
						System.out.println("---DADOS DO CLIENTE---");
						clientes[x].impressaoDeDados(clientes[x]);
						System.out.println(" ");
						
						
						//Identificacao e impressao do pacote escolhido
						if(respostaPacote >0 & respostaPacote <5) {
							System.out.println(" ");
							System.out.println("---DADOS DA VIAGEM---");
							if(respostaPacote == 1) {
								System.out.println("Valor total: R$" + pacoteEscolhido.pacote1(numDeAcompanhantes));
							}
							if(respostaPacote == 2) {
								System.out.println("Valor total: R$" + pacoteEscolhido.pacote2(numDeAcompanhantes));
							}
							if(respostaPacote == 3) {
								System.out.println("Valor total: R$" + pacoteEscolhido.pacote3(numDeAcompanhantes));	
							}
							if(respostaPacote == 4) {
								System.out.println("Valor total: R$" + pacoteEscolhido.pacote4(numDeAcompanhantes));
							}
							System.out.println("Destino: " + pacoteEscolhido.getDestino());
							System.out.println("Data do Check-in: " + respostaDiaCheckIn + "/" + respostaMesCheckIn);
							pacoteEscolhido.calculoCheckOut(respostaDiaCheckIn, respostaMesCheckIn);
							System.out.println("Data do Check-out: " + pacoteEscolhido.getDiaCheckOut() +"/"+ pacoteEscolhido.getMesCheckOut());
						}else {
							System.out.println("Pacote não encontrado");
						}
							
						// For para identificacao do plano do cliente e utlizacao do metodo do desconto
						for(Cadastro comprador: clientes) {
							if(clientes[x].getPlanoCliente().equals("StandardClient")) {
								StandardClient oComprador = (StandardClient) comprador;
								oComprador.setValor(pacoteEscolhido.getValorTotal());
								System.out.println("Diarias: " + pacoteEscolhido.getDiarias());
								System.out.println("Valor com desconto: R$" + oComprador.Desconto());
								break;
							}
							
							if(comprador instanceof BlueClient) {
								BlueClient oComprador = (BlueClient) comprador;
								oComprador.setValor(pacoteEscolhido.getValorTotal());
								System.out.println("Valor com desconto: R$" + oComprador.Desconto());
								break;
							}
							
							if(comprador instanceof MasterClient) {
								MasterClient oComprador = (MasterClient) comprador;
								oComprador.setValor(pacoteEscolhido.getValorTotal());
								System.out.println("Valor com desconto: R$" + oComprador.Desconto());
								break;
							}
						}
						
						//impressão da forma de pagamento
						for(int a = 0; a<formasDePagamento.length; a++ ) {
							if(respostaFormaPagamento == a+1) {
								System.out.println("Pagamento via " + formasDePagamento[a]);
								System.out.println(" ");
							}
						}
					}
				}
				
			}
			if(respostaCompra == 2) {
				System.out.println("Obrigado por usar nossos serviços!");
				break;
			}
		}
		
	}

}
