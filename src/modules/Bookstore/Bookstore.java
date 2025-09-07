package modules.Bookstore;

import modules.Books.Books;
import modules.Loans.Loans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

	public List<Books> listAvailableBooks(Books[] books) {
		if (books == null) return List.of();

		return Arrays.stream(books).filter(book -> book.getAvailable().equals(Boolean.TRUE)).toList();
	}
}
