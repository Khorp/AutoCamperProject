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

    private double price;
    private String autoCamperName;
    private Image autoCamperPicture;
    private VBox autoCamperVbox;
    private ImageView autoCamperImageView;
    private Label autoCamperLabel;
    private type type;

    public AutoCamperA(int price,String autoCamperName,type type){
        this.price = price;
        this.autoCamperName = autoCamperName;
        this.type = type;
    }

    public double getPrice(){
        if (AutoCamperA.camperType.equals(type.basic)){
            return price/0.8;
        }else if (AutoCamperA.camperType.equals(type.standard)){
            return price;
        }else if (AutoCamperA.camperType.equals(type.luxury)){
            return price*1.5;
        }
        else {
            return 0;
        }
    }

    public VBox getAutoCamperVbox(){
        autoCamperPicture = new Image(getClass().getResourceAsStream("AutoCampers\\"+autoCamperName+".jpg"));

        autoCamperLabel = new Label(autoCamperName);
        autoCamperImageView = new ImageView(autoCamperPicture);
        autoCamperVbox = new VBox();
        autoCamperVbox.getChildren().addAll(autoCamperLabel,autoCamperImageView);

        return autoCamperVbox;
    }

    /*
    private type camperType;
    private int reading;
    private Image autoCamperImage;

    public ImageView getImageView() {
        return imageView;
    }

    public Label getAutoLabel() {
        return autoLabel;
    }

    private ImageView imageView;
    private Label autoLabel;

    public VBox getAutoVbox() {
        return autoVbox;
    }

    private VBox autoVbox;

    public String getAutoCamperName() {
        return autoCamperName;
    }

    public void setAutoCamperName(String autoCamperName) {
        this.autoCamperName = autoCamperName;
    }

    private String autoCamperName;

    //private ObservableList<VBox> campers = FXCollections.observableArrayList();
    //private File file = new File(getClass().getResourceAsStream("AutoCampers\\1.jpg"));
    //private Image[] images = {new Image(getClass().getResourceAsStream("AutoCampers\\1.jpg")),
      //      new Image(getClass().getResourceAsStream("AutoCampers\\2.jpg")),
        //    new Image(getClass().getResourceAsStream("AutoCampers\\3.jpg")),
          //  new Image(getClass().getResourceAsStream("AutoCampers\\4.jpg"))};
/*
    public ObservableList getCampers() {
        return campers;
    }

 */

    /*
    public AutoCamperA(int reading,String autoCamperName){
        this.reading = reading;
        this.autoCamperName = autoCamperName;
        this.autoCamperImage = new Image(getClass().getResourceAsStream("AutoCamper\\"+autoCamperName+".jpg"));
        this.imageView = new ImageView(autoCamperImage);
        this.autoLabel = new Label(autoCamperName);
        this.autoVbox = new VBox();
        this.autoVbox.getChildren().addAll(autoLabel,imageView);
        /*
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

    @Override
    public int getReading() {
        return 0;
    }

    @Override
    public void setReading(int reading) {

    }
     */

}
