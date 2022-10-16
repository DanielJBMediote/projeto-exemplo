package view;

public class ScreenView {
	
	public static void mostrarTexto(String texto) {
		System.out.print(texto);
	}

	public static void mostrarTextoLn(String texto) {
		System.out.println(texto);
	}
	
	public static void menuPrincipal() {
		System.out.println("============= MENU PRINCIPAL =============");
		System.out.println("1. Criar um Boletim de Notas.");
		System.out.println("2. Alterar um Boletim de Notas.");
		System.out.println("3. Remover um Boletim de Notas.");

		System.out.println("4. Inserir nota em um Boletim existênte.");
		System.out.println("5. Alterar nota de um Boletim existênte.");
		System.out.println("6. Remover nota de um Boletim existênte.");

		System.out.println("7. Listar Boletims de uma Turma.");
		System.out.println("8. Listar todos os Boletims.");

		System.out.println("9. Sair.");
	}

	public static void mostrarErro(String message) {
		System.out.print("\nError");
		System.err.println(message);
	}
}
