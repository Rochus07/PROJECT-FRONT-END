
package innerease;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    // Method to switch to the FrontPage scene
// Method to switch to the FrontPage scene
public void switchToFXMLDocument(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("/innerease/FXMLDocument.fxml"));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
}

// Method to switch to the Account Log In scene
public void switchToAccount_Log_In(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("/innerease/Account_Log_In.fxml"));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    }
}
