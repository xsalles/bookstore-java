package modules.Client;

import utils.PersonUtils.PersonUtils;

import java.time.LocalDate;

public class Client extends PersonUtils {
	public Client (String name, Integer id, LocalDate birthDate) {
		super(name, id, birthDate);
	}
}
