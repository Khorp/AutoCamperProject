import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    Button createBooking;

    @FXML
    Label pickedAuto;

    @FXML
    TextField bookingWeek,bookingWeek2;

    @FXML
    ListView<VBox> ListView;
    ObservableList<VBox> camperList;
    List<Booking> bookingList = new ArrayList<>();


    public void initialize(){
        camperList = FXCollections.observableArrayList();
        camperList.add(new AutoCamperA(100,"Adria autocamper", AutoCamper.type.standard).getAutoCamperVbox());
        camperList.add(new AutoCamperA(200,"Arto Niesmann+Bischoff autocamper", AutoCamper.type.basic).getAutoCamperVbox());
        camperList.add(new AutoCamperA(213,"Autocamper", AutoCamper.type.luxury).getAutoCamperVbox());
        camperList.add(new AutoCamperA(423,"Britz autocamper", AutoCamper.type.standard).getAutoCamperVbox());
        camperList.add(new AutoCamperA(423,"Concorde autocamper", AutoCamper.type.standard).getAutoCamperVbox());
        camperList.add(new AutoCamperA(100,"GRAN CANARIA autocamper", AutoCamper.type.luxury).getAutoCamperVbox());
        camperList.add(new AutoCamperA(10,"volkswagen samba autocamper", AutoCamper.type.basic).getAutoCamperVbox());
        ListView.setItems(camperList);
    }

    public void autoClicked(){
        //need to get text from label from a vbox witch is inside a listview
        VBox temp = ListView.getSelectionModel().getSelectedItem();
        Label temp1 = (Label) temp.getChildren().get(0);
        temp1.getText();
        pickedAuto.setText(temp1.getText());
    }

    public void createBooking(ActionEvent event){

        if (Integer.parseInt(bookingWeek.getText())>=0&&Integer.parseInt(bookingWeek.getText())<=52&&
                Integer.parseInt(bookingWeek2.getText())>=0&&Integer.parseInt(bookingWeek2.getText())<=52) {
            bookingList.add(new Booking(bookingWeek.getText() + "-" + bookingWeek2.getText(), 1,
                    1,"1"));
            pickedAuto.setText("done");
            try {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("PaymentFXML.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();

            }catch (Exception e)
            {e.printStackTrace();}
        }
        else {
            pickedAuto.setText("Invalid week number");
        }
    }


    }

