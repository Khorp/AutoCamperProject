import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/***
 * @author Nicolaj,Niels,Monir,Rasmus
 * @since 03/05/2021
 */
public class MainApp extends Application {

    /**
     * Start application
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("stuff.fxml"));

        primaryStage.setScene(new Scene(root,800,800));
        primaryStage.show();

    }
}
