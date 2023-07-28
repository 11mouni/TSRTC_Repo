package stepdef;

import com_pages.Base_pg;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class cucm_base_class {
     
	@Before
	public static void driver_call()
	{
		Base_pg.openurl();
	}
	
	@After
	public static void driverClose()
	{
		Base_pg.driver_close();
	}
	
	
}
