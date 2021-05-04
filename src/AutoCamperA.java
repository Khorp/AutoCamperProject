import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.FilenameFilter;

public class AutoCamperA implements AutoCamper{

    private ObservableList<VBox> campers = FXCollections.observableArrayList();
    //private File file = new File(getClass().getResourceAsStream("AutoCampers\\1.jpg"));
    private Image[] images = {new Image(getClass().getResourceAsStream("AutoCampers\\1.jpg")),
            new Image(getClass().getResourceAsStream("AutoCampers\\2.jpg")),
            new Image(getClass().getResourceAsStream("AutoCampers\\3.jpg")),
            new Image(getClass().getResourceAsStream("AutoCampers\\4.jpg"))};

    public ObservableList getCampers() {
        return campers;
    }

    public AutoCamperA(){
        campers.addAll(new VBox(new Label("AutoCamper 1"),new ImageView(images[0])),
                new VBox(new Label("AutoCamper 2"),new ImageView(images[1])),
                new VBox(new Label("AutoCamper 3"),new ImageView(images[2])),
                new VBox(new Label("AutoCamper 4"),new ImageView(images[3])));
    }

    @Override
    public void setCamperType() {

    }

    @Override
    public type getCamperType() {
        return null;
    }
}
