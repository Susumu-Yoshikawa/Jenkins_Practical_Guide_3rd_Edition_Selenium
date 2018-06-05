package jp.gihyo.jenkinsbook.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class ResultPage {
	private WebDriver driver;

	public ResultPage(WebDriver dri) {
		this.driver = dri;
	}

    public String getText() {
        return driver.findElement(By.xpath("//p[@name='main']")).getText();
    }
}
