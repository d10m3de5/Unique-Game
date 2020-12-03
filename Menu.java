/*
 * The Kill3rs: "Kill ME" 
 * Andrew, Diomides, Kalani,  and Nicole
 * This program shows our game with a menu: play, how to play, and quit. 
 * It also creates different scenes with different aspects, for levels and messages. 
 * Methods will be used to get the points, and if statements for validation 
 * and assurance that user is inputting something correct. Thank You!
 * Date: 12/02/2020
 */
//Packages to be imported 
package application;
 
//Libraries needed
import javafx.scene.control.Button; //buttons 

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javafx.application.Application;   //application package
import javafx.scene.Scene;         //our pop-up window
import javafx.scene.control.Label; //message displayed
import javafx.scene.layout.VBox; //vertical box
import javafx.scene.layout.HBox; //horizontal view
import javafx.scene.text.Font; //font size and type
import javafx.geometry.Pos;   //position
import javafx.stage.Stage;   //our menu outlook
import javafx.scene.image.Image; //for loading images
import javafx.scene.image.ImageView;  //for viewing images
import javafx.event.EventHandler;

import javafx.event.ActionEvent;


/**
 * Description: Our game menu includes the levels, 
 * how to play, play, and a welcome message. Also, some images 
 * will be imported from either web or computer files.
 *  The game uses the main to run the code. Button controls are used to interact with user.
 * Have Fun Playing Killing ME!!!! 
 * 
 * @author Andrew, Diomides, Kalani,  and Nicole
 * @date 12/02/2020
 *
 */
public class Menu extends Application{
	/**
	 * This main class launches the Menu in an application window. 
	 * The start class creates a stage to view our menu. 
	 * @param no arguments passed. 
	 */
	Stage window; 
	Scene Scene1, Scene2, Scene3, Scene4, Scene5, Scene6; //different scenes to be used 
	//Scene 1 is Menu 
	//Scene 2 Is Levels 
	//Scene 3 Is How To Play
	//Scene 4 Is level 3
	//Scene 5 Is level 1
	//Scene 6 Is level 2
	
	// Creating our stage
		 @Override
		 public void start(Stage stage) {
			 // Creates a label with our welcome message
			 // window= stage for switching stages
			 window=stage; 
			 
			 Label welcome = new Label("Hello, Welcome To");
			 
			 // Creating our buttons, for play, how to play, quit
			 Button playButton= new Button("Play");
			 Button howToPlay=new Button("How to Play?"); 
			 Button quit= new Button("Quit"); 
			 
			 //Show the welcome message, play, how to play, and quit in vertical box
			 //Each in their own vertical box, spacing included
			 VBox title=new VBox(30, welcome); 
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
			 window.setTitle("Kill ME: Main Menu");
			 
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
			
			 //Scene for menu 
			 //Menu displaying window
			 VBox menu = new VBox(50, welcome, menuIV, pb, htp,qu);
			 menu.setAlignment(Pos.CENTER);
			 
			 // Setting our scene with welcome message vertically, and aligned
			 Scene Scene1 = new Scene(menu, 700,700);
			
			//displaying the window view in user mode
			 window.setScene(Scene1);
			 
			 window.show();
			 
			 // Button event when you click play it goes to levels 
			 // Play, Scene 2
			
			//Control for play 
			 playButton.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					/**
					 * These are the controls for each level once user clicks play 
					 */
					public void handle(ActionEvent plays) {
						
						//Adding image for Level Windows 
						
						 VBox imageL=new VBox(); 
						 Image level_w_img = new Image("https://i.pinimg.com/736x/b9/49/0a/b9490a26be998b222d30665900bd3da1--creepy-things-creepy-stuff.jpg");
						 
						 ImageView images = new ImageView(level_w_img);
						 imageL.getChildren().addAll(images);
						 imageL.setAlignment(Pos.TOP_CENTER); 
						 images.setFitWidth(350); 
						 images.setFitHeight(350); 
						 images.setPreserveRatio(true); 
						
						//Option to go back to menu
						
						Button back= new Button("Back To Menu"); 
						VBox backtomenu= new VBox(back); 
						backtomenu.setAlignment(Pos.TOP_LEFT);
						back.setFont(new Font("Arial", 25));
						
						//Level 1 to be used in  Scene 5
						Button lv1= new Button("Level 1"); 
						VBox level1=new VBox(30, lv1); 
						level1.setAlignment(Pos.CENTER);
						lv1.setFont(new Font("Arial", 25)); 
						
						//Level 2 to be used in scene 6
						Button lv2= new Button("Level 2"); 
						VBox level2=new VBox(30, lv2); 
						level2.setAlignment(Pos.CENTER);
						lv2.setFont(new Font("Arial", 25)); 
						
						//Level 3 to be used in scene 4
						Button lv3= new Button("Level 3"); 
						VBox level3=new VBox(30, lv3); 
						level3.setAlignment(Pos.CENTER);
						lv3.setFont(new Font("Arial", 25));
						
						//Scene 2 outlook for Play button 
						VBox levels = new VBox(30, backtomenu,imageL,level1, level2, level3);
						levels.setAlignment(Pos.CENTER);
						Scene Scene2= new Scene(levels, 800, 800);
						window.setScene(Scene2);
						window.show(); 
					
						
						//go back to previous scene 
						back.setOnAction(new EventHandler<ActionEvent>() {
							@Override
							/**
							 * This button goes back to previous scene. 
							 */
							
							public void handle(ActionEvent levels) {
								
						 //Go back to previous scene
								back.setOnAction(e -> window.setScene(Scene1)) ;
						}}); 
						
						
						
						//Level 2, scene 6 to be called later by level 1 
						
						
						lv2.setOnAction(new EventHandler<ActionEvent>() {
							@Override
							/**
							 * Once level 2 is clicked this will output a message 
							 */
							
							public void handle(ActionEvent lev_2) {
								
								//Image of level 2
								 VBox image4=new VBox(); 
								 Image level_4_img = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBqRHfweKqbd_KGUR2ldUqcFSOOiYIxmolfQ&usqp=CAU");
								 
								 ImageView level_2 = new ImageView(level_4_img);
								 image4.getChildren().addAll(level_2);
								 image4.setAlignment(Pos.TOP_CENTER); 
								 level_2.setFitWidth(500); 
								 level_2.setFitHeight(500); 
								 level_2.setPreserveRatio(true); 
								 
								  
								//Option to go back to menu
								
								Button back1= new Button("Back To Menu"); 
								VBox backtomenu1= new VBox(back1); 
								backtomenu1.setAlignment(Pos.TOP_LEFT);
								back1.setFont(new Font("Arial", 25));
								
								
								
								//go back to previous scene 
								back1.setOnAction(new EventHandler<ActionEvent>() {
									@Override
									/**
									 * This button goes back to previous scene 
									 */
									
									public void handle(ActionEvent lev_22) {
										
								 //Go back to previous scene
										back1.setOnAction(e -> window.setScene(Scene2)) ;
								}}); 
								//Message displayed when clicking button This is for level 2
								Label go=new Label("This level is in another file. Go to Andrew's file to play level 2! "); 
								HBox gt= new HBox(10, go); 
								gt.setAlignment(Pos.CENTER);
								go.setFont(new Font("Arial", 35));
								
								HBox lV2= new HBox(10, backtomenu1, go); 
								lV2.setAlignment(Pos.CENTER); 
								
								//Setting our scene
								Scene Scene6= new Scene(lv2, 900,900);  
								stage.setScene(Scene6);
								stage.show();
							
								
						}}); 
					
						//This Scene is level 1
						
						
						lv1.setOnAction(new EventHandler<ActionEvent>() {
							@Override
							/**
							 * Once level 1 is clicked this will be the output. 
							 */
							
							public void handle(ActionEvent lev_11) {
								
		
								
								//adding 50 points to the 200 since this goes to next level 
								boolean y=true;
								if(y==true) {
								getPoints(200);
								//creates button and adds it
								Button back= new Button("Back To Menu"); 
								VBox backtomenu= new VBox(back); 
								backtomenu.setAlignment(Pos.TOP_LEFT);
								back.setFont(new Font("Arial", 25)); 
								//go back to previous scene 
								back.setOnAction(new EventHandler<ActionEvent>() {
									@Override
									/**
									 * This button goes back to next scene 
									 */
									
									public void handle(ActionEvent lev_1) {
										
								 //Go back to next scene
										back.setOnAction(e -> window.setScene(Scene6)) ;
								}}); }//closes if loop for menu button 
								//Label 
								Label labelLV=new Label("How do you want to KILL ME? "); 
								HBox lv= new HBox(10, labelLV); 
								lv.setAlignment(Pos.CENTER);
								labelLV.setFont(new Font("Arial", 25)); 
								
			
								//Image of level 1
								 VBox image2=new VBox(); 
								 Image level_1_img = new Image("https://thumbs.dreamstime.com/z/weapons-19930099.jpg");
								 
								 ImageView level_1 = new ImageView(level_1_img);
								 image2.getChildren().addAll(level_1);
								 image2.setAlignment(Pos.CENTER); 
								 level_1.setFitWidth(350); 
								 level_1.setFitHeight(350); 
								 level_1.setPreserveRatio(true); 
								 
								// Making options 
								Button option1= new Button("Bomb ME");
						
								Button option2= new Button("Stab ME");
								Button option3= new Button("Shoot ME");
								Button option4= new Button("Drown ME"); 
								Button option6= new Button("Kill ME with the Sword"); 
								Button option5= new Button("Play Dead With ME");
								
								option1.setFont(new Font("Arial", 25));
								option2.setFont(new Font("Arial", 25));
								option3.setFont(new Font("Arial", 25));
								option4.setFont(new Font("Arial", 25));
								option5.setFont(new Font("Arial", 25));
								option6.setFont(new Font("Arial", 25));
								
								//controls to displayed in window
							
								VBox leve1= new VBox(10, backtomenu, image2, level_1, option1, option2, option3, option4, option5, option6); 
								leve1.setAlignment(Pos.CENTER); 
								
								//Setting our scene 5
								Scene Scene5= new Scene(leve1, 1900, 1050);  
								stage.setScene(Scene5);
								stage.show();
				
							
						}}); 
						
						
						
						// level 3, to be used in scene 4 
						
						
						lv3.setOnAction(new EventHandler<ActionEvent>() {
							@Override
							/**
							 * Once level 3 is clicked this will output a coming soon, still developing message
							 */
							
							public void handle(ActionEvent lev_3) {
								//Image of level 3
								 VBox image3=new VBox(); 
								 Image level_3_img = new Image("https://images-na.ssl-images-amazon.com/images/I/61emM5-wHJL._AC_SL1001_.jpg");
								 
								 ImageView level_3 = new ImageView(level_3_img);
								 image3.getChildren().addAll(level_3);
								 image3.setAlignment(Pos.TOP_CENTER); 
								 level_3.setFitWidth(500); 
								 level_3.setFitHeight(500); 
								 level_3.setPreserveRatio(true); 
								//Option to go back to menu
								
								Button back2= new Button("Back To Menu"); 
								VBox backtomenu2= new VBox(back); 
								backtomenu2.setAlignment(Pos.TOP_LEFT);
								back2.setFont(new Font("Arial", 25));
								
								//Message displayed when clicking button
								Label comingSoon=new Label("This level is in development. Coming Soon! "); 
								HBox cs= new HBox(10, comingSoon); 
								cs.setAlignment(Pos.CENTER);
								comingSoon.setFont(new Font("Arial", 35));
								
								HBox working= new HBox(10, backtomenu, comingSoon); 
								working.setAlignment(Pos.CENTER); 
								
								//Setting our scene
								Scene Scene4= new Scene(working, 1900, 1050);  
								stage.setScene(Scene4);
								stage.show();
							
								
								//go back to previous scene 
								back2.setOnAction(new EventHandler<ActionEvent>() {
									@Override
									/**
									 * This button goes back to previous scene 
									 */
									
									public void handle(ActionEvent lev_1) {
										
								 //Go back to previous scene
										back2.setOnAction(e -> window.setScene(Scene1)) ;
								}}); 
								
								
		
							}});
								
							
						}}); 
						  
			
			 
			 
			//Button control for go back to menu 
			howToPlay.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					/**
					 * These are the controls for how to play 
					 */
					public void handle(ActionEvent hplay) {
						
						//Option to go back to menu
						
						Button back3= new Button("Back To Menu"); 
						VBox backtomenu3= new VBox(back3); 
						backtomenu3.setAlignment(Pos.TOP_LEFT);
						back3.setFont(new Font("Arial", 25));
						//go back to previous scene 
						back3.setOnAction(new EventHandler<ActionEvent>() {
							@Override
							/**
							 * This button goes back to previous scene 
							 */
							
							public void handle(ActionEvent lev_1) {
								
						 //Go back to previous scene
								back3.setOnAction(e -> window.setScene(Scene1)) ;
							
						}}); 
						

						//Image of how to play
						 VBox image1=new VBox(); 
						 Image howToImage = new Image("https://i.ytimg.com/vi/tmR9PHf_QgE/maxresdefault.jpg");
						 
						 ImageView howToIV = new ImageView(howToImage);
						 image1.getChildren().addAll(howToIV);
						 image1.setAlignment(Pos.TOP_CENTER); 
						 howToIV.setFitWidth(400); 
						 howToIV.setFitHeight(400); 
						 howToIV.setPreserveRatio(true); 
						
						Label htp0= new Label("These are the rules of the game: \n"); 
						VBox htp1= new VBox(htp0); 
						htp1.setAlignment(Pos.CENTER); 
						htp0.setFont(new Font("Arial", 25));
						
						Label htp2= new Label("1. Try to find a way to kill ME \n\n"); 
						VBox htp_2= new VBox(htp2); 
						htp_2.setAlignment(Pos.CENTER); 
						htp2.setFont(new Font("Arial", 25));
						
						Label htp3= new Label("2. Levels get harder as you kill ME. Use AWSD or arrow keys to move for level 2. \n"); 
						VBox htp_3= new VBox(htp3); 
						htp_3.setAlignment(Pos.CENTER); 
						htp3.setFont(new Font("Arial", 25));
						
						Label htp4= new Label("3. Again, the point is to kill ME, so be strategic \n"); 
						VBox htp_4= new VBox(htp4); 
						htp_4.setAlignment(Pos.CENTER); 
						htp4.setFont(new Font("Arial", 25));
						
						VBox howto= new VBox(30, backtomenu3, howToIV, htp1, htp_2, htp_3, htp_4); 
						howto.setAlignment(Pos.CENTER); 
						Scene Scene3= new Scene(howto, 900, 900);
						window.setScene(Scene3);
						window.show(); 
							
					}}); 
			 
			 
			 // When quit is clicked it will call the action event class
			 quit.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					/**
					 * This method calls the quit button to exit program 
					 */
					public void handle(ActionEvent quitting) {
						
							System.exit(0); 
								
					}}); 


			 
			 }

	/**
	 * This main class runs the whole game, but it also creates scanner for user input such as name and age
	 * These attributes are stored in a file, named by the user. Then, the main calls a method to give points to user. 
	 * @param args, no arguments passed
	 * @throws FileNotFoundException, in case file is not found there is the throws exception
	 */
		 public static void main(String[] args) throws FileNotFoundException{
		//Launching the application
		Scanner keyboard= new Scanner(System.in); 
		 
		System.out.println("Hello Welcome to Kill ME!"); 
		System.out.println("Please know that this is a PG-13 game. You must be above 13 years old to play. "); 
		
		//Enter name of file
		System.out.println("Please enter name of file to save your stats: "); 
		String namefile= keyboard.nextLine(); 
		PrintWriter file=new PrintWriter(namefile); //creating file
		
		//Enter user info 
		System.out.println("Name: ");  
		String name=keyboard.nextLine(); 
		System.out.println("Age: "); 
		int age=keyboard.nextInt();
		final int bonuspoints=150; 
		System.out.println("How Lucky!! You just earned "+ getPoints(bonuspoints)+ " points"); 
		//Outputting in file 
		
		file.printf("Name: ", name+"\n"); 
		file.printf("Age: ", age+"\n"); 
		file.printf("Total Points: "+getPoints(150+50)); 
		//Will only launch if age is greater than 13
		if (age>=13) {
		
		launch(); }
		else {
			System.out.println("Sorry, you dont have the required age to play. Thanks though :)"); 
		}
		
		keyboard.close(); 
		file.close(); 
		System.out.println("Thanks For Playing ME! Have a Nice Day!"); 
		
		System.exit(0); //exits if you are not allowed to play

	}
	/**
	 * This method gets the points for passing to the next level
	 * @param p, adds 50 points to your bonus 
	 * @return, we return the total points. 
	 */
	public static int getPoints(int p) {
		int points= p; 
		points+=50; 
		return points; 
	}
	

}