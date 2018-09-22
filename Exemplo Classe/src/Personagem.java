/*	Programação Orientada a Objeto
 * 	Prof. Orlewilson B. Maia
 * 	Autor (a): 	Linton Nilson da Silva Pereira Junior
 *	Data:		31/08/2018 
 *	Descrição:	Exemplo de Classe abstraindo de um personagem de videogame
 * 
 */

// classe que representará um personagem
public class Personagem {

	// atributos (características)
	// Atributos do tipo String recebem valores entre " "
	String 	nome, cor, cabelo, roupa, olhos, dataNascimento, email, telefone;
	
	// Atributos do tipo boolean recebem valores true ou false
	boolean bigode, sapato, luvas, botoes, chapeu;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCabelo() {
		return cabelo;
	}

	public void setCabelo(String cabelo) {
		this.cabelo = cabelo;
	}

	public String getRoupa() {
		return roupa;
	}

	public void setRoupa(String roupa) {
		this.roupa = roupa;
	}

	public String getOlhos() {
		return olhos;
	}

	public void setOlhos(String olhos) {
		this.olhos = olhos;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean getBigode() {
		return bigode;
	}

	public void setBigode(boolean bigode) {
		this.bigode = bigode;
	}

	public boolean getSapato() {
		return sapato;
	}

	public void setSapato(boolean sapato) {
		this.sapato = sapato;
	}

	public boolean getLuvas() {
		return luvas;
	}

	public void setLuvas(boolean luvas) {
		this.luvas = luvas;
	}

	public boolean getBotoes() {
		return botoes;
	}

	public void setBotoes(boolean botoes) {
		this.botoes = botoes;
	}

	public boolean getChapeu() {
		return chapeu;
	}

	public void setChapeu(boolean chapeu) {
		this.chapeu = chapeu;
	}
	
	
}