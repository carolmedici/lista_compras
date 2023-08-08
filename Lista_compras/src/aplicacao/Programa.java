package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> list = new ArrayList<>();
		
	
		System.out.println("Deseja inserir produto? (s/n)");
		char inserir = sc.next().charAt(0);
		do {
		System.out.println("Insira o nome do produto");
		String nome = sc.next();
		System.out.println("Quantas unidades?");
		int unidade = sc.nextInt();
		System.out.println("Qual o tipo dele?");
		String tipo = sc.next();
		System.out.println("Onde o produto " + nome + " é encontrado?");
		String local = sc.next();
		
		Produto pro = new Produto(nome, tipo, local, unidade);
		list.add(pro);
		
		System.out.println("Deseja inserir produto? (s/n)");
		inserir = sc.next().charAt(0);
		}
		while(inserir == 's');
		
		
		System.out.println("Lista de Compras");
		System.out.println();
		for (Produto pro : list) {
			System.out.println(pro.lista_produto());
		}
		
		sc.close();
	}

}
