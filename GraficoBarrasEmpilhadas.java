package projeto_PI;

public class GraficoBarrasEmpilhadas {
	

	public static void GerarGrafico(double[] valores, String[] cores, double [] valores2) {
		String[] eixoY = { "Abaixo de 2000", "", "Entre 3000 e 5000", "", "Acima de 7000" };

		int alturaMaxima = 5;// Arrays.stream(valores).max().orElse(0); // Altura máxima das barras

		for (int linha = alturaMaxima; linha > 0; linha--) {

			System.out.printf("%-19s|  ", eixoY[linha - 1]);
			for (int coluna = 0; coluna < valores.length; coluna++) {
				if (valores2[coluna] >= linha) {
					System.out.print(cores[coluna] + "### \u001B[0m  " ); // Caractere para representar a barra
				} else {
					System.out.print("      ");
				}
				
				
				
			}
			switch (linha) {
			case 5:
				System.out.print("|  Legenda:");
				break;
			case 4:
				System.out.print("|");
				break;
			case 3:
				System.out.print("|  \u001B[31m###\u001B[0m Queima de combustíveis fósseis");
				break;
			case 2:
				System.out.print("|  \u001B[32m###\u001B[0m Consumo de recursos naturais");
				break;
			case 1:
				System.out.print("|  \u001B[34m###\u001B[0m Não reciclagem ");
				break;
			default:
				break;
			}
			
			System.out.println();
		}
		System.out.printf("%-19s %5.0f %5.0f %5.0f", "", valores[0], valores[1], valores[2]);
	}


}
