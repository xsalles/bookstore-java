package modules.Books;

import modules.Author.Author;

import java.time.LocalDate;
import java.util.List;

public class Books {
    private Integer id;
    private final String title;
    private final Author author;
    private Boolean isAvailable;
    private final LocalDate publicationDate;
    private LocalDate updateDate;

    public Books(String title, Author author, Boolean isAvailable, LocalDate publicationDate, LocalDate updateDate, Integer id) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
        this.publicationDate = publicationDate;
        this.updateDate = updateDate;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setAvailable(Boolean available, List<Books> books, Integer id) {
        for (Books book : books) {
            if (book.getId().equals(id)) {
                this.isAvailable = available;
                break;
            }
        }
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public String getAuthorName() {
        return author.getName();
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }


}
