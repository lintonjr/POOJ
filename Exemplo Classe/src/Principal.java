/*	Programação Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autor (a): 	Linton Nilson da Silva Pereira Junior
 *	Data:		31/08/2018 
 *	Descrição:	Executar o projeto exemplo de Classe abstraindo de um personagem de videogame
 * 
 */

public class Principal {

	// método principal da classe para executar
	public static void main(String[] args) {

		// criando objetos
		Personagem mario = new Personagem();


		// atribuindo valores as características do objeto Mario
		mario.setNome("Mario Bros");
		mario.setCor("Branco");
		mario.setCabelo("Castanho");
		mario.setRoupa("Vermelha");
		mario.setOlhos("Pretos");
		mario.setDataNascimento("17/10/1988");
		mario.setEmail("lintonjr@hotmail.com");
		mario.setTelefone("1155-44999");
		mario.setBigode(true);
		mario.setSapato(true);
		mario.setLuvas(true);
		mario.setBotoes(true);
		mario.setChapeu(true);

		// mostrar valores dos atributos no console
		System.out.println("----- Personagem Mario -----");
		System.out.println("Nome: " + mario.getNome());
		System.out.println("Cor: " + mario.getCor());
		System.out.println("Cabelo: " + mario.getCabelo());
		System.out.println("Roupa: " + mario.getRoupa());
		System.out.println("Olhos: " + mario.getOlhos());
		System.out.println("Data Nascimento: " + mario.getDataNascimento());
		System.out.println("E-mail: " + mario.getEmail());
		System.out.println("Telefone: " + mario.getTelefone());
		System.out.println("Bigode: " + mario.getBigode());
		System.out.println("Sapato: " + mario.getSapato());
		System.out.println("Luvas: " + mario.getLuvas());
		System.out.println("Botões: " + mario.getBotoes());
		System.out.println("Chapeu: " + mario.getChapeu() + "\n");

	}
}
