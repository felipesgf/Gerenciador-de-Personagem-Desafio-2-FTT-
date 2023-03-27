package model;

public class Personagem {
	
	private String nome;
	private String desc;
	private String img;
	private String programa;
	private String animador;
	
	public Personagem() {
		
	}
	
	public Personagem(String nome, String desc, String img, String programa, String animador) {
		this.nome = nome;
		this.desc = desc;
		this.img = img;
		this.programa = programa;
		this.animador = animador;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public String getAnimador() {
		return animador;
	}

	public void setAnimador(String animador) {
		this.animador = animador;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\n" + "Descrição: " + this.desc + "\n" +
		"Imagem: " + this.img + "\n" + "Programa: " + this.programa + "\n" +
				"Animador: " + this.animador + "\n\n";
	}

}