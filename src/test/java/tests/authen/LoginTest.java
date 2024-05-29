package tests.authen;

import driver.DriverFactory;
import driver.Platform;
import io.appium.java_client.AppiumDriver;
import java.util.ArrayList;
import java.util.List;
import test_flows.authentication.LoginFlow;

public class LoginTest {

    public static void main(String[] args) {
        AppiumDriver appiumDriver = DriverFactory.getDriver(Platform.ANDROID);

        List<LoginCredData> loginCredData = new ArrayList<>();
        loginCredData.add(new LoginCredData("teo@", "87654321"));
        loginCredData.add(new LoginCredData("teo@sth.com", "123456"));
        loginCredData.add(new LoginCredData("teo@sth.com", "12345678"));

        for (LoginCredData loginCred : loginCredData) {
            try {
                LoginFlow loginFlow = new LoginFlow(
                        appiumDriver, loginCred.getUsername(), loginCred.getPassword()
                );
                loginFlow.gotoLoginScreen();
                loginFlow.login();
                loginFlow.verifyLogin();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        appiumDriver.quit();
    }

    // Data Model Class
    public static class LoginCredData {

        private String username;
        private String password;

        public LoginCredData(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }
}