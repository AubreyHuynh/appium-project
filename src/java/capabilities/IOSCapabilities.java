package capabilities;

import io.appium.java_client.ios.options.XCUITestOptions;

public class IOSCapabilities {
    public static XCUITestOptions setCapabilities() {

        XCUITestOptions capabilities = new XCUITestOptions();
        capabilities.setUdid("emulator-5554");
        capabilities.setDeviceName("Pixel_8_Pro");
        // not yet complete and tobe continue in next lesson

        return capabilities;
    }
}