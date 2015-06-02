package cl.inacap.unidad1.activity.test;

import cl.inacap.unidad1.clases.Usuario;
import junit.framework.TestCase;

public class UsuarioTest extends TestCase {

	public void testValidarLogin() {
		Usuario testClass = new Usuario();
		
		assertEquals (false, testClass.validarLogin("test1", "test"));
	}

}
