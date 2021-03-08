package Poo;

import java.util.Scanner;

public class principalAviao {
public static void main(String[] args) {
		
		System.out.println("SISTEMA DE CONTROLE DE VOOS  \n");
		
		Scanner tec = new Scanner(System.in);
		
		aviao aviao1 = new aviao(); 
		
		
		System.out.print("Digite o modelo do Aviao: ");
		aviao1.modeloAviao=tec.next().toUpperCase();
		
		System.out.print("Digite em siglas o local de partida do avião: ");
		aviao1.partida= tec.next();
		
		System.out.print("Digite a quantidade de passageiros: ");
		aviao1.quantidadePassageiros = tec.nextInt();
		
		System.out.print("Digite o destina do voo (1) Russia / (2) Madagascar / (3) Australia: ");
		aviao1.destino=tec.nextInt();
		
		
		
		System.out.printf("\n");
		aviao1.mostra();
		aviao1.mostrarDestino();
		
		tec.close();
	}


}
