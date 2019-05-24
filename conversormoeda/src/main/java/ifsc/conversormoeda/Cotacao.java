package ifsc.conversormoeda;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.stage.Stage;

public class Cotacao extends Application {

	@Override
	public void start(Stage window) throws Exception {
		// TODO Auto-generated method stub
		
		
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(500, 400);
		
		BackgroundImage myBI= new BackgroundImage(new Image("file:C:\\Users\\CRUZ\\Desktop\\cambio.png",0,0,false,true),
		        BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		          BackgroundSize.DEFAULT);
		//then you set to your node
		pane.setBackground(new Background(myBI));
		
		pane.getChildren().addAll();
		Scene scene2 = new Scene(pane);
		window.setScene(scene2);
		window.show();
		
	}

}
