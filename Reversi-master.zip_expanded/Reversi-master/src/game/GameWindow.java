package game;

import javax.swing.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;

/*
public class GameWindow extends JFrame {

    public GameWindow(){
        GamePanel gp = new GamePanel();
        this.add(gp);
        this.setTitle("OTHELLO");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new GameWindow();
    }

}
*/

public class GameWindow extends Application {
	
	int mode;
	int lvl;
	
	@Override
	public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 400);
        Button launch ;
        Button Quiq ;
    	launch = new Button("new Partie");   
    	launch.setPrefSize(800, 200);
    	Quiq = new Button("Quitter");   
    	Quiq.setTranslateY(200);
    	Quiq.setPrefSize(800, 200);
    	root.getChildren().addAll(launch,Quiq);    	
        primaryStage.setScene(scene);    	
    	primaryStage.setTitle("Othello");
    	primaryStage.show();
    	
    	Quiq.setOnAction((new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent event) { 
            	primaryStage.close();
            	
             } 
          })); 
    	
    	
    	//*----------------------------
    	Group rootx = new Group();
        Scene interfacex = new Scene(rootx, 800, 600);        
        Button ia_vs_ia = new Button("IA vs IA");   
        ia_vs_ia.setPrefSize(800, 200);        
        Button p_vs_ia = new Button("Player vs IA");   
        p_vs_ia.setTranslateY(200);
        p_vs_ia.setPrefSize(800, 200);
    	Button p_vs_p = new Button("Player vs Player");   
    	p_vs_p.setTranslateY(400);
    	p_vs_p.setPrefSize(800, 200);
    	rootx.getChildren().addAll(ia_vs_ia,p_vs_ia, p_vs_p);    	    	
    	launch.setOnAction((new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent event) { 
            	/*primaryStage.close();
            	JFrame frame;
            	frame = new JFrame();
            	GamePanel gp = new GamePanel();
            	frame.add(gp);
            	frame.setTitle("OTHELLO");
            	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            	frame.pack();
            	frame.setVisible(true);*/
            	
                primaryStage.setScene(interfacex);
            	
             } 
          })); 
    	
    	
    	Group rootx_x = new Group();
        Scene interfacexx = new Scene(rootx_x, 800, 600);
        
        Button easy = new Button("Easy");   
        easy.setPrefSize(800, 200);
        
        Button medium = new Button("Medium");   
        medium.setTranslateY(200);
        medium.setPrefSize(800, 200);

    	Button Hard = new Button("Hard");   
    	Hard.setTranslateY(400);
    	Hard.setPrefSize(800, 200);
    	
    	rootx_x.getChildren().addAll(easy,medium, Hard);
    	
    	ia_vs_ia.setOnAction((new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent event) { 
            	/*primaryStage.close();
            	
            	frame.add(gp);
            	frame.setTitle("OTHELLO");
            	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            	frame.pack();
            	frame.setVisible(true);*/
            	
            	mode = 2;
                primaryStage.setScene(interfacexx);
            	
             } 
          })); 
    	p_vs_ia.setOnAction((new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent event) { 
            	/*primaryStage.close();
            	
            	frame.add(gp);
            	frame.setTitle("OTHELLO");
            	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            	frame.pack();
            	frame.setVisible(true);*/
            	
            	mode = 0;
                primaryStage.setScene(interfacexx);
            	
             } 
          })); 
    	p_vs_p.setOnAction((new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent event) { 

            	mode = 1; 
            	primaryStage.close();
            	JFrame frame;
            	frame = new JFrame();
            	GamePanel gp = new GamePanel(5,mode);
            	frame.add(gp);
            	frame.setTitle("OTHELLO");
            	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            	frame.pack();
            	frame.setVisible(true);
            	
             } 
          })); 
    	
    	
    	
    	easy.setOnAction((new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent event) { 
            	primaryStage.close();
            	JFrame frame;
            	frame = new JFrame();
            	GamePanel gp = new GamePanel(1,mode); 
            	frame.add(gp);
            	frame.setTitle("OTHELLO");
            	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            	frame.pack();
            	frame.setVisible(true);
            	
             } 
          })); 
    	
    	medium.setOnAction((new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent event) { 
            	primaryStage.close();
            	JFrame frame;
            	frame = new JFrame();
            	GamePanel gp = new GamePanel(4,mode); // met cb tu veux 
            	frame.add(gp);
            	frame.setTitle("OTHELLO");
            	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            	frame.pack();
            	frame.setVisible(true);
            	
             } 
          })); 
    	Hard.setOnAction((new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent event) { 
            	primaryStage.close();
            	JFrame frame;
            	frame = new JFrame();
            	GamePanel gp = new GamePanel(7,mode);
            	frame.add(gp);
            	frame.setTitle("OTHELLO");
            	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            	frame.pack();
            	frame.setVisible(true);
            	
             } 
          })); 
		
	}
	
}