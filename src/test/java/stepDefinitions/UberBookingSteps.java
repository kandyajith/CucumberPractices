package stepDefinitions;

import io.cucumber.java.en.*;

public class UberBookingSteps {

@Given("User wants to select a car type {string} from uber app")
public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
	System.out.println("step 1: "+carType);
	}

@When("user select car {string} and pick up point {string} and drop location {string}")
public void user_select_car_and_pick_up_point_and_drop_location(String carType, String pickUpLocation, String dropLocation) {
	System.out.println("step 2: "+carType+" "+pickUpLocation+" "+dropLocation);
	}

@Then("Driver starts the journey")
public void driver_starts_the_journey() {
	System.out.println("step 3: Driver starts the journey");
	}

@Then("Driver finshes the journey")
public void driver_finshes_the_journey() {
	System.out.println("step 4: Driver finshes the journey");
	}

@Then("User pays {int} pounds")
public void user_pays_pounds(Integer price) {
	System.out.println("step 5: User pays pounds  "+price);
	}

}
