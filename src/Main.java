import modules.Author.Author;
import modules.Books.Books;
import modules.Bookstore.Bookstore;
import modules.Client.Client;
import modules.Loans.Loans;

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
        Client client = new Client("Pedro", 1, LocalDate.of(2000, 12, 10));
		List<Books> books = new ArrayList<>(Arrays.asList(
				new Books("O senhor dos anéis" ,new Author("J.R.R", 1, LocalDate.of(2000, 12, 10)), true, LocalDate.now(), LocalDate.now(), 1),
				new Books( "Harry Potter", new Author("J.K Rowling", 2, LocalDate.of(2000, 12, 10)), true, LocalDate.now(), LocalDate.now(), 2),
				new Books( "Diário de um banana", new Author("Jeff Kenniey", 3, LocalDate.of(2000, 12, 10)), true, LocalDate.now(), LocalDate.now(), 3),
				new Books( "Metamorfose", new Author("Franz Kanika", 4, LocalDate.of(2000, 12, 10)), true, LocalDate.now(), LocalDate.now(), 4)
		));
		Bookstore bookstore = new Bookstore("Livraria do Pedro", books, "São Paulo", "Rocketseat, 00");
        Loans loans = new Loans(client, books);


		int option = 1;
        Integer bookId = 0;

		do {
			System.out.println("Seja bem vindo a  " + bookstore.getName() + " \n");

			System.out.println("""
					Sistema da livraria
                    
					0 - Sair.					
					1 - Listar livros disponpiveis.
					2 - Localização da livraria.
					3 - Pegar emprestado um livro.
					4 - Devolver um livro.
					""");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println(bookstore.listAvailableBooks(books));
                    break;
                case 2:
                    System.out.println("A livraria " + bookstore.getName() + " está localizada na cidade de " + bookstore.getCity() + ", no endereço: " + bookstore.getAddress());
                    break;
                case 3:
                    System.out.println(loans.makeLoan(books, bookId));

                    break;
                case 4:
                    System.out.println(loans.makeReturn(books, bookId));
                    break;
                default:
                    if (option != 0) {
                        System.out.println("Opção inválida, tente novamente.");
                    }
                    break;

            }

		} while (option != 0);


	}
}