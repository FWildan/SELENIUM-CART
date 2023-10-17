import org.testng.annotations.Test;

public class cart extends BaseTest {
    @Test
    public void loginAndAddProductToCart() {
        driver.get("https://shop.demoqa.com");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("your_username", "your_password");

        ProductPage productPage = new ProductPage(driver);
        String productTitle = productPage.getProductTitle();
        productPage.addToCart();

        // Tambahkan asserstion sesuai kebutuhan Anda
    }
}