import javafx.animation.Animation;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    private static final Image IMAGE = new Image("png/1/Attack1/1_terrorist_1_Attack1_000.png");
    
    
    private static final int COLUMNS  =   4;
    private static final int COUNT    =  19;
    private static final int OFFSET_X =  15;
    private static final int OFFSET_Y =  25;
    private static final int WIDTH    = 200;
    private static final int HEIGHT   = 400;
    

	static Group g = new Group();
	static Pane pane= new Pane();

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
    	
		Scene scene =new Scene(pane ,800 ,600);
		
        primaryStage.setTitle("Prueba Sprites");

        final ImageView imageView = new ImageView(IMAGE);
        imageView.setViewport(new Rectangle2D(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT));

        pane.getChildren().add(imageView);
        pane.setLayoutX(300);
        pane.setLayoutY(300);
        
        final Animation animation = new SpriteAnimation(
                imageView,
                Duration.millis(100),
                COUNT, COLUMNS,
                OFFSET_X, OFFSET_Y,
                WIDTH, HEIGHT
        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}