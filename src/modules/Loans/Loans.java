package modules.Loans;

import modules.Books.Books;
import modules.Client.Client;

import java.time.LocalDate;
import java.util.Scanner;

public class Loans {
	Scanner sc = new Scanner(System.in);

	private Integer id;
	private Integer clientId;
	private String clientName;
	private Integer bookId;
	private String bookTitle;

	public Loans(Client client, Books book) {
		this.clientName = client.getName();
		this.clientId = client.getId();
		this.bookId = book.getId();
		this.bookTitle = book.getTitle();
	}

	public String makeLoan(Books[] books, Integer bookId) {
		System.out.println("Digite o ID do livro que você está tentando pegar emprestado: \n");
		bookId = sc.nextInt();

		for (Books book : books) {
			if (book.getId().equals(bookId)) {
				if (book.getAvailable() == false) {
					return "O livro que você está tentando pegar emprestado não está disponível.";
				}

				book.setAvailable(false, books, bookId);

				book.setUpdateDate(LocalDate.now());

				break;
			}
		}

		return "Empréstimo realizado com sucesso!";
	}

	public String makeReturn(Books[] books, Integer bookId) {
		System.out.println("Digite o ID do livro que você está tentando devolver: \n");
		bookId = sc.nextInt();

		for (Books book : books) {
			if (book.getId().equals(bookId)) {
				if (book.getAvailable() == true) {
					return "O livro que você está tentando devolver não está emprestado.";
				}

				book.setAvailable(true, books, bookId);

				book.setUpdateDate(LocalDate.now());

				break;
			}
		}

		return "Devolução realizada com sucesso!";
	}
}
