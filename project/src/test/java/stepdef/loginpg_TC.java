package stepdef;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import com_pages.Base_pg;
import com_pages.constant;
import com_pages.login_pae;
import io.cucumber.java.en.Given;
import utilitys.common_Methods;
import utilitys.validations;


public class loginpg_TC  {

	@Given("I am at the tsrtc homepage")
	public void i_am_at_the_tsrtc_homepage() throws Exception {
		common_Methods.currenturl();
		validations.IsTrue(common_Methods.currenturl(),constant.homepageurl , "page is open");

	}

	@Given("I enter city name in from text box")
	public void i_enter_city_name_in_from_text_box() {
		login_pae.From_T();


	}

	@Given("select the from text")
	public void select_the_from_text() {
		login_pae.from_Td();

	}

	@Given("I enter city name in to text box")
	public void i_enter_city_name_in_to_text_box() {
		login_pae.to_T();

	}

	@Given("Select the to text")
	public void select_the_to_text() throws InterruptedException {
		login_pae.to_Td();

	}

	@Given("I select the date")
	public void i_select_the_date() {
		login_pae.depart_T();


	}

	@Given("Select the Journey date")
	public void select_the_journey_date() {
		login_pae.depart_Td();

		
	}

	@Given("I click on check availability button")
	public void i_click_on_check_availability_button() {
		login_pae.checkBut_T();

		
	}



}
