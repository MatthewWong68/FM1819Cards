import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PlayerController {

	@FXML
	private BorderPane malcomPane;

	@FXML
	private Label number;

	@FXML
	private ImageView card;

	@FXML
	private Label skillBoost;

	@FXML
	private Label l1;

	@FXML
	private Label l2;

	@FXML
	private Label l3;

	@FXML
	private Label l4;

	@FXML
	private Label l5;

	@FXML
	private Label l6;

	@FXML
	private Label l7;

	@FXML
	private Label l8;

	@FXML
	private Label l9;

	@FXML
	private Label l10;

	@FXML
	private Label l11;

	@FXML
	private Label l12;

	@FXML
	private Label l13;

	@FXML
	private Label l14;

	@FXML
	private Label l15;

	@FXML
	private Label l16;

	@FXML
	private Label l17;

	@FXML
	private Label l18;

	@FXML
	private Label l19;

	@FXML
	private Label l20;

	@FXML
	private Label l21;

	@FXML
	private Label l22;

	@FXML
	private Label l23;

	@FXML
	private Label l24;

	@FXML
	private Label l25;

	@FXML
	private Label l26;

	@FXML
	private Label l27;

	@FXML
	private Button back;

	@FXML
	private Button upgrade;

	PlayerCard pc;

	KeeperCard kc;

	/**
	 * Initialize the controller.
	 */
	public void initialize() {
		back.setOnAction(e -> {
			handleBackButtonAction();
		});
		upgrade.setOnAction(e -> {
			handleUpgradeButtonAction();
		});
	}

	public void setPlayer(PlayerCard pc) {
		this.pc = pc;
		number.setText("No." + Integer.toString(pc.getNumber()));
		Image i = new Image(pc.getCard());
		card.setImage(i);
		skillBoost.setText("Skill boost: " + pc.getSkillBoost());
		l1.setText(Integer.toString(pc.getAcceleration()) + " ACCELERATION");
		l2.setText(Integer.toString(pc.getSprintSpeed()) + " SPRINT SPEED");
		l3.setText(Integer.toString(pc.getFinishing()) + " FINISHING");
		l4.setText(Integer.toString(pc.getShotPower()) + " SHOT POWER");
		l5.setText(Integer.toString(pc.getLongShot()) + " LONG SHOT");
		l6.setText(Integer.toString(pc.getPositioning()) + " POSITIONING");
		l7.setText(Integer.toString(pc.getPenalties()) + " PENALTIES");
		l8.setText(Integer.toString(pc.getVolley()) + " VOLLEY");
		l9.setText(Integer.toString(pc.getShortPassing()) + " SHORT PASSING");
		l10.setText(Integer.toString(pc.getLongPassing()) + " LONG PASSING");
		l11.setText(Integer.toString(pc.getVision()) + " VISION");
		l12.setText(Integer.toString(pc.getCrossing()) + " CROSSING");
		l13.setText(Integer.toString(pc.getCurve()) + " CURVE");
		l14.setText(Integer.toString(pc.getFreeKick()) + " FREE KICK");
		l15.setText(Integer.toString(pc.getDribbling()) + " DRIBBLING");
		l16.setText(Integer.toString(pc.getBallControl()) + " BALL CONTROL");
		l17.setText(Integer.toString(pc.getAgility()) + " AGILITY");
		l18.setText(Integer.toString(pc.getReactions()) + " REACTIONS");
		l19.setText(Integer.toString(pc.getBalance()) + " BALANCE");
		l20.setText(Integer.toString(pc.getMarking()) + " MARKING");
		l21.setText(Integer.toString(pc.getStandingTackle()) + " STANDING TACKLE");
		l22.setText(Integer.toString(pc.getSlidingTackle()) + " SLIDING TACKLE");
		l23.setText(Integer.toString(pc.getInterceptions()) + " INTERCEPTIONS");
		l24.setText(Integer.toString(pc.getHeading()) + " HEADING");
		l25.setText(Integer.toString(pc.getStrength()) + " STRENGTH");
		l26.setText(Integer.toString(pc.getAggression()) + " AGGRESSION");
		l27.setText(Integer.toString(pc.getJumping()) + " JUMPING");
	}

	public void setKeeper(KeeperCard kc) {
		this.kc = kc;
		number.setText("No." + Integer.toString(kc.getNumber()));
		Image i = new Image(kc.getCard());
		card.setImage(i);
		skillBoost.setText("Skill boost: " + kc.getSkillBoost());
		l1.setText(Integer.toString(kc.getDiving()) + " DIVING");
		l2.setText(Integer.toString(kc.getGKPositioning()) + " GK POSITIONING");
		l3.setText(Integer.toString(kc.getReflexes()) + " REFLEXES");
		l4.setText(Integer.toString(kc.getHandling()) + " HANDLING");
		l5.setText(Integer.toString(kc.getKicking()) + " KICKING");
		l6.setText(Integer.toString(kc.getBallControl()) + " BALL CONTROL");
		l7.setText(Integer.toString(kc.getAgility()) + " AGILITY");
		l8.setText(Integer.toString(kc.getReactions()) + " REACTIONS");
		l9.setText(Integer.toString(kc.getBalance()) + " BALANCE");
		l10.setText(Integer.toString(kc.getStrength()) + " STRENGTH");
		l11.setText(Integer.toString(kc.getAggression()) + " AGGRESSION");
		l12.setText(Integer.toString(kc.getJumping()) + " JUMPING");
		l13.setText(Integer.toString(kc.getAcceleration()) + " ACCELERATION");
		l14.setText(Integer.toString(kc.getSprintSpeed()) + " SPRINT SPEED");
		l15.setText(Integer.toString(kc.getPenalties()) + " PENALTIES");
		l16.setText(Integer.toString(kc.getShortPassing()) + " SHORT PASSING");
		l17.setText(Integer.toString(kc.getLongPassing()) + " LONG PASSING");
		l18.setText(Integer.toString(kc.getVision()) + " VISION");
		l19.setText(Integer.toString(kc.getCrossing()) + " CROSSING");
		l20.setText(Integer.toString(kc.getCurve()) + " CURVE");
		l21.setText(Integer.toString(kc.getFreeKick()) + " FREE KICK");
		l22.setText(Integer.toString(kc.getSlidingTackle()) + " SLIDING TACKLE");
		l23.setText("");
		l24.setText("");
		l25.setText("");
		l26.setText("");
		l27.setText("");
	}

	public void handleBackButtonAction() {
		closeWindow();
	}

	public void handleUpgradeButtonAction() {
		if (pc.getNumber() == 8) {
			PlayerCard upgradedArthur = new PlayerCard(8, "upgradedArthur.jpg", "GENERALIST", 72, 75, 79, 80, 81, 84,
					69, 63, 95, 90, 93, 72, 70, 62, 90, 92, 81, 89, 86, 68, 84, 73, 83, 61, 65, 77, 88);
			tryAndCatchPlayer(upgradedArthur);
		} else if (pc.getNumber() == 10) {
			PlayerCard upgradedMessi = new PlayerCard(10, "upgradedMessi.jpg", "AGILITY", 104, 100, 110, 96, 103, 102,
					80, 93, 104, 93, 107, 87, 95, 96, 111, 109, 98, 107, 100, 36, 32, 30, 26, 73, 63, 50, 69);
			tryAndCatchPlayer(upgradedMessi);
		} else if (pc.getNumber() == 11) {
			PlayerCard upgradedDembele = new PlayerCard(11, "upgradedDembele.jpg", "SHOT POWER", 98, 95, 84, 85, 70, 84,
					75, 79, 83, 73, 92, 84, 80, 64, 98, 90, 95, 88, 87, 44, 33, 35, 36, 45, 50, 54, 59);
			tryAndCatchPlayer(upgradedDembele);
		} else if (pc.getNumber() == 20) {
			PlayerCard upgradedRoberto = new PlayerCard(20, "upgradedRoberto.jpg", "REACTIONS", 81, 83, 65, 68, 71, 82,
					57, 50, 99, 85, 87, 96, 74, 64, 84, 91, 76, 88, 77, 83, 96, 94, 90, 79, 71, 71, 52);
			tryAndCatchPlayer(upgradedRoberto);
		} else {
			Alert noUpgrade = new Alert(Alert.AlertType.ERROR);
			noUpgrade.setHeaderText("No upgrade version");
			noUpgrade.setContentText("This player doesn't have a upgrade version.");
			noUpgrade.showAndWait();
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

	@FXML
	void closeWindow() {
		Stage stage = (Stage) malcomPane.getScene().getWindow();
		stage.close();
	}
}
