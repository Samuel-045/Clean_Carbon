package projeto_PI;

import java.util.Scanner;

public class PartInd {
	static Scanner rec = new Scanner(System.in);
	static double conComb=0 ;
	static double recur_nat = PartColt.recur_nat;
	
	public static void partIndv(int fml, double carbonCol, double nResci ) {
		double carbonInd = 0, consuOnibus=0, consuMetro=0, qntkilometros, qntkilometros2, ltM;
		int tpCombut, tpVeicl, resp6, resp7, resp8;
		int cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0, cont9 = 0, cont10 = 0, cont11 = 0, cont12 = 0;

		do {
			if (cont5 > 0) {
				System.out.println("Op��o Inv�lida");
			}
			System.out.println("Voc� possui ve�culo(s)? \n"
					+ "1. SIM \n" 
					+ "2. N�O ");
			resp6 = rec.nextInt();
			cont5++;
		} while ((resp6 != 1) && (resp6 != 2));

		if (resp6 == 1) {

			do {
				if (cont6 > 0) {
					System.out.println("Op��o Inv�lida");
				}
				System.out.println("O ve�culo � carro ou moto? \n"
						+ "1.carro \n" 
						+ "2.moto \n" 
						+ "3.carro e moto ");
				tpVeicl = rec.nextInt();
				cont6++;
			} while ((tpVeicl != 1) && (tpVeicl != 2) && (tpVeicl != 3));

			if (tpVeicl == 1) {
				do {
					if (cont7 > 0) {
						System.out.println("Op��o Inv�lida");
					}
					System.out.println("Qual tipo de combust�vel � usado? \n"
							+ " 1.Etanol \n "
							+ "2.Gasolina");
					tpCombut = rec.nextInt();
					cont7++;
				} while ((tpCombut != 1) && (tpCombut != 2));

				if (tpCombut == 1) {
					System.out.println(
							"Quantos litros voc� abastece por m�s? (visto que o consumo m�dio no Brasil � de 12km por litro)");
					ltM = rec.nextInt();
					carbonInd += ltM * 0.82 * 0.75 * 3.7; // = total de kg CO2 emitido por litro.
					conComb +=ltM * 0.82 * 0.75 * 3.7;
				} else {
					System.out.println(
							"Quantos litros voc� abastece por m�s? (visto que o consumo m�dio no Brasil � de 12km por litro)");
					ltM = rec.nextInt();
					carbonInd +=(ltM * 789) / 19.5 * 1.59;
					conComb +=(ltM * 789) / 19.5 * 1.59;
				}

			} else if (tpVeicl == 2) {
				do {
					if (cont8 > 0) {
						System.out.println("Op��o Inv�lida");
					}
					System.out.println("Qual tipo de combust�vel � usado? \n" + "1.Etanol \n" + "2.Gasolina");
					tpCombut = rec.nextInt();
					cont8++;
				} while ((tpCombut != 1) && (tpCombut != 2));

				if (tpCombut == 1) {
					System.out.println(
							"Quantos litros voc� abastece por m�s? (visto que o consumo m�dio no Brasil � de 12km por litro)");
					ltM = rec.nextDouble();
					carbonInd +=ltM * 0.82 * 0.75 * 3.7;
					conComb +=ltM * 0.82 * 0.75 * 3.7;
				} else {
					System.out.println(
							"Quantos litros voc� abastece por m�s? (visto que o consumo m�dio no Brasil � de 12km por litro)");
					ltM = rec.nextDouble();
					carbonInd +=(ltM * 789) / 19.5 * 1.59;
					conComb +=(ltM * 789) / 19.5 * 1.59;
				}

			} else {
				do {
					if (cont9 > 0) {
						System.out.println("Op��o Inv�lida");
					}
					System.out.println("Qual tipo de combust�vel � usado no carro? \n"
							+ "1.Etanol \n" 
							+ "2.Gasolina");
					tpCombut = rec.nextInt();
					cont9++;
				} while ((tpCombut != 1) && (tpCombut != 2));

				if (tpCombut == 1) {
					System.out.println(
							"Quantos litros voc� abastece por m�s no carro? (visto que o consumo m�dio no Brasil � de 12km por litro)");
					ltM = rec.nextInt();
					carbonInd +=ltM * 0.82 * 0.75 * 3.7;//  total de kg CO2 emitido por litro.
					conComb +=ltM * 0.82 * 0.75 * 3.7;
				} else {
					System.out.println(
							"Quantos litros voc� abastece por m�s no carro? (visto que o consumo m�dio no Brasil � de 12km por litro)");
					ltM = rec.nextInt();
					carbonInd +=(ltM * 789) / 19.5 * 1.59;
					conComb +=(ltM * 789) / 19.5 * 1.59;
				}

				do {
					if (cont10 > 0) {
						System.out.println("Op��o Inv�lida");
					}
					System.out.println("Qual tipo de combust�vel � usado na moto? \n" + "1.Etanol \n" + "2.Gasolina");
					tpCombut = rec.nextInt();
					cont10++;
				} while ((tpCombut != 1) && (tpCombut != 2));

				if (tpCombut == 1) {
					System.out.println(
							"Quantos litros voc� abastece por m�s na moto? (visto que o consumo m�dio no Brasil � de 12km por litro)");
					ltM = rec.nextInt();
					carbonInd +=ltM * 0.82 * 0.75 * 3.7; // = total de kg CO2 emitido por litro.
					conComb +=ltM * 0.82 * 0.75 * 3.7;
				} else {
					System.out.println(
							"Quantos litros voc� abastece por m�s na moto? (visto que o consumo m�dio no Brasil � de 12km por litro)");
					ltM = rec.nextInt();
					carbonInd +=(ltM * 789) / 19.5 * 1.59;
					conComb +=(ltM * 789) / 19.5 * 1.59;
				}

			}

		} else {
			do {
				if (cont11 > 0) {
					System.out.println("Op��o Inv�lida");
				}
				System.out.println("voc� usa outro meio de locomo��o? \n"
						+ "1.SIM \n" 
						+ "2.N�O");
				resp7 = rec.nextInt();
				cont11++;/////////////

			} while ((resp7 != 1) && (resp7 != 2));

			if (resp7 == 1) {
				do {
					if (cont12 > 0) {
						System.out.println("Op��o Inv�lida");
					}
					System.out.println("Qual meio de locomo��o voc� usa? \n" + "1.metro/trem \n" + "2.onibus \n"
							+ "3.metro/trem e onibus");
					resp8 = rec.nextInt();
					cont12++;
				} while ((resp8 != 1) && (resp8 != 2) && (resp8 != 3));

				if (resp8 == 1) {
					System.out.println("Quantos kilometros voc� percorre por m�s?");
					qntkilometros = rec.nextDouble();
					consuMetro = 3.16 * qntkilometros;
					carbonInd +=consuMetro;

				} else if (resp8 == 2) {
					System.out.println("Quantos kilometros voc� percorre por m�s?");
					qntkilometros = rec.nextDouble();
					consuOnibus = 1.28 * qntkilometros;
					carbonInd +=consuOnibus;

				} else {
					System.out.println("Quantos kilometros voc� percorre por m�s no metro/trem?");
					qntkilometros = rec.nextInt();
					consuMetro = 3.16 * qntkilometros;

					System.out.println("Quantos kilometros voc� percorre por m�s no onibus?");
					qntkilometros2 = rec.nextInt();
					consuOnibus = 3.16 * qntkilometros2;

					double consOni_Metro = consuMetro + consuOnibus;
					carbonInd +=consOni_Metro;

				}

			} else {
				System.out.println("Dados recebidos");
			}

		}

		carbonInd = carbonInd * fml;

		System.out.printf("\nSua produ��o de carbono coletiva �: %.2f tCO2 \n" 
		                  + "Sua produ��o individual �: %.2f tCO2 \n",
				carbonCol, carbonInd);

		double carbonTL = carbonCol + carbonInd;

		if (carbonTL > 7000) {
			System.out.printf("A jun��o de produ��o individual e coletiva � : %.2f tCO2 \n"
					+ "voc� est� produzindo muito carbono, procure diminuir rapidamente a produ��o de carbono. \n",
					carbonTL);
		} else if ((carbonTL > 2000) && (carbonTL <= 6999)) {
			System.out.printf(
					"A jun��o de produ��o individual e coletiva � : %.2f tCO2 \n"
							+ "voc� est� produzindo carbono de forma moderada, tome cuidado com a produ��o de carbono. \n",
					carbonTL);
		} else {
			System.out.printf("A jun��o de produ��o individual e coletiva � : %.2f tCO2 \n"
					+ "voc� est� produzindo pouquiss�ma qunatidade de carbono. Parab�ns, o planeta te agradece. \n",
					carbonTL);
		}

		double conComb2=0;
		if(conComb<2000) {
			conComb2=1;			
		}else if((conComb>=2001) && (conComb<=2999)) {
			conComb2=2;
		}else if((conComb>=3000) && (conComb<=5000)) {
			conComb2=3;
		}else if((conComb>=5001) && (conComb<=6999)) {
			conComb2=4;
		}else {
			conComb2=5;
		}
		
		double recur_nat2=0;
		if(recur_nat<2000) {
			recur_nat2=1;			
		}else if((recur_nat>=2001) && (recur_nat<=2999)) {
			recur_nat2=2;
		}else if((recur_nat>=3000) && (recur_nat<=5000)) {
			recur_nat2=3;
		}else if((recur_nat>=5001) && (recur_nat<=6999)) {
			recur_nat2=4;
		}else {
			recur_nat2=5;
		}
		
		double nResci2=0;
		if(nResci<2000) {
			nResci2=1;			
		}else if((nResci>=2001) && (nResci<=2999)) {
			nResci2=2;
		}else if((nResci>=3000) && (nResci<=5000)) {
			nResci2=3;
		}else if((nResci>=5001) && (nResci<=6999)) {
			nResci2=4;
		}else {
			nResci2=5;
		}
		
		
		double[] valores = {conComb ,PartColt.recur_nat ,PartColt.nResci }; // Valores para eixo x
		double[] valores2 = {conComb2 ,recur_nat2 ,nResci2 }; // Valores para eixo y
	    String[] cores = {"\u001B[31m", "\u001B[32m", "\u001B[34m"}; // Cores para cada valor

		GraficoBarrasEmpilhadas.GerarGrafico(valores,cores,valores2);
	}
}
