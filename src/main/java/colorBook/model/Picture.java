package colorBook.model;

import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;

import java.io.File;
import java.util.List;
import java.util.Objects;

public class Picture {
    private Color[][] pixels;
    private List<PictureSegment> segments;
    private WritableImage img;
    private Image imgreader;
    
    public Picture(){
        imgreader = new Image(this.getClass().getResource("/cat_1.png").toString());
        this.img = new WritableImage(imgreader.getPixelReader(),(int) img.getHeight(),(int) img.getWidth());
    }

    public void getSegment(){
        
    }
}
