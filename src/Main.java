import modules.Author.Author;
import modules.Books.Books;
import modules.Bookstore.Bookstore;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Books> books = new ArrayList<>(Arrays.asList(
				new Books("O senhor dos anéis", new Author("J.R.R", 1, LocalDate.of(2000, 12, 10)), true, LocalDate.now(), LocalDate.now()),
				new Books("Harry Potter", new Author("J.K Rowling", 2, LocalDate.of(2000, 12, 10)), true, LocalDate.now(), LocalDate.now()),
				new Books("Diário de um banana", new Author("Jeff Kenniey", 3, LocalDate.of(2000, 12, 10)), true, LocalDate.now(), LocalDate.now()),
				new Books("Metamorfose", new Author("Franz Kanika", 4, LocalDate.of(2000, 12, 10)), true, LocalDate.now(), LocalDate.now())
		));
		Bookstore bookstore = new Bookstore("Livraria do Pedro", books, "São Paulo", "Rocketseat, 00");

		int option = 1;

		do {
			System.out.println("Seja bem vindo a livraria " + bookstore.getName() + " \n");

			System.out.println("""
					Sistema da livraria
                    
					0 - Sair.					
					1 - Listar livros disponpiveis.
					2 - Listar livros indisponpiveis.
					2 - Localização da livraria.
					3 - Pegar emprestado um livro.
					4 - Devolver um livro.
					
					
					""");
		} while (option != 0);


	}
}