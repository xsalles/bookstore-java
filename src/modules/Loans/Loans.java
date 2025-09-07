package modules.Loans;

import modules.Books.Books;
import modules.Client.Client;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Loans {
    Scanner sc = new Scanner(System.in);

    private Integer id;
    private Integer clientId;
    private String clientName;
    private Integer bookId;
    private String bookTitle;

    public Loans(Client client, List<Books> book) {
        this.clientName = client.getName();
        this.clientId = client.getId();

        for (Books b : book) {
            this.bookId = b.getId();
            this.bookTitle = b.getTitle();
        }
    }

    public String makeLoan(List<Books> books, Integer bookId) {
        System.out.println("Digite o ID do livro que você está tentando pegar emprestado: \n");
        bookId = sc.nextInt();

        if (bookId <= 0) {
            return "ID inválido. Por favor, insira um ID válido.";
        }

        if (bookId > books.size()) {
            return "ID inválido. Por favor, insira um ID válido.";
        }

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

    public String makeReturn(List<Books> books, Integer bookId) {
        System.out.println("Digite o ID do livro que você está tentando devolver: \n");
        bookId = sc.nextInt();

        if (bookId <= 0) {
            return "ID inválido. Por favor, insira um ID válido.";
        }

        if (bookId > books.size()) {
            return "ID inválido. Por favor, insira um ID válido.";
        }

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
