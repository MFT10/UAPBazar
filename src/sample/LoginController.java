package sample;

import javafx.scene.control.Button;

public class LoginController {
    public Button loginButton;
    public void switchToHome()
    {
        System.out.println("Clicked.\n");
        System.out.println(View.Login.getFileName());
        SceneSwitcher.switchTo(View.Home);
    }
}
