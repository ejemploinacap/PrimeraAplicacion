package cl.inacap.unidad1.activity.test;

import cl.inacap.unidad1.activity.LoginActivity;
import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.widget.Button;

public class LoginActivityTest extends ActivityUnitTestCase<LoginActivity> {

	public LoginActivityTest() {
		super(LoginActivity.class);
	}

	private LoginActivity testActivity;
	
	protected void setUp() throws Exception {
		super.setUp();
		Intent intent = new Intent(getInstrumentation().getTargetContext(),
				LoginActivity.class);
		startActivity(intent, null, null);
		testActivity = getActivity();

	}
	
	
	public void testButtonText () {
		int testButtonId = cl.inacap.unidad1.activity.R.id.btn_ingresar;
		assertNotNull (testActivity.findViewById(testButtonId));
		assertEquals ("Login", ((Button)testActivity.findViewById(testButtonId)).getText().toString());
		
	}
}
