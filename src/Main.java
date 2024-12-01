import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        //caminho
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Jhonatan\\Desktop\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);
        //link
        driver.get("https://www.saucedemo.com/");

        Thread.sleep(2000);


        //LOGIN
        WebElement nome = driver.findElement(By.id("user-name"));
        nome.sendKeys("standard_user");
        Thread.sleep(2000);

        WebElement senha = driver.findElement(By.id("password"));
        senha.sendKeys("secret_sauce");

        Thread.sleep(2000);

        WebElement botao = driver.findElement(By.id("login-button"));
        botao.click();

        Thread.sleep(3000);


        //Rola a tela pra baixo
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromViewport(10, 10);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 200)
                .perform();
        Thread.sleep(2000);

        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 200, 800)
                .perform();
        Thread.sleep(2000);


        //Acessando uma aba do produto, add no carrinho e voltando pra home
        driver.findElement(By.linkText("Sauce Labs Onesie")).click();
        Thread.sleep(2000);

        WebElement compra1 = driver.findElement(By.id("add-to-cart"));
        compra1.click();
        Thread.sleep(2000);

        WebElement back1 = driver.findElement(By.id("back-to-products"));
        back1.click();

        Thread.sleep(2000);

        //Rola novamente
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 400)
                .perform();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();
        Thread.sleep(3000);

        WebElement compra2 = driver.findElement(By.id("add-to-cart"));
        compra2.click();
        Thread.sleep(3000);

        WebElement back2 = driver.findElement(By.id("back-to-products"));
        back2.click();

        Thread.sleep(3000);

        //add no carrinho na home
        WebElement compra3 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        compra3.click();

        Thread.sleep(3000);

        //Indo pro carrinho
        WebElement carrinho = driver.findElement(By.id("shopping_cart_container"));
        carrinho.click();

        Thread.sleep(3000);

        //Finalizando a compra
        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();
        Thread.sleep(3000);

        WebElement primeironome = driver.findElement(By.id("first-name"));
        primeironome.sendKeys("Eliesio");
        Thread.sleep(3000);

        WebElement sobrenome = driver.findElement(By.id("last-name"));
        sobrenome.sendKeys("Xavier");
        Thread.sleep(3000);

        WebElement cep = driver.findElement(By.id("postal-code"));
        cep.sendKeys("7000000");
        Thread.sleep(3000);


        WebElement continuar = driver.findElement(By.id("continue"));
        continuar.click();
        Thread.sleep(3000);

        //Rola novamente
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 300)
                .perform();
        Thread.sleep(2000);


        WebElement finalizar = driver.findElement(By.id("finish"));
        finalizar.click();
        Thread.sleep(3000);


        //Voltando pro menu e saindo
        WebElement voltar = driver.findElement(By.id("back-to-products"));
        voltar.click();
        Thread.sleep(3000);

        WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
        menu.click();
        Thread.sleep(3000);

        WebElement sair = driver.findElement(By.id("logout_sidebar_link"));
        sair.click();
        Thread.sleep(4000);

        //fecha tudo
        driver.quit();

    }



}
