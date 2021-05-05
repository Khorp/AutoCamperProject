import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class PaymentConfirm extends Payment {

    @FXML
    Label lName;

    public void initialize() {



        lName.setText(getName());
        System.out.println("test" + getName());



    }


    public void handleLoadFrontPage(ActionEvent event) {

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



