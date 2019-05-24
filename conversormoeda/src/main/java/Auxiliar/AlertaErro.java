package Auxiliar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AlertaErro extends Application {

	
	
	@Override
	public void start(Stage window) throws Exception {
		// TODO Auto-generated method stub
		
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(350, 150);
		
		BackgroundImage myBI= new BackgroundImage(new Image("https://i.imgur.com/GnTPxFl.png",0,0,false,true),
		        BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		          BackgroundSize.DEFAULT);
		//then you set to your node
		pane.setBackground(new Background(myBI));
		
		Text texto1 = new Text();
		texto1.setLayoutX(100);
		texto1.setLayoutY(100);
		
		pane.getChildren().addAll(texto1);
		Scene scene2 = new Scene(pane);
		window.setScene(scene2);
		window.show();
		
	}
	
}
