import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.FilenameFilter;

/***
 * @author Nicolaj,Monir,Niels,Rasmus
 * @since 03/05/2021
 */
public class AutoCamperA implements AutoCamper{

    private double price;
    private String autoCamperName;
    private Image autoCamperPicture;
    private VBox autoCamperVbox;
    private ImageView autoCamperImageView;
    private Label autoCamperLabel;
    private type type;

    /***
     * @param price Price for autoCamper
     * @param autoCamperName Name of the AutoCamper
     * @param type Enum Type
     */
    public AutoCamperA(int price,String autoCamperName,type type){
        this.price = price;
        this.autoCamperName = autoCamperName;
        this.type = type;
    }

    /***
     * Calculating price
     * @return price
     */
    public double getPrice(){
        if (AutoCamperA.camperType.equals(AutoCamper.type.basic)){
            return price;
        }else if (AutoCamperA.camperType.equals(AutoCamper.type.standard)){
            return price;
        }else if (AutoCamperA.camperType.equals(AutoCamper.type.luxury)){
            return price*1.5;
        }
        else {
            return 0;
        }
    }

    /***
     * getter for type
     * @return type
     */
    public type getType(){
        return type;
    }

    /***
     * Getter for name
     * @return name
     */
    public String getAutoCamperName(){
        return autoCamperName;
    }

    /***
     * Gets and creates the things necessary for the vbox
     * @return Vbox
     */
    public VBox getAutoCamperVbox(){
        autoCamperPicture = new Image(getClass().getResourceAsStream("AutoCampers\\"+autoCamperName+".jpg"));

        autoCamperLabel = new Label(autoCamperName);
        autoCamperImageView = new ImageView(autoCamperPicture);
        autoCamperVbox = new VBox();
        autoCamperVbox.getChildren().addAll(autoCamperLabel,autoCamperImageView);

        return autoCamperVbox;
    }
}
