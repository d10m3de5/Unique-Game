/*
 * The Kill3rs: "Kill ME" 
 * Andrew, Diomides, Kalani,  and Nicole
 * This program shows a simple menu of our game, including images, buttons, and texts. 
 * Date: 11/24/2020
 */
//Packages to be imported 
package application;
 

import javafx.scene.control.Button; //buttons 
import javafx.application.Application;   //application package
import javafx.scene.Scene;         //our pop-up window
import javafx.scene.control.Label; //message displayed
import javafx.scene.layout.VBox; //horizontal view
import javafx.scene.text.Font; //font size and type
import javafx.geometry.Pos;   //position
import javafx.stage.Stage;   //our menu outlook
import javafx.scene.image.Image; //for loading images
import javafx.scene.image.ImageView;  //for viewing images
/**
 * Description: Our game menu includes the levels, 
 * how to play, play, and a welcome message. Also, some images 
 * will be imported from either web or computer files. 
 * Have Fun Playing Killing ME!!!! 
 * 
 * @author Andrew, Diomides, Kalani,  and Nicole
 * @date 11/24/2020
 *
 */
public class Menu extends Application{
	/**
	 * This main class launches the Menu in an application window. 
	 * The start class creates a stage to view our menu. 
	 * @param no arguments passed. 
	 */
	// Creating our stage
		 @Override
		 public void start(Stage stage) {
			 // Creates a label with our welcome message
			 Label welcome = new Label("Hello, Welcome To");
			 
			 // Creating our buttons, for play, how to play, quit
			 Button playButton= new Button("Play");
			 Button howToPlay=new Button("How to Play?"); 
			 Button quit= new Button("Quit"); 
			 
			 //Show the welcome message, play, how to play, and quit in vertical box
			 //Each in their own vertical box, spacing included
			 VBox title=new VBox(70, welcome); 
			 title.setAlignment(Pos.TOP_CENTER);
			 welcome.setFont(new Font("Arial", 35)); 
			 
			 
			 VBox pb=new VBox(10, playButton);
			 pb.setAlignment(Pos.CENTER); 
			 playButton.setFont(new Font("Arial", 25));
			 
			 VBox htp=new VBox(10, howToPlay); 
			 htp.setAlignment(Pos.CENTER);
			 howToPlay.setFont(new Font("Arial", 25));
			 
			 VBox qu=new VBox(10, quit); 
			 qu.setAlignment(Pos.CENTER);
			 quit.setFont(new Font("Arial", 25));
			 

			 //Setting the title of our menu
			 stage.setTitle("Kill ME: Main Menu");
			 
			 //Loading and viewing images from online
			 VBox image=new VBox(); 
			 Image menuImage = new Image("https://img.favpng.com/25/11/16/leave-me-alone-logo-rectangle-brand-banner-png-favpng-GWKvzXy2DLdyMUgr5JRTbjRjc.jpg");
			 
			 ImageView menuIV = new ImageView(menuImage);
			 image.getChildren().addAll(menuIV);
			 image.setAlignment(Pos.TOP_CENTER); 

			 //Width and height of image 
			 menuIV.setFitWidth(400); 
			 menuIV.setFitHeight(400); 
			 menuIV.setPreserveRatio(true);  
			
			 //Menu displaying window
			 VBox menu = new VBox(50, welcome, menuIV, pb, htp,qu);
			 menu.setAlignment(Pos.CENTER);
			 
			 // Setting our scene with welcome message vertically, and aligned
			 Scene scene = new Scene(menu, 500,500);
			 
			//displaying the window view in user mode
			 stage.setScene(scene);
			 stage.show(); 
			 
			 }

	public static void main(String[] args) {
		//Launching the application
		launch(); 

	}

}