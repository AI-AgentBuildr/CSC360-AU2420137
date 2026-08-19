import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Rectangle square = new Rectangle(200, 200);
        square.setFill(Color.TRANSPARENT);
        square.setStroke(Color.DODGERBLUE);
        square.setStrokeWidth(4);

        StackPane root = new StackPane(square);
        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("JavaFX Main Square");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
