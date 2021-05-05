import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("stuff.fxml"));

        primaryStage.setScene(new Scene(root, 800, 800));
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
