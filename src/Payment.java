import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * PaymentController Class
 * @since 03/05/2021
 */
public class Payment {

    public String name, address, email, phoneno;

    @FXML
    Button bPayPal, bCreditCard;

    @FXML
    TextField tName, tAddress, tEmail, tPhoneNo;

    @FXML
    ChoiceBox cInsurance;


    /**
     * CreditCardButton gets info from TextField and
     * opens paymentConfirm.fxml
     * @param event
     */
    public void handlePayCredit(ActionEvent event) {
        name = tName.getText();
        System.out.println(name);
        address = tAddress.getText();
        email = tEmail.getText();
        phoneno = tPhoneNo.getText();

        DatabaseThing db = DatabaseAdapterSingelton.getInstance();
        try {
            db.makeCustomer(address,"test",name,phoneno,1,email);
        }catch (Exception e){
            System.out.println("Error");
        }

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("PaymentConfirm.fxml"));
            Parent root = loader.load();
            PaymentConfirm test = loader.getController();
            test.setName(name, address, email, phoneno);
            Scene scene = new Scene(root, 800,800);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }catch (Exception e)
        {e.printStackTrace();}
    }

    /**
     * Same as creditCardButton but instead paypal
     * @param event
     */
    public void handlePayPaypal(ActionEvent event) {
        name = tName.getText();
        address = tAddress.getText();
        email = tEmail.getText();
        phoneno = tPhoneNo.getText();



        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("PaymentPayPalConfirm.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root,800,800);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }catch (Exception e)
        {e.printStackTrace();}
    }


    /**
     * return button so you can get back to book another autocamper
     * @param event
     */
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

