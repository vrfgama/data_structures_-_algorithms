package fila;

import java.util.ArrayList;

public class Fila {
	
	static ArrayList<Usuario> fila= new ArrayList<Usuario>();
	static int cursor= 0;
	
	
	public static void enfilera(Usuario usuario ) {
		fila.add(usuario);
	}
	
	
	public static boolean vazia() {
		
		boolean aux= false;
		
		if(tamanho() == 0) aux= true;
		
		return aux;
	}
	
	
	public static int tamanho() {
		return ( fila.size() - cursor );
	}
	
	
	public static Usuario desenfilera() {
		
		if(!vazia()) {
			Usuario usuario= fila.get(cursor);
			cursor+= 1;
			return usuario;
		}
		
		return null;
	}
	
	public static Usuario proximo() {
		
		if(!vazia())
			return fila.get(cursor);
		
		return null;
		
	}

}
