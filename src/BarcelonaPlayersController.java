import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class BarcelonaPlayersController {

	@FXML
	private BorderPane barcelonaPlayersPane;

	@FXML
	private Button terStegen;

	@FXML
	private Button nelsonSemedo;

	@FXML
	private Button gerardPique;

	@FXML
	private Button ivanRakitic;

	@FXML
	private Button sergioBusquests;

	@FXML
	private Button denisSuarez;

	@FXML
	private Button philippeCoutinho;

	@FXML
	private Button arthurMelo;

	@FXML
	private Button luisSuarez;

	@FXML
	private Button lionelMessi;

	@FXML
	private Button ousmaneDembele;

	@FXML
	private Button jasperCillessen;

	@FXML
	private Button malcom;

	@FXML
	private Button lenglet;

	@FXML
	private Button jordiAlba;

	@FXML
	private Button munir;

	@FXML
	private Button sergiRoberto;

	@FXML
	private Button arturoVidal;

	@FXML
	private Button samuelUmtiti;

	@FXML
	private Button thomasVermaelen;

	@FXML
	private Button back;

	/**
	 * Initialize the controller.
	 */
	public void initialize() {
		terStegen.setOnAction(e -> {
			terStegenButtonAction();
		});
		nelsonSemedo.setOnAction(e -> {
			nelsonSemedoButtonAction();
		});
		gerardPique.setOnAction(e -> {
			gerardPiqueButtonAction();
		});
		ivanRakitic.setOnAction(e -> {
			ivanRakiticButtonAction();
		});
		sergioBusquests.setOnAction(e -> {
			sergioBusquestsButtonAction();
		});
		denisSuarez.setOnAction(e -> {
			denisSuarezButtonAction();
		});
		philippeCoutinho.setOnAction(e -> {
			philippeCoutinhoButtonAction();
		});
		arthurMelo.setOnAction(e -> {
			arthurMeloButtonAction();
		});
		luisSuarez.setOnAction(e -> {
			luisSuarezButtonAction();
		});
		lionelMessi.setOnAction(e -> {
			lionelMessiButtonAction();
		});
		ousmaneDembele.setOnAction(e -> {
			ousmaneDembeleButtonAction();
		});
		jasperCillessen.setOnAction(e -> {
			jasperCillessenButtonAction();
		});
		malcom.setOnAction(e -> {
			malcomButtonAction();
		});
		lenglet.setOnAction(e -> {
			lengletButtonAction();
		});
		jordiAlba.setOnAction(e -> {
			jordiAlbaButtonAction();
		});
		munir.setOnAction(e -> {
			munirButtonAction();
		});
		sergiRoberto.setOnAction(e -> {
			sergiRobertoButtonAction();
		});
		arturoVidal.setOnAction(e -> {
			arturoVidalButtonAction();
		});
		samuelUmtiti.setOnAction(e -> {
			samuelUmtitiButtonAction();
		});
		thomasVermaelen.setOnAction(e -> {
			thomasVermaelenButtonAction();
		});
		back.setOnAction(e -> {
			handleBackButtonAction();
		});
	}

	public void terStegenButtonAction() {
		KeeperCard terStegen = new KeeperCard(1, "terStegen.jpg", "DIVING", 92, 90, 94, 89, 93, 23, 41, 91, 48, 82, 45,
				87, 39, 55, 27, 32, 43, 69, 15, 23, 17, 13);
		tryAndCatchKeeper(terStegen);
	}

	public void nelsonSemedoButtonAction() {
		PlayerCard nelsonSemedo = new PlayerCard(2, "semedo.jpg", "CROSSING", 92, 93, 51, 74, 63, 73, 38, 42, 79, 67,
				63, 80, 62, 30, 84, 82, 91, 87, 83, 76, 80, 82, 83, 63, 60, 78, 80);
		tryAndCatchPlayer(nelsonSemedo);
	}

	public void gerardPiqueButtonAction() {
		PlayerCard gerardPique = new PlayerCard(3, "pique.jpg", "PHYSICAL", 52, 62, 65, 64, 53, 60, 69, 57, 84, 80, 64,
				59, 58, 43, 59, 80, 59, 87, 39, 94, 90, 88, 92, 86, 87, 76, 79);
		tryAndCatchPlayer(gerardPique);
	}

	public void ivanRakiticButtonAction() {
		PlayerCard ivanRakitic = new PlayerCard(4, "rakitic.jpg", "INTERCEPTIONS", 69, 61, 86, 86, 93, 82, 82, 80, 90,
				94, 90, 84, 88, 84, 88, 90, 72, 81, 68, 73, 78, 72, 80, 59, 68, 69, 41);
		tryAndCatchPlayer(ivanRakitic);
	}

	public void sergioBusquestsButtonAction() {
		PlayerCard sergioBusquests = new PlayerCard(5, "busquests.jpg", "LONG PASSING", 45, 46, 68, 63, 54, 78, 60, 44,
				92, 83, 89, 63, 66, 68, 80, 89, 67, 89, 53, 94, 90, 84, 91, 69, 80, 88, 67);
		tryAndCatchPlayer(sergioBusquests);
	}

	public void denisSuarezButtonAction() {
		PlayerCard denisSuarez = new PlayerCard(6, "denis.jpg", "INTERCEPTIONS", 78, 78, 76, 76, 76, 80, 63, 68, 87, 83,
				86, 78, 82, 70, 86, 88, 83, 86, 77, 70, 63, 43, 66, 45, 57, 49, 59);
		tryAndCatchPlayer(denisSuarez);
	}

	public void philippeCoutinhoButtonAction() {
		PlayerCard philippeCoutinho = new PlayerCard(7, "coutinho.jpg", "BALL CONTROL", 93, 79, 81, 86, 95, 87, 70, 76,
				92, 82, 94, 83, 92, 86, 95, 96, 95, 86, 94, 56, 45, 42, 30, 50, 62, 55, 59);
		tryAndCatchPlayer(philippeCoutinho);
	}

	public void arthurMeloButtonAction() {
		PlayerCard arthurMelo = new PlayerCard(8, "arthur.jpg", "LONG SHOTS", 70, 72, 75, 78, 77, 80, 69, 63, 88, 83,
				86, 70, 68, 60, 86, 87, 80, 84, 84, 66, 79, 71, 78, 59, 63, 74, 85);
		tryAndCatchPlayer(arthurMelo);
	}

	public void luisSuarezButtonAction() {
		PlayerCard luisSuarez = new PlayerCard(9, "suarez.jpg", "POSITIONING", 90, 79, 101, 93, 89, 97, 86, 93, 85, 65,
				85, 79, 91, 89, 92, 95, 86, 100, 86, 64, 47, 42, 42, 84, 86, 89, 74);
		tryAndCatchPlayer(luisSuarez);
	}

	public void lionelMessiButtonAction() {
		PlayerCard lionelMessi = new PlayerCard(10, "messi.jpg", "SHOOTING", 97, 93, 103, 91, 97, 98, 80, 92, 97, 90,
				100, 80, 93, 94, 104, 103, 93, 102, 97, 34, 30, 28, 23, 72, 61, 50, 69);
		tryAndCatchPlayer(lionelMessi);
	}

	public void ousmaneDembeleButtonAction() {
		PlayerCard dembele = new PlayerCard(11, "dembele.jpg", "AGILITY", 94, 91, 80, 84, 68, 81, 75, 78, 80, 71, 88,
				80, 79, 64, 94, 87, 92, 85, 86, 43, 31, 34, 36, 44, 48, 54, 59);
		tryAndCatchPlayer(dembele);
	}

	public void jasperCillessenButtonAction() {
		KeeperCard jasperCillessen = new KeeperCard(13, "cillessen.jpg", "GK GENERALIST", 84, 86, 82, 87, 78, 37, 51,
				82, 50, 70, 25, 74, 54, 55, 22, 47, 36, 60, 12, 13, 14, 11);
		tryAndCatchKeeper(jasperCillessen);
	}

	public void malcomButtonAction() {
		PlayerCard malcom = new PlayerCard(14, "malcom.png", "BALL CONTROL", 90, 86, 79, 87, 87, 82, 68, 73, 87, 74, 88,
				83, 77, 81, 88, 88, 95, 83, 86, 22, 29, 18, 26, 59, 65, 53, 58);
		tryAndCatchPlayer(malcom);
	}

	public void lengletButtonAction() {
		PlayerCard lenglet = new PlayerCard(15, "lenglet.jpg", "TACKLING", 74, 75, 24, 59, 36, 49, 43, 24, 81, 69, 61,
				38, 25, 27, 61, 77, 63, 82, 63, 92, 86, 84, 85, 81, 83, 83, 82);
		tryAndCatchPlayer(lenglet);
	}

	public void jordiAlbaButtonAction() {
		PlayerCard alba = new PlayerCard(18, "alba.jpg", "MARKING", 96, 95, 74, 66, 68, 81, 59, 60, 87, 75, 70, 91, 80,
				63, 83, 88, 93, 87, 83, 75, 88, 89, 89, 73, 61, 77, 83);
		tryAndCatchPlayer(alba);
	}

	public void munirButtonAction() {
		PlayerCard munir = new PlayerCard(19, "munir.jpg", "POSITIONING", 78, 81, 81, 78, 78, 78, 66, 77, 79, 58, 73,
				65, 63, 67, 83, 82, 79, 72, 79, 45, 24, 22, 14, 78, 65, 40, 64);
		tryAndCatchPlayer(munir);
	}

	public void sergiRobertoButtonAction() {
		PlayerCard roberto = new PlayerCard(20, "roberto.jpg", "PHYSICAL", 78, 80, 64, 66, 68, 70, 57, 50, 90, 79, 83,
				87, 70, 60, 80, 86, 72, 83, 75, 79, 90, 89, 84, 75, 70, 69, 49);
		tryAndCatchPlayer(roberto);
	}

	public void arturoVidalButtonAction() {
		PlayerCard vidal = new PlayerCard(22, "vidal.jpg", "PASSING", 62, 57, 77, 87, 85, 80, 81, 78, 86, 82, 81, 78,
				76, 68, 77, 86, 75, 87, 77, 86, 90, 90, 87, 83, 82, 96, 87);
		tryAndCatchPlayer(vidal);
	}

	public void samuelUmtitiButtonAction() {
		PlayerCard umtiti = new PlayerCard(23, "umtiti.jpg", "STRENGTH", 74, 75, 52, 85, 76, 60, 61, 70, 84, 73, 60, 71,
				72, 62, 69, 79, 69, 85, 69, 93, 93, 90, 91, 82, 88, 85, 94);
		tryAndCatchPlayer(umtiti);
	}

	public void thomasVermaelenButtonAction() {
		PlayerCard vermaelen = new PlayerCard(24, "tv.jpg", "", 67, 65, 52, 78, 68, 42, 62, 56, 82, 79, 51, 64, 61, 64,
				57, 65, 63, 72, 57, 75, 80, 82, 75, 83, 81, 79, 93);
		tryAndCatchPlayer(vermaelen);
	}

	public void tryAndCatchKeeper(KeeperCard keeper) {
		try {
			// Create a FXML loader for loading the Keeper FXML file.
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Player.fxml"));

			BorderPane editRoot = (BorderPane) fxmlLoader.load();
			PlayerController editController = fxmlLoader.<PlayerController>getController();
			editController.setKeeper(keeper);
			Scene editScene = new Scene(editRoot, Main.SMALL_WINDOW_WIDTH, Main.SMALL_WINDOW_HEIGHT);
			Stage editStage = new Stage();

			editStage.setScene(editScene);
			editStage.setTitle(Main.CARD_WINDOW_TITLE);
			editStage.initModality(Modality.APPLICATION_MODAL);
			// Show the edit scene and wait for it to be closed
			editStage.showAndWait();

		} catch (IOException e) {
			e.printStackTrace();
			// Quit the program (with an error code)
			System.exit(-1);
		}
	}

	public void tryAndCatchPlayer(PlayerCard player) {
		try {
			// Create a FXML loader for loading the Player FXML file.
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Player.fxml"));

			BorderPane editRoot = (BorderPane) fxmlLoader.load();
			PlayerController editController = fxmlLoader.<PlayerController>getController();
			editController.setPlayer(player);
			Scene editScene = new Scene(editRoot, Main.SMALL_WINDOW_WIDTH, Main.SMALL_WINDOW_HEIGHT);
			Stage editStage = new Stage();

			editStage.setScene(editScene);
			editStage.setTitle(Main.CARD_WINDOW_TITLE);
			editStage.initModality(Modality.APPLICATION_MODAL);
			// Show the edit scene and wait for it to be closed
			editStage.showAndWait();

		} catch (IOException e) {
			e.printStackTrace();
			// Quit the program (with an error code)
			System.exit(-1);
		}
	}

	public void handleBackButtonAction() {
		closeWindow();
	}

	/**
	 * This method will close the current stage.
	 */
	@FXML
	void closeWindow() {
		Stage stage = (Stage) barcelonaPlayersPane.getScene().getWindow();
		stage.close();
	}
}
