package conv.dinheiro;

import java.util.Scanner;

public class main {

	public main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float mostrar = 0, dolar, vreais;
		conversor converte = new conversor();

		System.out.println("DIGITE O VALOR DO DOLAR");
		dolar = sc.nextFloat();

		System.out.println("DIGITE O VALOR DE REAIS A SEREM CONVERTIDOS");
		vreais = sc.nextFloat();

		mostrar = converte.convdolar(dolar, vreais);

		System.out.println("o valor convertido é " + mostrar);

		sc.close();
	}

}
