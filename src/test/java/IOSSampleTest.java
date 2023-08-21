import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSSampleTest {

    public static void main(String[] args) throws MalformedURLException {
        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 14 Pro Max")
                .setPlatformVersion("16.4")
                .setBundleId("com.saucelabs.mydemoapp.rn");

        AppiumDriver driver = new IOSDriver(new URL("http://0.0.0.0:4723/"), options);

        driver.findElement(AppiumBy.accessibilityId("tab bar option menu")).click();
        driver.findElement(AppiumBy.accessibilityId("menu item log in")).click();
        driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys("bob@example.com");
        driver.findElement(AppiumBy.accessibilityId("Password input field")).sendKeys("10203040");
        driver.findElement(AppiumBy.accessibilityId("Login button")).click();
        }
    }

