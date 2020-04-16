package pilha;

import java.util.ArrayList;

public class Pilha {
	
	static ArrayList<Usuario> pilha= new ArrayList<Usuario>();
	static int aux= -1;
	
	public static void empilha(Usuario usuario) {
		pilha.add(usuario);
		aux+= 1;
	}
	
	public static Usuario desempilha() {
		
		if(!vazia()) {
			Usuario usuario= pilha.get(aux);
			aux-= 1;			
			return usuario;
		}else {
			return null;
		}
		
	}
	
	public static int cont() {
		return aux +1;
	}
	
	public static Usuario ultimo() {
		
		if(!vazia()) {
			Usuario usuario= pilha.get(aux);				
			return usuario;
		}else {
			return null;
		}
		
	}
	
	public static boolean vazia() {
		
		boolean vazia= true;
		if(aux > -1) vazia= false;
		
		return vazia;
		
	}
	
}
