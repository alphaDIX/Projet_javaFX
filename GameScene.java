import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Scene;

public class GameScene extends Scene{
    private Camera camera;
    private StaticThing Background_right;
    private StaticThing Background_left;
    private AnimatedThing hero;

    public GameScene(Group root, int x, int y) {
        super(root,x,y);
        this.camera = new Camera(200,300);

        this.Background_right = new StaticThing("img/desert.png",800,400,800,0);
        root.getChildren().add(this.Background_right.getImage());
        this.Background_left = new StaticThing("img/desert.png",800,400,0,0);
        root.getChildren().add(this.Background_left.getImage());

        this.hero = new AnimatedThing(100.0,250,"img/heros.png","run",0,0.5,6,75,100);
        root.getChildren().add(this.hero.getSpriteSheet());

        AnimationTimer timer = new AnimationTimer()
        {public void handle(long time){
            hero.update(time);
            camera.update(time);
            GameScene.update(time);
            }
        };
        timer.start();



    }

    private static void update(long time) {
        System.out.println(time/1000000000);
    }

    public void render(){
    Background_left.getImage().setX(Background_left.getImage().getX()-camera.getX());
    Background_right.getImage().setX(Background_right.getImage().getX()-camera.getX());
    }

}
