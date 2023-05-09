package projectoPI;
import java.util.Scanner;
public class Cod_PI {
		public static void main(String args[]) {
		
//		PARTE COLETIVA      PARTE COLETIVA         PARTE COLETIVA            PARTE COLETIVA         PARTE COLETIVA          PARTE COLETIVA            PARTE COLETIVA           PARTE COLETIVA
		Scanner rec = new Scanner (System.in);
		String resp,resp31;
		double gs=0, carbon=0;
		int tpGas, resp2,resp3,resp4,resp5;
		int cont=0,cont1=0, cont2=0, cont3=0,cont4=0;
		
		
		System.out.println("Olá, bem vindo ao Clean Carbon. Vamos começar...\n"
				+ "Digite quantas pessoas moram com você?:");
		int fml=rec.nextInt();
		
		System.out.println("Qual o KWh da sua última conta? ");
		int kwfml=rec.nextInt();
		
		do {
			if (cont>0) {
				System.out.println("Opção Inválida");
			}
			System.out.println("O gás na sua casa é canalizdo ou é botijão? \n"
				+ "1 - Gás canalizado \n"
				+ "2 - Gás botijão ");
			tpGas=rec.nextInt();   //RESPOSTA 1
			cont++;
		
		}while((tpGas!=1) && (tpGas!=2));
		
		if(tpGas==1) {
			System.out.printf("Qual o consumo da última conta em metros cubicos? \n");
			gs=rec.nextInt();
			gs= gs*105;
		}else{
			System.out.printf("Quantos botijões você compra por mês? \n");
			gs=rec.nextInt();
			gs= (gs*5.2)*105;
		}
		
		
		do {
			if(cont1>0) {
				System.out.println("Opção inválida");
			}
			System.out.println("Sua família recicla alumínio? \n"
					+ "1. SIM \n"
					+ "2. NÃO");
			resp2 = rec.nextInt();    //RESPOSTA 2
			cont1++;
			
			System.out.println(resp2);
		}while( resp2!=1 && resp2!=2 ) ; 
		
		
		if(resp2==2 ) {
			carbon=+166;
		}
		System.out.println("Dados recebidos");
		
		
		do {
			if (cont2>0) {
				System.out.println("Opção inválida");
			}
			System.out.println("Sua família viajou de avião no último ano? \n"
					 					+ "1. SIM \n"
										+ "2. NÃO");
			resp3 = rec.nextInt();      //RESPOSTA 3
			cont2++;
		}while(resp3!=1 && resp3!=2);
		
		if(resp3==1) {
			do {
				if(cont3>0) {
					System.out.println("Opção inválida");
				}
				System.out.println("Foi uma viagem de duração maior que 4 horas? \n"
						+ "1. SIM \n"
						+ "2. NÃO");
				resp4=rec.nextInt();  //RESPOSTA 4
				cont3++;
				
			}while(resp4!=1 && resp4!=2);
			
			if(resp4==1) {
				carbon=+4400;
			}else{
				carbon=+1100;
			}
			System.out.println("Dado recebido");
		}else{
			System.out.println("Dado recebido");
		}
		
		do {
			if(cont4>0) {
				System.out.println("Opção inválida");
			}
			System.out.println("Sua família recicla papel? \n"
					+ "1. SIM \n"
					+ "2. NÃO");
			resp5=rec.nextInt();     //RESPOSTA 5
			cont4++;
		}while(resp5!=1 && resp5!=2);
				
		if(resp5==2) {
			carbon=+184;
		}
		System.out.println("Dados recebidos");
		
	
		
//      PARTE INDIVIDUAL     PARTE INDIVIDUAL        PARTE INDIVIDUAL          PARTE INDIVIDUAL         PARTE INDIVIDUAL            PARTE INDIVIDUAL          PARTE INDIVIDUAL         PARTE INDIVIDUAL  

		double consuOnibus,consuMetro,qntkilometros,qntkilometros2,ltM,consGasol,consEt;
		

		System.out.println("Você possui veículo(s)?");
		resp31=rec.nextLine();
				
		if(resp31.equalsIgnoreCase("SIM")) {

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
		}else if(resp31.equalsIgnoreCase("NÃƒO")) {
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
			
			