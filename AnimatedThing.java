import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AnimatedThing {
    private double position_x;
    private double position_y;
    protected ImageView spriteSheet;
    private String attitude; //si il saute, attaque, avance ...

    private int index;
    private double duration_frames;
    private int max_index;
    private double sizeX_window;
    private double sizeY_window;
    private int offset_frames;

    public AnimatedThing(double position_x, double position_y, String fileName, String attitude, int index, double duration_frames, int max_index, double sizeX_window, double sizeY_window) {
        this.position_x = position_x;
        this.position_y = position_y;
        this.attitude = attitude;
        this.index = index;
        this.duration_frames = duration_frames;
        this.max_index = max_index;
        this.sizeX_window = sizeX_window;
        this.sizeY_window = sizeY_window;

        Image image = new Image("file:"+fileName);
        this.spriteSheet = new ImageView(image);
        spriteSheet.setX(this.position_x);
        spriteSheet.setY(this.position_y);
        spriteSheet.setViewport(new Rectangle2D(0,0,this.sizeX_window,this.sizeY_window));
    }

    public ImageView getSpriteSheet() {
        return spriteSheet;
    }

    public void update(long time) {
        if((time/1000000) % 5 == 0) {
            if (index < max_index) {
                spriteSheet.setViewport(new Rectangle2D(index * 85, 0, 80, 100));
                spriteSheet.setX(this.position_x);
                spriteSheet.setY(this.position_y);
                index++;
            } else {
                spriteSheet.setViewport(new Rectangle2D(0, 0, 75, 100));
                spriteSheet.setX(this.position_x);
                spriteSheet.setY(this.position_y);
                index = 0;
            }
        }
    }
}
