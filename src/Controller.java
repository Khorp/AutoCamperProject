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

/**
 * @Since 03/05/2021
 */
public class Controller {

    @FXML
    Button createBooking;

    @FXML
    Label pickedAuto,priceLabel,TypeLabel;

    @FXML
    TextField bookingWeek,bookingWeek2;

    @FXML
    VBox Vbox1;

    @FXML
    ListView<VBox> ListView;
    ObservableList<VBox> camperList;
    List<AutoCamperA> list;
    List<Booking> bookingList = new ArrayList<>();

    /***
     * Creates list and observable list and inputs start data into them
     */
    public void initialize(){
        camperList = FXCollections.observableArrayList();
        list = new ArrayList<>();

        list.add(new AutoCamperA(500,"Adria autocamper", AutoCamper.type.basic));
        list.add(new AutoCamperA(750,"Arto Niesmann+Bischoff autocamper", AutoCamper.type.standard));
        list.add(new AutoCamperA(1000,"Autocamper", AutoCamper.type.luxury));
        list.add(new AutoCamperA(800,"Britz autocamper", AutoCamper.type.standard));
        list.add(new AutoCamperA(1500,"Concorde autocamper", AutoCamper.type.luxury));
        list.add(new AutoCamperA(400,"GRAN CANARIA autocamper", AutoCamper.type.standard));
        list.add(new AutoCamperA(150,"volkswagen samba autocamper", AutoCamper.type.basic));
        for (AutoCamperA autoCamperA : list) {
            camperList.add(autoCamperA.getAutoCamperVbox());
        }
        ListView.setItems(camperList);

        Vbox1 = new VBox();
    }

    Label temp1;

    /***
     * Listview clicked gets name of autoCamper in picture and writes it into
     * label
     */
    public void autoClicked(){
        //need to get text from label from a vbox witch is inside a listview
        VBox temp = ListView.getSelectionModel().getSelectedItem();
        temp1 = (Label) temp.getChildren().get(0);
        temp1.getText();
        pickedAuto.setText(temp1.getText());

        //loop to find get number
        for (int i=0;i<camperList.size();i++){
            if (list.get(i).getAutoCamperName().equals(temp1.getText())){
                priceLabel.setText("Price per week: "+list.get(i).getPrice() + " euro");
                TypeLabel.setText("Type: "+list.get(i).getType());
            }
        }
    }

    /*
        need an autoCamper pressed
        no manuel info
        easier to get booking info
        fix if() so you cant say from 10 to 9
     */

    // sql bookingId thing
    int autoNumber = 1; //temp

    /**
     * button method for creating booking takes booking weeks and autoCamper and sends you
     * to another site for payment
     * @param event action
     */
    public void createBooking(ActionEvent event){

        if (Integer.parseInt(bookingWeek.getText())>=0&&Integer.parseInt(bookingWeek.getText())<=52&&
                Integer.parseInt(bookingWeek2.getText())>=0&&Integer.parseInt(bookingWeek2.getText())<=52) {
            if (temp1!=null) {
                //need an while loop that checks through database for other bookingId's
                bookingList.add(new Booking(bookingWeek.getText() + "-" + bookingWeek2.getText(), autoNumber,
                        100, temp1.getText()));
                autoNumber++;
                pickedAuto.setText("done");
                try {

                    FXMLLoader loader = new FXMLLoader(getClass().getResource("PaymentFXML.fxml"));
                    Parent root = loader.load();
                    Scene scene = new Scene(root);
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(scene);
                    stage.show();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else {
                pickedAuto.setText("Remember to chose a Autocamper");
            }
        }
        else {
            pickedAuto.setText("Invalid week number");
        }
    }
}
