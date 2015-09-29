package busca.linear;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		
		char[] caracteres = carregarVetor();
		int retornoPesquisa = contains(caracteres, 'c');
		
		if (retornoPesquisa >= 0) {
			System.out.println("LEtra encontrada na posição ["+(retornoPesquisa+1)+"].");
		}else{
			System.out.println("Letra não encontrada!");
		}
		
		
	}
	private static int contains(char[] caracteres, char caractere){
		for (int i = 0; i < caracteres.length; i++) {
			if (caracteres[i]== caractere) {
				return i;
			}
		}
		
		return -1;
		
	}
	private static char[] carregarVetor(){
		char[] caracteres = new char[5];
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println("Informe o caractere da posição ["+(i+1)+"]: ");
			caracteres[i]=entrada.next().charAt(0);
			
		}
		
		entrada.close();
		return caracteres;
	}

}
