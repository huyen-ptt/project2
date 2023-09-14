package aptech.group3.khutro;

import aptech.group3.khutro.database.ConnectionProvider;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
	
	ConnectionProvider connection = new ConnectionProvider();

	
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Đây là chương trình javafx nhóm 3");
    }
}