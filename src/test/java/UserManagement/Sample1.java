package UserManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import io.github.bonigarcia.wdm.WebDriverManager;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class Sample1 {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        try {
            // Set up WebDriver
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            // Load and parse the XML file
            File inputFile = new File("D:\\javanew\\Shopfy.Styletribute\\Files\\login.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            // Get the list of action elements
            NodeList actionList = doc.getElementsByTagName("action");

            // Iterate through actions and execute them
            for (int i = 0; i < actionList.getLength(); i++) {
                Element actionElement = (Element) actionList.item(i);
                String actionType = actionElement.getAttribute("type");

                switch (actionType) {
                    case "open":
                        driver.get(actionElement.getAttribute("url"));
                        break;

                    case "type":
                        String locatorType = actionElement.getAttribute("locator").split("=")[0];
                        String locatorValue = actionElement.getAttribute("locator").split("=")[1];
                        String text = actionElement.getAttribute("text");

                        WebElement element = null;

                        switch (locatorType) {
                            case "id":
                                element = driver.findElement(By.id(locatorValue));
                                break;

                            case "xpath":
                                element = driver.findElement(By.xpath(locatorValue));
                                break;

                            // Add more locator types as needed

                            default:
                                // Handle unsupported locator type
                                break;
                        }

                        if (element != null) {
                            element.sendKeys(text);
                        }

                        break;

                    case "click":
                        locatorType = actionElement.getAttribute("locator").split("=")[0];
                        locatorValue = actionElement.getAttribute("locator").split("=")[1];

                        WebElement clickElement = null;

                        switch (locatorType) {
                            case "id":
                                clickElement = driver.findElement(By.id(locatorValue));
                                break;

                            case "xpath":
                                clickElement = driver.findElement(By.xpath(locatorValue));
                                break;

                            // Add more locator types as needed

                            default:
                                // Handle unsupported locator type
                                break;
                        }

                        if (clickElement != null) {
                            clickElement.click();
                        }

                        break;

                    case "wait":
                        int waitTime = Integer.parseInt(actionElement.getAttribute("time"));
                        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.MILLISECONDS);
                        break;

                    case "executeScript":
                        String script = actionElement.getAttribute("script");
                        ((JavascriptExecutor) driver).executeScript(script);
                        break;

                    // Add more cases for other action types if needed

                    default:
                        // Handle unsupported action type
                        break;
                }
            }
           System.out.println(driver.getCurrentUrl()); 
            // Close the browser
            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
