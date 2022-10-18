package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Duck Game"); //titulo da aba
			primaryStage.resizableProperty().setValue(Boolean.FALSE); //redimensionavel
			
			FXMLLoader loader = new FXMLLoader(getClass().getResource("DuckInterface.fxml"));
			Parent duckGameI = loader.load();
			duckGameI.setId("pane");
			
			Scene mainScene = new Scene(duckGameI);
			mainScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(mainScene);
			
			//DuckController duckController = loader.getController();
			
			//primaryStage.setOnCloseRequest(e->{});
			
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
