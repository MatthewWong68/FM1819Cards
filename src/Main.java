import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;

/**
 * The main class for this program.
 * 
 * @author MSN
 *
 */
public class Main extends Application {
	// Constants for the all windows
	public static final int LARGE_WINDOW_HEIGHT = 650;
	public static final int LARGE_WINDOW_WIDTH = 1000;
	public static final int SMALL_WINDOW_HEIGHT = 400;
	public static final int SMALL_WINDOW_WIDTH = 600;

	public static final String HOMEPAGE_WINDOW_TITLE = "Home Page";
	public static final String CARD_WINDOW_TITLE = "Card Info";

	@Override
	public void start(Stage primaryStage) {
		try {
			// Load the main scene.
			Pane root = (Pane) FXMLLoader.load(getClass().getResource("BarcelonaPlayers.fxml"));
			Scene scene = new Scene(root, SMALL_WINDOW_WIDTH, SMALL_WINDOW_HEIGHT);

			// Place the main scene on stage and show it.
			primaryStage.setScene(scene);
			primaryStage.setTitle(HOMEPAGE_WINDOW_TITLE);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}