package comp303.demo;


import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Run to see if everything works well.
 */
public class Welcome extends Application implements EventHandler<ActionEvent>, ChangeListener<Toggle>
{
	private static final int MARGIN = 10;
	private static final int WIDTH = 180;
	private static final int HEIGHT = 200;
	private static final String PART_1 = "Welcome";
	private static final String PART_2 = "to COMP 303";

	private AlternatingLabelProvider aLabelProvider = new AlternatingLabelProvider(PART_1, PART_2);
	private Label aText = new Label();
	private Button aButton = new Button("Toggle");
	private ToggleGroup aSkin = new ToggleGroup();
	private Scene aScene;
	
	/**
	 * Launches the application.
	 * @param pArgs This program takes no argument.
	 */
	public static void main(String[] pArgs) 
	{
        launch(pArgs);
    }
    
    @Override
    public void start(Stage pPrimaryStage) 
    {
		aText.setText(PART_1);
        pPrimaryStage.setTitle(aLabelProvider.getBoth());
        aButton.setOnAction(this);
        
        aSkin.selectedToggleProperty().addListener(this);

        RadioButton rb1 = new RadioButton("Plain");
        rb1.setToggleGroup(aSkin);
        rb1.setUserData("Plain");
        rb1.setSelected(true);

        RadioButton rb2 = new RadioButton("Floral");
        rb2.setUserData("Floral");
        rb2.setToggleGroup(aSkin);
         
        RadioButton rb3 = new RadioButton("Chintz");
        rb3.setUserData("Chintz");
        rb3.setToggleGroup(aSkin);
        
        VBox centerPanel = new VBox(MARGIN);
        centerPanel.setPadding(new Insets(MARGIN));
        centerPanel.setAlignment(Pos.CENTER);
        centerPanel.getChildren().addAll(aText, aButton);
        
        BorderPane root = new BorderPane();
        root.setCenter(centerPanel);
        
        HBox bottomPanel = new HBox(MARGIN);
        bottomPanel.setPadding(new Insets(MARGIN));
        bottomPanel.setAlignment(Pos.CENTER);
        bottomPanel.getChildren().addAll(rb1, rb2, rb3);
        root.setBottom(bottomPanel);
        
        aScene = new Scene(root, WIDTH, HEIGHT);
        pPrimaryStage.setResizable(false);
        pPrimaryStage.setScene(aScene);
        pPrimaryStage.show();
    }

	@Override
	public void handle(ActionEvent pActionEvent) 
	{
		aText.setText(aLabelProvider.getLabel(aText.getText().equals(aLabelProvider.getLabel(false))));
	}

	@Override
	public void changed(ObservableValue<? extends Toggle> pObservableValue, Toggle pOld, Toggle pNew)
	{
		if( aScene != null )
		{
			aScene.getStylesheets().clear();
			switch(aSkin.getSelectedToggle().getUserData().toString())
			{
			case "Floral":
				aScene.getStylesheets().add(Welcome.class.getResource("cs1.css").toExternalForm());
				break;
				
			case "Chintz":
				aScene.getStylesheets().add(Welcome.class.getResource("cs2.css").toExternalForm());
				break;

			default:
				break;
			}
			
		}
	}
}
