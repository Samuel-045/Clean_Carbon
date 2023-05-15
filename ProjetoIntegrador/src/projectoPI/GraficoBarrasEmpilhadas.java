package projectoPI;

public class GraficoBarrasEmpilhadas {

//	public static void main(String[] args) {
//		int[] valores = { 3, 5, 2, 4 }; // Valores para cada barra
//		String[] cores = { "\u001B[31m", "\u001B[32m", "\u001B[34m", "\u001B[35m" }; // Cores para cada valor
//		GerarGrafico(valores, cores);
//
//	}

	public static void GerarGrafico(double[] valores, String[] cores) {
		/// int[] valores = {3, 5, 2, 4}; // Valores para cada barra
		// String[] cores = {"\u001B[31m", "\u001B[32m", "\u001B[34m", "\u001B[35m"}; //
		/// Cores para cada valor
		String[] eixoY = { "Abaixo de 3000", "", "Entre 3000 e 6999", "", "Acima de 7000" };

		int alturaMaxima = 5;// Arrays.stream(valores).max().orElse(0); // Altura máxima das barras

		for (int linha = alturaMaxima; linha > 0; linha--) {

			System.out.printf("%-19s|  ", eixoY[linha - 1]);
			for (int coluna = 0; coluna < valores.length; coluna++) {
				if (valores[coluna] >= linha) {
					System.out.print(cores[coluna] + "███\u001B[0m  " ); // Caractere para representar a barra
				} else {
					System.out.print("     ");
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
				System.out.print("|  \u001B[31m███\u001B[0m Queima de combustíveis fósseis");
				break;
			case 2:
				System.out.print("|  \u001B[32m███\u001B[0m Queima de combustíveis fósseis");
				break;
			case 1:
				System.out.print("|  \u001B[34m███\u001B[0m Queima de combustíveis fósseis");
				break;
			default:
				break;
			}
			
			System.out.println();
		}
		System.out.printf("%-20s%5f%5f%5f%5f", "", valores[0], valores[1], valores[2], valores[3]);
	}
}
