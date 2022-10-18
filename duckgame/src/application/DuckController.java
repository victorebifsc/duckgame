package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DuckController {
	
	Duck mallard = new MallardDuck();
	Duck redHead = new RedHeadDuck();
	Duck rubber = new RubberDuck();
	Duck decoy = new DecoyDuck();
	
	Image imgMallard = new Image("./images/mallardduck.jpg");
	Image imgRedHead = new Image("./images/redheadduck.jpg");
	Image imgRubber = new Image("./images/rubberduck.jpg");
	Image imgDecoy = new Image("./images/decoyduck.jpg");
	
	Duck selectedDuck = null;

    @FXML
    private Button btnMallardDuck;

    @FXML
    private Button btnRedHeadDuck;

    @FXML
    private Button btnRubberDuck;

    @FXML
    private Button btnDecoyDuck;

    @FXML
    private Label lblDuckType;

    @FXML
    private Button btnQuack;

    @FXML
    private Button btnSwim;

    @FXML
    private Button btnDisplay;

    @FXML
    private Button btnFly;

    @FXML
    private Label lblResult;
    
    @FXML
    private ImageView imgDuckImage;

    //DUCKS
    
    @FXML
    void onClickMallardDuck(ActionEvent event) {
    	selectedDuck = mallard;
    	lblDuckType.setText("Mallard Duck selected");
    	lblResult.setText("...");
    	imgDuckImage.setImage(imgMallard);
    }
    
    @FXML
    void onClickRedHeadDuck(ActionEvent event) {
    	selectedDuck = redHead;
    	lblDuckType.setText("Red Head Duck selected");
    	lblResult.setText("...");
    	imgDuckImage.setImage(imgRedHead);
    }
    
    @FXML
    void onClickDecoyDuck(ActionEvent event) {
    	selectedDuck = decoy;
    	lblDuckType.setText("Decoy Duck selected");
    	lblResult.setText("...");
    	imgDuckImage.setImage(imgDecoy);
    }

    @FXML
    void onClickRubberDuck(ActionEvent event) {
    	selectedDuck = rubber;
    	lblDuckType.setText("Rubber Duck selected");
    	lblResult.setText("...");
    	imgDuckImage.setImage(imgRubber);
    }
    
    //ACTIONS
    
    @FXML
    void onClickQuack(ActionEvent event) {
    	if (selectedDuck != null) {
    		if (selectedDuck instanceof QuackBehavior) {
    			lblResult.setText(((QuackBehavior) selectedDuck).quack());
    		}
    		else {
    			lblResult.setText("Nenhum QuackBehavior Definido");
    		}
    	}
    	else {
    		lblResult.setText("No duck selected");
    	}
    }

    @FXML
    void onClickSwim(ActionEvent event) {
    	if (selectedDuck != null) {
    		if (selectedDuck instanceof SwimBehavior) {
    			lblResult.setText(((SwimBehavior) selectedDuck).swim());
    		}
    		else {
    			lblResult.setText("Nenhum SwimBehavior Definido");
    		}
    	}
    	else {
    		lblResult.setText("No duck selected");
    	}
    }
    
    @FXML
    void onClickFly(ActionEvent event) {
    	if (selectedDuck != null) {
    		if (selectedDuck instanceof FlyBehavior) {
    			lblResult.setText(((FlyBehavior) selectedDuck).fly());
    		}
    		else {
    			lblResult.setText("Nenhum FlyBahavior Definido");
    		}
    	}
    	else {
    		lblResult.setText("No duck selected");
    	}
    }
    
    @FXML
    void onClickDisplay(ActionEvent event) {
    	if (selectedDuck != null) {
    		lblResult.setText((selectedDuck).display());
    	}
    	else {
    		lblResult.setText("No duck selected");
    	}
    }
    

    
}

