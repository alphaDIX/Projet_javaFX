import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {
    protected double sizeX;
    protected double sizeY;
    protected ImageView imageView;

    public StaticThing(String fileName, double sizeX, double sizeY, double position_x, double position_y) {
        Image image = new Image("file:"+fileName);
        imageView = new ImageView(image);
        imageView.setX(position_x);
        imageView.setY(position_y);
        imageView.setFitHeight(sizeY);
        imageView.setFitWidth(sizeX);
    }

    public ImageView getImage() {
        return imageView;
    }
}
