package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Personagem;

public class Menu {

	public void MostrarMenu() {
		String mensagemMenu = "\n1) Criar um personagem \n2) Listar personagens criados \n0) Sair";
		int opcao = 0;
		List<Personagem> listaPersonagens = new ArrayList<>();

		do {
			System.out.println(mensagemMenu);
			opcao = leInteiro("Opção: ");

			switch (opcao) {
			case 1:
				Personagem personagem = new Personagem();
				personagem.setNome(leString("Digite o nome do personagem: "));
				personagem.setDesc(leString("Digite a descrição do personagem: "));
				personagem.setImg(leString("Coloque o link de imagem do personagem: "));
				personagem.setPrograma(leString("Digite o programa do personagem: "));
				personagem.setAnimador(leString("Digite o animador do personagem: "));
				System.out.println("Personagem criado com sucesso!\n\n");
				listaPersonagens.add(personagem);
				break;
			case 2:
				if(listaPersonagens.isEmpty()) {
					System.out.println("Nenhum personagem cadastrado ainda!");
				}else {
					int i = 1;
					for (Personagem p : listaPersonagens) {
						System.out.println("----Personagem  " + i + "----");
						System.out.println(p);
						i++;
					}
				}
				break;
			case 0:
				System.out.println("\n\nPrograma encerrado!");
				break;
			default:
				System.out.println("\n\nOpção inválida");
			}
		} while (opcao != 0);
	}

	public int leInteiro(String pergunta) {

		Scanner sc = new Scanner(System.in);
		System.out.println(pergunta);
		return sc.nextInt();
	}
	public String leString(String pergunta) {
		Scanner sc = new Scanner(System.in);
		System.out.println(pergunta);
		return sc.nextLine();
	}

}
