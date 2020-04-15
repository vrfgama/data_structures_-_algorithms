package fila;

import java.util.ArrayList;

public class Fila {
	
	static ArrayList<Usuario> fila= new ArrayList<Usuario>();
	
	
	public static void enfilera(Usuario usuario ) {
		fila.add(usuario);
	}
	
	
	public static boolean vazia() {
		
		boolean aux= false;
		
		if(tamanho() == 0) aux= true;
		
		return aux;
	}
	
	
	public static int tamanho() {
		return fila.size();
	}
	
	
	public static Usuario desenfilera() {
		
		if(!vazia()) {
			Usuario usuario= fila.get(0);
			fila.remove(0);
			return usuario;
		}
		
		return null;
	}
	
	public static Usuario proximo() {
		
		if(!vazia())
			return fila.get(0);
		
		return null;
		
	}
	
}
