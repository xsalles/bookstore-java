package modules.Bookstore;

import modules.Books.Books;
import modules.Loans.Loans;

import java.util.Arrays;
import java.util.List;

public class Bookstore {
	private String name;
	private List<Books> books;
	private List<Loans> loans;
	private String city;
	private String address;


	public Bookstore (String name, List<Books> books, String city, String address) {
		this.name = name;
		this.books = books;
		this.city = city;
		this.address = address;
	}

	public List<Books> getBooks() {
		return books;
	}

	public String getName() {
		return name;
	}

	public List<Loans> getLoans() {
		return loans;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}


	public String listAvailableBooks(List<Books> books) {
		if (books == null) return "Não há livros disponíveis no momento.";

        StringBuilder availableBooks = new StringBuilder("Livros disponíveis:\n");

		for (Books book : books) {
            if (book.getAvailable()) {
                availableBooks.append("ID: ").append(book.getId() + " | ")
                        .append("Título: ").append(book.getTitle() + " | ")
                        .append("Autor: ").append(book.getAuthorName() + "\n").toString();
            }
        }

        return availableBooks.toString();
    }
}
