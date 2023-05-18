package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Email;

class EmailTest {

	@Test
	void validarEmail() {
		assertThrows(IllegalArgumentException.class,  () -> new Email(null)); 
		assertThrows(IllegalArgumentException.class,  () -> new Email(""));
		assertThrows(IllegalArgumentException.class,  () -> new Email("Email invalido"));
	}

}
