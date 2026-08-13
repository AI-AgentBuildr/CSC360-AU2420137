import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DrawSquareFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a JavaFX Rectangle (Width: 200, Height: 200)
        Rectangle square = new Rectangle(200, 200);
        
        // Remove fill (transparent background)
        square.setFill(Color.TRANSPARENT);
        
        // Set outline color and width
        square.setStroke(Color.DODGERBLUE);
        square.setStrokeWidth(4);

        // Place the square in the center using StackPane
        StackPane root = new StackPane(square);
        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("JavaFX Unfilled Square");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
