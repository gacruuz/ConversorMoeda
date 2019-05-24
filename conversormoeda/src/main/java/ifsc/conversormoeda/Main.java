package ifsc.conversormoeda;

import Auxiliar.AlertaErro;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
@SuppressWarnings("restriction")
public class Main extends Application {

	private AnchorPane pane;
	Stage window;
	Scene scene1, scene2;
	Button button1;
	Button button2;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setResizable(false);

		componentes();

		Scene scene = new Scene(pane);
		window.setScene(scene);
		window.show();

	}

	public void componentes() {

		pane = new AnchorPane();
		pane.setPrefSize(500, 400);
		
		BackgroundImage myBI= new BackgroundImage(new Image("https://i.imgur.com/b0WkuJC.png",0,0,false,true),
		        BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		          BackgroundSize.DEFAULT);
		//then you set to your node
		pane.setBackground(new Background(myBI));

		Button button1 = new Button("LOGAR");
		button1.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		button1.setLayoutX(175);
		button1.setLayoutY(250);
		button1.setPrefWidth(60);

		Button button2 = new Button("SAIR");
		button2.setFont(Font.font("Bebas", FontWeight.BOLD, 12));
		button2.setLayoutX(255);
		button2.setLayoutY(250);
		button2.setPrefWidth(60);

		TextField usuario = new TextField();
		usuario.setLayoutX(185);
		usuario.setLayoutY(130);
		usuario.setPrefWidth(120);

		TextField senha = new TextField();
		senha.setLayoutX(185);
		senha.setLayoutY(200);
		senha.setPrefWidth(120);

		// -------- ACOES -------//
		button1.setOnAction(new EventHandler<ActionEvent>() {
		
			@Override

			public void handle(ActionEvent event) {
				
				if (usuario.getText().equals("admin") && senha.getText().equals("admin")) {
					try {
						new Menu().start(window);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				}else {
					
						try {
							new AlertaErro().start(new Stage());
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				}

			}

		});

		button2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
			}
		});

		// -------- ACOES -------//

		pane.getChildren().addAll(button1, button2, senha, usuario);

	}

}