import javafx.animation.Animation;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    private static final Image IMAGE = new Image("png/1/Attack1/1_terrorist_1_Attack1_000.png");
    private static final Image IMAGE2 = new Image("png/CommandoMap1-1BG.jpg");
    
    private static final Rectangle r= new Rectangle ();
    
    
    
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
		IMAGE2.getWidth();
		IMAGE2.getHeight();
		
		
		r.setHeight(IMAGE2.getWidth());
		r.setWidth(IMAGE2.getHeight());
		
		//r.setfi
		//scene.setFill(IMAGE2);
		scene.windowProperty();
        primaryStage.setTitle("Prueba Sprites");

        final ImageView imageView = new ImageView(IMAGE);
       ImageView imageView2 = new ImageView(IMAGE2);
        
        
        imageView.setViewport(new Rectangle2D(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT));
        g.getChildren().add(imageView2);
        
        
        imageView2.preserveRatioProperty();
        
        imageView2.setFitHeight(300);
        
        imageView2.setRotate(90);
        
       // pane.getChildren().add(imageView);
        pane.getChildren().add(imageView2);
        
        final Animation animation = new SpriteAnimation(
                imageView,
                Duration.millis(100),
                COUNT, COLUMNS,
                OFFSET_X, OFFSET_Y,
                WIDTH, HEIGHT
        );
        animation.setCycleCount(Animation.INDEFINITE);
        animation.play();
        //scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}