package modules.Author;

import utils.PersonUtils.PersonUtils;

import java.time.LocalDate;

public class Author extends PersonUtils {
	public Author (String name, Integer id, LocalDate birthDate) {
		super(name, id, birthDate);
	}
}
