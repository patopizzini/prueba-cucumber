package stock_operations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class StockTests {

    private Stock appleStock;
    private String message = null;

    @Given("^Stock of apples is (\\d+)$")
    public void stock_of_apples_is(int new_stock) {
        this.appleStock = new Stock(new_stock);
    }

    @When("^Trying to buy (\\d+)$")
    public void trying_to_buy(int quantity) {
        if (quantity <= appleStock.getStock_remaining()) {
            appleStock = Operations.buy(appleStock, quantity);
        } else {
            message = "No hay stock";
        }
    }

    @When("^Trying to add (\\d+)$")
    public void trying_to_add(int quantity) {
        appleStock = Operations.add(appleStock, quantity);
    }

    @Then("^Stock should be (\\d+)$")
    public void stock_should_be(int quantity) {
        assertEquals(quantity,appleStock.getStock_remaining());
    }

    @Then("^Get no stock message$")
    public void get_no_stock_message(){
        assertNotNull(message);
    }

    @Then("^Stock of apples remains in (\\d+)$")
    public void stock_of_apples_remains_in(int quantity) {
        assertEquals(quantity,appleStock.getStock_remaining());
    }

}
