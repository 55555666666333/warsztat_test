package zad2;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class Screenshot {
    private WebDriver driver;

    public Screenshot(WebDriver driver) {
        this.driver = driver;
    }

    public void takeScreenshot() {
        File screenshot = ((TakesScreenshot)this.driver).getScreenshotAs(OutputType.FILE);

        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        try {
            Files.copy(screenshot.toPath(), Paths.get("C:", "test-evidence", "my-store"+currentDateTime+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
