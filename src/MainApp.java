import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainApp extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane,500,500);



        pane.getChildren().addAll();
        primaryStage.setTitle("Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
