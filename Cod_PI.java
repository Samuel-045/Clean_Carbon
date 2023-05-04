package projectoPI;
import java.util.Scanner;
public class Cod_PI {
		public static void main(String args[]) {
		
//		PARTE COLETIVA      PARTE COLETIVA         PARTE COLETIVA            PARTE COLETIVA         PARTE COLETIVA          PARTE COLETIVA            PARTE COLETIVA           PARTE COLETIVA
		Scanner rec = new Scanner (System.in);
		String resp,resp2,respos3,respAv;
		double gs=0, carbon=0;
		
		
		System.out.println("Olá, bem vindo ao Clean Carbon. Vamos comeÃ§ar...\n"
				+ "Digite quantas pessoas moram com vocêª:");
		int fml=rec.nextInt();
		
		System.out.println("Qual o KWh da sua Ãºltima conta? ");
		int kwfml=rec.nextInt();
		
		System.out.println("O gás na sua casa é canalizdo ou é botijão? \n"
				+ "1 - Gás canalizado \n"
				+ "2 - Gás botijão ");
		int tpGas=rec.nextInt();
		
		if(tpGas==1) {
			System.out.printf("Qual o consumo da última conta em metros cubicos? \n");
			gs=rec.nextInt();
			gs= gs*105;
		}else if(tpGas==2){
			System.out.printf("Quantos botijões você compra por mês? \n");
			gs=rec.nextInt();
			gs= (gs*5.2)*105;
		}else {
			System.out.println("Opção inválida");
		}
		
		
		System.out.println("Sua família recicla alumínio? ");
		resp2 = rec.next();
		resp2.toUpperCase();
		if(resp2.equalsIgnoreCase("NÃO")) {
			carbon=+166;
		}
		System.out.println("Dados recebidos");
		
		
		System.out.println("Sua família viajou de avião no último ano? ");
		respos3 = rec.next();
		respos3.toUpperCase();
		
		if(respos3.equalsIgnoreCase("SIM")) {
			System.out.println("Foi uma viagem de duração maior que 4 horas?");
			rec.nextLine();
			respAv = rec.nextLine();
			respAv.toUpperCase();
			
			if(respAv.equalsIgnoreCase("SIM")) {
				carbon=+4400;
			}else if(respAv.equalsIgnoreCase("NÃO")){
				carbon=+1100;
			}else {
				System.out.println("Opção inválida");
			}
			
		}else if(respos3.equalsIgnoreCase("NÃO")){
			System.out.println("Dado recebido");
		}else{
			System.out.println("Opção inválida");
		}
		
		System.out.println("Sua família recicla papel?");
		resp = rec.nextLine();
		resp.toUpperCase();
				
		if(resp.equalsIgnoreCase("NÃO")) {
			carbon=+184;
		}
		System.out.println("Dados recebidos");
		
	
		
//      PARTE INDIVIDUAL     PARTE INDIVIDUAL        PARTE INDIVIDUAL          PARTE INDIVIDUAL         PARTE INDIVIDUAL            PARTE INDIVIDUAL          PARTE INDIVIDUAL         PARTE INDIVIDUAL  
		String resp4;
		double consuOnibus,consuMetro,qntkilometros,qntkilometros2,ltM,consGasol,consEt;
		

		System.out.println("Você possui veículo(s)?");
		resp4=rec.nextLine();
		resp4.toUpperCase();
		
		if(resp4.equalsIgnoreCase("SIM")) {

			System.out.println("O veículo é carro ou moto? \n"
					+ "1.carro \n"
					+ "2.moto ");
			int tpVeicl = rec.nextInt();
			
			if(tpVeicl==1) {
				System.out.println("Qual tipo de combustível é usado? \n"
						+ "1.Etanol \n"
						+ "2.Gasolina");
				int tpCombut = rec.nextInt();
				
				if(tpCombut==1) {
					System.out.println("Quantos litros você abastece por mês?(visto que o consumo médio no Brasil é de 12km por litro)");
					ltM=rec.nextInt();
					carbon =+ ltM * 0.82 * 0.75 * 3.7; //= total de kg CO2 emitido por litro.
				}else if(tpCombut==2) {
					System.out.println("Quantos litros você abastece por mês?(visto que o consumo médio no Brasil é de 12km por litro)");
					ltM=rec.nextInt();
					carbon =+  (ltM * 789)/19.5 * 1.59;
				}else {
					System.out.println("Opção inválida");
				}
				
		    }else if(tpVeicl==2) {
				System.out.println("Qual tipo de combustível é usado? \n"
						+ "1.Etanol \n"
						+ "2.Gasolina");
				int tpComb = rec.nextInt();
				
				if(tpComb==1) {
					System.out.println("Quantos litros você abastece por mês?(visto que o consumo médio no Brasil é de 12km por litro)");
					ltM=rec.nextDouble();
					carbon =+ ltM * 0.82 * 0.75 * 3.7;
				}else if(tpComb==2) {
					System.out.println("Quantos litros você abastece por mês?(visto que o consumo médio no Brasil é de 12km por litro)");
					ltM=rec.nextDouble();
					carbon =+  (ltM * 789)/19.5 * 1.59;
				}else {
					System.out.println("Opção inválida");
				}
			
		    
		    }else {
				System.out.println("Opção inválida");
			}
		}else if(resp4.equalsIgnoreCase("NÃƒO")) {
			System.out.println("Você usa outro meio de locomoção?");
			String respLocom=rec.nextLine();
			respLocom.toUpperCase();
			
			if (respLocom.equalsIgnoreCase("SIM")) {
				System.out.println("Qual meio de locomoção você usa? \n"
						+ "1.metro/trem \n"
						+ "2.onibus \n"
						+ "3.metro/trem e onibus");
				int meLoco=rec.nextInt();
				
				if(meLoco==1) {
					System.out.println("Quantos kilometros você percorre por mês?");
					qntkilometros=rec.nextDouble();
					consuMetro=3.16*qntkilometros;
					carbon=+consuMetro;
					
				}else if (meLoco==2) {
					System.out.println("Quantos kilometros você percorre por mês?");
					qntkilometros=rec.nextDouble();
					consuOnibus=1.28*qntkilometros;
					carbon=+consuOnibus;
					
				}else if(meLoco==3) {
					System.out.println("Quantos kilometros você percorre por mês no metro/trem?");
					qntkilometros=rec.nextInt();
					consuMetro=3.16*qntkilometros;
					
					System.out.println("Quantos kilometros você percorre por mês no onibus?");
					qntkilometros2=rec.nextInt();
					consuOnibus=3.16*qntkilometros;
					
					double consOni_Metro= consuMetro+consuOnibus;
					carbon=+consOni_Metro;
					
				}else{
					System.out.println("Opção inválida");
				}	
				
				
			}else if(respLocom.equalsIgnoreCase("NÃO")){
				System.out.println("Dados recebidos");
			}else {
				System.out.println("Opção inválida");
			}
			
			
		}

		
		
		System.out.printf("Sua produção de carbono é :%.2f ",carbon);
		
		
		

	}
	
}
			
			