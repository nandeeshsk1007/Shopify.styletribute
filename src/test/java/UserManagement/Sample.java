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

public class Sample {
    public static void main(String[] args) {
        try {
            // Set the path to your ChromeDriver executable
            //System.setProperty("webdriver.chrome.driver", "D:\\javanew\\Cucumber1\\Sof1\\chromedriver.exe");
        	WebDriverManager.chromedriver().setup();
        	
            // Load and parse the XML file
            File inputFile = new File("D:\\javanew\\Shopfy.Styletribute\\Files\\login.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            // Initialize WebDriver
            WebDriver driver = new ChromeDriver();
            // Get the list of action elements
            NodeList actionList = doc.getElementsByTagName("action");

            // Iterate through actions and execute them
            for (int i = 0; i < actionList.getLength(); i++) {
                Element actionElement = (Element) actionList.item(i);
                String actionType = actionElement.getAttribute("type");

                switch (actionType) {
                    // (Same switch cases as provided in the previous example)

                    // Add more cases for other action types if needed
                }
            }

            // Close the browser
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
