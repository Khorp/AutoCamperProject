import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
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



    public void handlePayCredit(ActionEvent event) {
        name = tName.getText();
        address = tAddress.getText();
        email = tEmail.getText();
        phoneno = tPhoneNo.getText();

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("PaymentConfirm.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }catch (Exception e)
        {e.printStackTrace();}
    }

    public void handlePayPaypal(ActionEvent event) {
        name = tName.getText();
        address = tAddress.getText();
        email = tEmail.getText();
        phoneno = tPhoneNo.getText();

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("PaymentPayPalConfirm.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }catch (Exception e)
        {e.printStackTrace();}
    }



    public void returnToMainView(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("stuff.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }catch (Exception e)
        {e.printStackTrace();}
    }
    }

