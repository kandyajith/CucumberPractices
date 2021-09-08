package stepDefinitions;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.*;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AmazonSteps {
	
	Product product;
	Search search;

@Given("I have a search field on Amazon page")
public void i_have_a_search_field_on_amazon_page() 
	{
		System.out.println("Step 1: I am on the search page");
	}

@When("I search for a product with name {string} and price {int}")
public void i_search_for_a_product_with_name_and_price(String productName, Integer price) 
	{
		System.out.println("Step 2: Search product with the name "+ productName + "price " + price);
		product = new Product(productName, price);
	}

@Then("Product with {string} should be displayed")
public void product_with_should_be_displayed(String productName)
	{
	System.out.println("Step 3: product "+productName + " is displayed.");
	
	search = new Search();
	String name = search.displayProduct(product);
	System.out.println("Searched product is " +name);

	//Assert.assertEquals(product.getProductName(), name);
	
	
	}	



}
