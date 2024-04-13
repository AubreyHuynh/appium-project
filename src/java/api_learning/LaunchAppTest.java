package api_learning;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class LaunchAppTest {
    public static void main(String[] args) {
        AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }
}
