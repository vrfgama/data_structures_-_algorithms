package fila;

import fila.Usuario;

public class Main {
	
	public static void main(String[] args) {
		
		Usuario u1= new Usuario();
		u1.setNome("João");
		u1.setIdade(52);
		
		Usuario u2= new Usuario();
		u2.setNome("Maria");
		u2.setIdade(41);
		
		Usuario u3= new Usuario();
		u3.setNome("Manoel");
		u3.setIdade(44);
		
		System.out.println(Fila.tamanho());
		System.out.println(Fila.vazia());
		
		Fila.enfilera(u1);
		Fila.enfilera(u2);
		Fila.enfilera(u3);
		
		System.out.println(Fila.tamanho());
		System.out.println(Fila.vazia());
		System.out.println(Fila.proximo());
		
		Fila.desenfilera();
		Fila.desenfilera();
		
		System.out.println(Fila.tamanho());
		System.out.println(Fila.vazia());
		System.out.println(Fila.proximo());

		Fila.desenfilera();
		Fila.desenfilera();
		
		
		System.out.println(Fila.tamanho());
		System.out.println(Fila.vazia());
		System.out.println(Fila.proximo());
		
	}

}
