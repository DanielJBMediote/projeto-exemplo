package controller;

import java.util.Scanner;

import bo.BoletimBO;
import view.ScreenView;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Integer opcao = 0;
		try {

			while (opcao >= 0 && opcao <= 8) {
				ScreenView.menuPrincipal();
				ScreenView.mostrarTexto("Seleione uma Opção:");
				opcao = scanner.nextInt();

				switch (opcao) {
				case 1:
					menuOpcao01();
					break;
				case 2:
					menuOpcao02();
					break;
				case 3:
					menuOpcao03();
					break;
				case 4:
					menuOpcao04();
					break;
				case 5:
					menuOpcao05();
					break;
				case 6:
					menuOpcao06();
					break;
				case 7:
					menuOpcao07();
					break;
				case 8:
					menuOpcao08();
					break;

				default:
					break;
				}
			}
		} catch (Exception e) {
			ScreenView.mostrarErro(e.getMessage());
		}
	}

	private static void menuOpcao08() {

	}

	private static void menuOpcao07() {

	}

	private static void menuOpcao06() {

	}

	private static void menuOpcao05() {

	}

	private static void menuOpcao04() {

	}

	private static void menuOpcao03() {

	}

	private static void menuOpcao02() {

	}

	public static void menuOpcao01() throws Exception {
		BoletimBO boletimBO = new BoletimBO();
		boletimBO.iniciar();

		ScreenView.mostrarTexto("Nome do Aluno:");
		String nome = scanner.next();
		
		ScreenView.mostrarTexto("Turma do Aluno:");
		String turma = scanner.next();

		boletimBO.definirDados(nome, turma);

	}
}
