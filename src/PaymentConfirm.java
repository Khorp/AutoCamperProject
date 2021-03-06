import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * ConfirmedPayment class
 * @since 04/05/2021
 */
public class PaymentConfirm {

    @FXML
    Label lName, lAdress,lEmail, lPhoneNo;

    /***
     * Constructor
     * @param name customerName
     * @param address customerAddress
     * @param email customerAddress
     * @param PhonoNo customerPhoneNo
     */
    public void setName(String name, String address, String email, String PhonoNo) {
        this.name = name;
        lName.setText(name);
        lAdress.setText(address);
        lEmail.setText(email);
        lPhoneNo.setText(PhonoNo);

    }

    String name;

    /**
     * starts when its fxml is started
     */
    public void initialize() {
        System.out.println("test" + name);
    }

    /**
     * button that sends you back to front page
     * @param event
     */
    public void handleLoadFrontPage(ActionEvent event) {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("stuff.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 800,800);
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }catch (Exception e)
        {e.printStackTrace();}
    }
}


