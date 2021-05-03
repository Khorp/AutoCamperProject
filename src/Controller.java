import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    Button createBooking;

    @FXML
    TextField bookingWeek;

    @FXML
    ListView<ImageView> ListView;
    AutoCamperA camperA = new AutoCamperA();
    List<Booking> bookingList = new ArrayList<>();

    public void initialize(){
        ListView.setItems(camperA.getCampers());
        createBooking.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                bookingList.add(new Booking(bookingWeek.getText(),1));
                bookingWeek.setText("done");
            }
        });
    }


}
