package br.com.dio;

import br.com.dio.model.gato;

public class primeiroprograma {

	public static void main(String[] args) {
  
		gato Gato = new gato();
		Livros livros = new Livros();
	    
		System.out.println(Gato);
		System.out.println(livros);
		
		/*int a = 2;
        int b = 3;
	    System.out.println("Hello World! " + (a+b));*/	
	}

}

class livros {
	private String nome;
	private String npag;
}

