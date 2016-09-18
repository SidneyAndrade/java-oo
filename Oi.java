public class Oi{
	//constante global
	static int MAIOR=18;

	//metodo principal da classe
	public static void main(String[] args) {
		//imprimir na tela
		System.out.println("Olá Mundo");

		//tipos de atributos
		String  nome = "Sidney";
		System.out.println(nome);

		int idade = 20;
		System.out.println(idade);

		double peso = 35.3;
		System.out.println(peso);

		//retorna o metodo
		teste();

		//passa parametro para o metodo e retorna o resultado
		teste02(idade);

		//calculo de maioridade
		maioridade(nome, idade);
	}
	//metodo sem parametro e sem retorno
	public static void teste(){
		System.out.println("Texto contido no metodo teste");
	}
	//metodo com passagem de parametro e sem retorno
	public static void teste02(int idade){
		System.out.println("Sua idade é: " + idade);
		System.out.println("O doblo da sua idade é : " + (idade+idade));
		System.out.println("Falta: " + (18-idade) + " para sua maioridade");
		//ideal seria 
		int MAIOR = 18;
		System.out.println("Falta: " + (MAIOR-idade) + " para sua maioridade");
		
	}
	public static void maioridade(String nome, int idade){
		System.out.print("Olá: " + nome);
		// a constante maior deve ser criada na classe
		if (idade<=MAIOR) {
			System.out.print(" Você é menor ");
			System.out.println("Sua idade atual é: " + (MAIOR-idade));
		}else {
			System.out.print(" Você é maior ");
			System.out.println("Sua idade atual é: " + idade);
		}
		

	}

}