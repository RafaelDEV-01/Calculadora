package Metodos;

import javaPOO.AtributosClasses;

public class Calculadora {

	public static void main(String[] args) {
		CalcularMetodos calc = new CalcularMetodos();
		double resposta = calc.somar(79, 92);
		double resposta1 = calc.somar(38, 44, 89);
		double resposta2 = calc.mult(9.5, 18);
		double resposta3 = calc.div(2223, 13);
		double resposta4 = calc.sub(432,261);
		System.out.printf("Soma:  %.2f \nSoma2: %.2f \nMult:  %.2f \nDiv:   %.2f \nSub:   %.2f",resposta,resposta1,resposta2,resposta3,resposta4);
		
		
	}

}
