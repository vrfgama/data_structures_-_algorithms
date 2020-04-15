package pilha;

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

		Pilha.empilha(u1);
		Pilha.empilha(u2);
		Pilha.empilha(u3);
		
		System.out.println(Pilha.cont());
		
		Usuario usuario= Pilha.ultimo();
		System.out.println(usuario);
		
		Pilha.desempilha();
		Pilha.desempilha();
		System.out.println(Pilha.cont());
		
		usuario= Pilha.ultimo();
		System.out.println(usuario);
		
		Pilha.desempilha();
		
		usuario= Pilha.ultimo();
		System.out.println(usuario);
	}
	
}
