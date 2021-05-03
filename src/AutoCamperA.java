import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class AutoCamperA implements AutoCamper{

    private ObservableList<ImageView> campers = FXCollections.observableArrayList();
    //private File file = new File(getClass().getResourceAsStream("AutoCampers\\1.jpg"));
    private Image[] images = {new Image(getClass().getResourceAsStream("AutoCampers\\1.jpg")),
            new Image(getClass().getResourceAsStream("AutoCampers\\2.jpg"))};

    public ObservableList getCampers() {
        return campers;
    }

    public AutoCamperA(){
        campers.addAll(new ImageView(images[0]),new ImageView(images[1]));
    }

    @Override
    public void setCamperType() {

    }

    @Override
    public type getCamperType() {
        return null;
    }
}
