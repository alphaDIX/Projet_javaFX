import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Runner Project");
        Group root = new Group();
        GameScene theScene = new GameScene(root,1000,400);
        primaryStage.setScene(theScene);
        theScene.render();


        primaryStage.show();
    }

    public static void main (String[] args){
        launch(args);
    }


}
