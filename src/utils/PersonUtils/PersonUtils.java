package utils.PersonUtils;

import java.time.LocalDate;

public class PersonUtils {
	private String name;
	private Integer id;
	private LocalDate birthDate;

	public PersonUtils(String name, Integer id, LocalDate birthDate) {
		this.name = name;
		this.id = id;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
