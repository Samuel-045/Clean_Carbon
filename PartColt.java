package projeto_PI;

import java.util.Scanner;

public class PartColt {
	static Scanner rec = new Scanner(System.in);
	static double recur_nat=0, nResci=0, carbonCol = 0;
	static int fml;
	
	public static void partColt() {
		double gs = 0;
		int tpBand, tpGas, resp2, resp3, resp4, resp5;
		int cont = 0, cont01 = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
		
		System.out.println(
				"Ol�, bem vindo ao Clean Carbon. Vamos come�ar...\n"
				+ "Digite quantas pessoas moram com voc�:");
		fml = rec.nextInt();

		System.out.println("Qual o KWh da sua �ltima conta? ");
		double kwfml = rec.nextDouble();

		do {
			if (cont01 > 0) {
				System.out.println("Op��o inv�lida");
			}
			System.out.println(
					"Qual bandeira qua aparece na sua conta? \n" + "1. Verde \n"
							+ "2. Amarela \n" 
							+ "3. Vermelha");
			tpBand = rec.nextInt();
			cont01++;
		} while ((tpBand != 1) && (tpBand != 2) && (tpBand != 3));

		if (tpBand == 1) {
			carbonCol = +0.2 * kwfml;
			kwfml+= kwfml * 0.2;
		} else if (tpBand == 2) {
			carbonCol = +0.7 * kwfml;
			kwfml+= kwfml * 0.7;
		} else {
			carbonCol = +0.9 * kwfml;
			kwfml= + kwfml * 0.9;
		}

		do {
			if (cont > 0) {
				System.out.println("Op��o Inv�lida");
			}
			System.out.println(
					"O g�s na sua casa � canalizdo ou � botij�o? \n"
					+ "1 - g�s canalizado \n" 
					+ "2 - g�s botij�o ");
			tpGas = rec.nextInt(); // RESPOSTA 1
			cont++;

		} while ((tpGas != 1) && (tpGas != 2));

		if (tpGas == 1) {
			System.out.printf("Qual o consumo da �ltima conta em metros cubicos? \n");
			gs = rec.nextInt();
			gs = gs * 105;
		} else {
			System.out.printf("Quantos botij�es voc� compra por m�s? \n");
			gs = rec.nextInt();
			gs = (gs * 5.2) * 105;
		}
		
		recur_nat= gs+kwfml;

		do {
			if (cont1 > 0) {
				System.out.println("Op��o Inv�lida");
			}
			System.out.println("Sua fam�lia recicla alum�nio? \n"
					+ "1. SIM \n" 
					+ "2. N�O");
			resp2 = rec.nextInt(); // RESPOSTA 2
			cont1++;

		} while ((resp2 != 1) && (resp2 != 2));

		if (resp2 == 2) {
			carbonCol +=166;
			nResci += 166;
		}
		System.out.println("Dados recebidos");

		do {
			if (cont4 > 0) {
				System.out.println("Op��o Inv�lida");
			}
			System.out.println("Sua fam�lia recicla papel? \n"
					+ "1. SIM \n" 
					+ "2. N�O");
			resp5 = rec.nextInt(); // RESPOSTA 5
			cont4++;
		} while ((resp5 != 1) && (resp5 != 2));

		if (resp5 == 2) {
			carbonCol +=184;
			nResci+=184;
		}
		System.out.println("Dados recebidos");

		do {
			if (cont2 > 0) {
				System.out.println("Op��o Inv�lida");
			}
			System.out.println("Sua fam�lia viajou de avi�o no �ltimo ano? \n"
					+ "1. SIM \n" 
					+ "2. N�O");
			resp3 = rec.nextInt(); // RESPOSTA 3
			cont2++;
		} while ((resp3 != 1) && (resp3 != 2));

		if (resp3 == 1) {
			do {
				if (cont3 > 0) {
					System.out.println("Op��o Inv�lida");
				}
				System.out.println("Foi uma viagem de dura��o maior que 4 horas? \n"
						+ "1. SIM \n"
						+ "2. N�O");
				resp4 = rec.nextInt(); // RESPOSTA 4
				cont3++;

			} while ((resp4 != 1) && (resp4 != 2));

			if (resp4 == 1) {
				carbonCol +=4400;
			} else {
				carbonCol +=1100;
			}
			System.out.println("Dado recebido");
		} else {
			System.out.println("Dado recebido");
		}

		
	}


}
