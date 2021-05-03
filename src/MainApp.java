import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class MainApp extends Application {

    Button createBooking;
    Label autoCamperText;
    TextField bookingWeeks,lol;
    List<Booking> bookingList =new ArrayList<>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("stuff.fxml"));

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        /*
        VBox pane = new VBox();
        Scene scene = new Scene(pane,500,500);

        createBooking = new Button("Create Booking");
        autoCamperText = new Label("AutoCamper");
        bookingWeeks = new TextField();
        bookingWeeks.setPromptText("WeekStart-WeekEnd");
        lol = new TextField();

        createBooking.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                bookingList.add(new Booking(bookingWeeks.getText(),1));
            }
        });

        pane.getChildren().addAll(autoCamperText,bookingWeeks,createBooking,lol);
        primaryStage.setTitle("Program");
        primaryStage.setScene(scene);
        primaryStage.show();
         */
    }
}
