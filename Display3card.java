/* Program:  Display 3 Card
  * File:     Display3card.java
  * Summary:  Randomly Generates 3 cards
  * Author:   Daniel Saad
  * Date:     12/22/18
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Display3card extends Application {
	@Override
	public void start (Stage primaryStage){
		//random num generator
		int num1 =  (int)(Math.random() * 53);
		int num2 =  (int)(Math.random() * 53);
		int num3 =  (int)(Math.random() * 53);
		//getting 3 random card images
	    Image card1 = new Image("Deck/"+num1+".png");
	    Image card2 = new Image("Deck/"+num2+".png");
	    Image card3 = new Image("Deck/"+num3+".png");
		
		//setting up pane for 1st card
		Pane pane = new HBox(10);
		pane.setPadding(new Insets(5,5,5,5));
		ImageView firstcard = new ImageView(card1);
		//setting up pane for 2nd card
		ImageView secondcard = new ImageView(card2);
		//setting up pane for 3rd card
		ImageView thirdcard = new ImageView(card3);
		pane.getChildren().addAll(firstcard, secondcard, thirdcard);

		//Setting up scene
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Three Random Cards");
		primaryStage.setWidth(200);
		primaryStage.setHeight(200);
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.show();			
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}
