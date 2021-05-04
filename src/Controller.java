import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

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
    AutoCamperA camperA = new AutoCamperA();
    List<Booking> bookingList = new ArrayList<>();


    public void initialize(){
        ListView.setItems(camperA.getCampers());
        createBooking.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (Integer.parseInt(bookingWeek.getText())>=0&&Integer.parseInt(bookingWeek.getText())<=52&&
                        Integer.parseInt(bookingWeek2.getText())>=0&&Integer.parseInt(bookingWeek2.getText())<=52) {
                    bookingList.add(new Booking(bookingWeek.getText() + "-" + bookingWeek2.getText(), 1));
                    pickedAuto.setText("done");
                }
                else {
                    pickedAuto.setText("Invalid week number");
                }
            }
        });
    }

    public void autoClicked(){
        //need to get text from label from a vbox witch is inside a listview
        String labelText = ListView.getSelectionModel().getSelectedItem().getChildren().get(0).toString();
        pickedAuto.setText(labelText);
    }

}
