import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Payment {
    public String name, address, email, phoneno;

    @FXML
    Button bPayPal, bCreditCard;

    @FXML
    TextField tName, tAddress, tEmail, tPhoneNo;



    public void handlePayCredit(ActionEvent actionEvent) {
        name = tName.getText();
        address = tAddress.getText();
        email = tEmail.getText();
        phoneno = tPhoneNo.getText();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("PaymentConfirm.fxml"));
            /*
             * if "fx:controller" is not set in fxml
             * fxmlLoader.setController(NewWindowController);
             */
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setTitle("New Window");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            Logger logger = Logger.getLogger(getClass().getName());
            logger.log(Level.SEVERE, "Failed to create new Window.", e);
        }
    }


    public void handlePayPaypal(ActionEvent actionEvent) {
        name = tName.getText();
        address = tAddress.getText();
        email = tEmail.getText();
        phoneno = tPhoneNo.getText();
    }


}
