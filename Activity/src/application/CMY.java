package application;
	
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class CMY extends Application {
	
	// Button object
	Button rgbbutton = new Button("RGB");
	Button cmybutton = new Button("CMY");
	Button hsvbutton = new Button("HSV");
	
	
	// CMY1 Label objects
	Label cyanlabel = new Label("C");
	Label magentalabel = new Label("M");
	Label yellowlabel = new Label("Y");
	
	// CMY1 Slider objects
	Slider cyanslider = new Slider(0, 255, 0);
	Slider magentaslider = new Slider(0, 255, 0);
	Slider yellowslider = new Slider(0, 255, 0);
	
	// CMY1 TextField objects
	TextField cyantf = new TextField("0");
	TextField magentatf = new TextField("0");
	TextField yellowtf = new TextField("0");
	
	// CMY1 TextArea object
	TextField tf1 = new TextField();
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	// CMY2 Label objects
	Label cyan2label = new Label("C");
	Label magenta2label = new Label("M");
	Label yellow2label = new Label("Y");
		
	// CMY2 Slider objects
	Slider cyan2slider = new Slider(0, 255, 0);
	Slider magenta2slider = new Slider(0, 255, 0);
	Slider yellow2slider = new Slider(0, 255, 0);
		
	// CMY2 TextField objects
	TextField cyan2tf = new TextField("0");
	TextField magenta2tf = new TextField("0");
	TextField yellow2tf = new TextField("0");
		
	// CMY2 TextArea object
	TextField tf2 = new TextField();
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	// Result CMY Label objects
	Label rescyanlabel = new Label("C");
	Label resmagentalabel = new Label("M");
	Label resyellowlabel = new Label("Y");
	
	// Result CMY TextField objects
	TextField rescyantf = new TextField("0");
	TextField resmagentatf = new TextField("0");
	TextField resyellowtf = new TextField("0");
	
	// RGB Label objects
	Label redlabel = new Label("R");
	Label greenlabel = new Label("G");
	Label bluelabel = new Label("B");
		
	// RGB TextField objects
	TextField redtf = new TextField("0");
	TextField greentf = new TextField("0");
	TextField bluetf = new TextField("0");
	
	// HSV Label objects
	Label huelabel = new Label("H");
	Label saturationlabel = new Label("S");
	Label valuelabel = new Label("V");
			
	// HSV TextField objects
	TextField huetf = new TextField("0");
	TextField saturationtf = new TextField("0");
	TextField valuetf = new TextField("0");
	
	// Result TextField Size
	TextField tf = new TextField();
	
	// Button object
	Button cmy1button = new Button("Apply");
	Button cmy2button = new Button("Apply");
	
	@Override
	public void start(Stage stage) {
		
		// Button Color
		rgbbutton.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(5), new BorderWidths(2))));
		cmybutton.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(5), new BorderWidths(2))));
		hsvbutton.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(5), new BorderWidths(2))));
		rgbbutton.setBackground(new Background(new BackgroundFill(Color.valueOf("#b2bec3"), new CornerRadii(5), Insets.EMPTY)));
		cmybutton.setBackground(new Background(new BackgroundFill(Color.valueOf("#b2bec3"), new CornerRadii(5), Insets.EMPTY)));
		hsvbutton.setBackground(new Background(new BackgroundFill(Color.valueOf("#b2bec3"), new CornerRadii(5), Insets.EMPTY)));
		rgbbutton.setPadding(new Insets(5,20,5,20));
		cmybutton.setPadding(new Insets(5,20,5,20));
		hsvbutton.setPadding(new Insets(5,20,5,20));
		
		// CMY Color
		cyanlabel.setTextFill(Color.CYAN);
		magentalabel.setTextFill(Color.MAGENTA);
		yellowlabel.setTextFill(Color.YELLOW);
		cyan2label.setTextFill(Color.CYAN);
		magenta2label.setTextFill(Color.MAGENTA);
		yellow2label.setTextFill(Color.YELLOW);
		
		// Result Color
		rescyanlabel.setTextFill(Color.CYAN);
		resmagentalabel.setTextFill(Color.MAGENTA);
		resyellowlabel.setTextFill(Color.YELLOW);
		redlabel.setTextFill(Color.RED);
		greenlabel.setTextFill(Color.GREEN);
		bluelabel.setTextFill(Color.BLUE);		
		
		// TextField Default
		tf1.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tf2.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tf.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		
		// CMY1 TextField size
		cyantf.setPrefSize(35, 8);
		magentatf.setPrefSize(35, 8);
		yellowtf.setPrefSize(35, 8);
		
		// CMY2 TextField size
		cyan2tf.setPrefSize(35, 8);
		magenta2tf.setPrefSize(35, 8);
		yellow2tf.setPrefSize(35, 8);
		
		// Result CMY TextField size
		rescyantf.setPrefSize(35, 8);
		resmagentatf.setPrefSize(35, 8);
		resyellowtf.setPrefSize(35, 8);
		
		// RGB TextField size
		redtf.setPrefSize(35, 8);
		greentf.setPrefSize(35, 8);
		bluetf.setPrefSize(35, 8);
		
		// HSV TextField size
		huetf.setPrefSize(50, 8);
		saturationtf.setPrefSize(50, 8);
		valuetf.setPrefSize(50, 8);
		
		// CMY1 TextField Size
		tf1.setPrefHeight(60);
		tf1.setMaxWidth(105);
		
		// CMY2 TextField Size
		tf2.setPrefHeight(60);
		tf2.setMaxWidth(105);
		
		// Result TextField Size
		tf.setPrefHeight(60);
		tf.setMaxWidth(105);
		
		// CMY1 Slider Block Increment
		cyanslider.setBlockIncrement(1);
		magentaslider.setBlockIncrement(1);
		yellowslider.setBlockIncrement(1);
		
		// CMY2 Slider Block Increment
		cyan2slider.setBlockIncrement(1);
		magenta2slider.setBlockIncrement(1);
		yellow2slider.setBlockIncrement(1);
		
		// CMY1 Format
		HBox cyanhb = new HBox(10);
		cyanhb.getChildren().addAll(cyanlabel, cyanslider, cyantf);
		
		HBox magentahb = new HBox(10);
		magentahb.getChildren().addAll(magentalabel, magentaslider, magentatf);
		
		HBox yellowhb = new HBox(10);
		yellowhb.getChildren().addAll(yellowlabel, yellowslider, yellowtf);
		
		HBox b1 = new HBox(10);
		b1.getChildren().addAll(tf1, cmy1button);
		
		VBox cmy1vb = new VBox(20);
		cmy1vb.getChildren().addAll(cyanhb, magentahb, yellowhb, b1);
		cmy1vb.setPadding(new Insets(20));
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		// Cmy2 Format
		HBox cyan2hb = new HBox(10);
		cyan2hb.getChildren().addAll(cyan2label, cyan2slider, cyan2tf);
				
		HBox magenta2hb = new HBox(10);
		magenta2hb.getChildren().addAll(magenta2label, magenta2slider, magenta2tf);
				
		HBox yellow2hb = new HBox(10);
		yellow2hb.getChildren().addAll(yellow2label, yellow2slider, yellow2tf);
		
		HBox b2 = new HBox(10);
		b2.getChildren().addAll(tf2, cmy2button);
				
		VBox cmy2vb = new VBox(20);
		cmy2vb.getChildren().addAll(cyan2hb, magenta2hb, yellow2hb, b2);
		cmy2vb.setPadding(new Insets(20));
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		// Result Format
		VBox vb1 = new VBox(7);
		vb1.getChildren().addAll(rescyanlabel, rescyantf, redlabel, redtf, huelabel, huetf);
		
		VBox vb2 = new VBox(7);
		vb2.getChildren().addAll(resmagentalabel,resmagentatf, greenlabel, greentf, saturationlabel, saturationtf);
		
		VBox vb3 = new VBox(7);
		vb3.getChildren().addAll(resyellowlabel,resyellowtf, bluelabel, bluetf, valuelabel, valuetf);
		
		HBox hb = new HBox(10);
		hb.getChildren().addAll(vb1, vb2, vb3);
		
		VBox vb = new VBox(6);
		vb.getChildren().addAll(hb, tf);
		
		HBox finalhb = new HBox(4);
		finalhb.getChildren().addAll(cmy1vb, cmy2vb, vb);
		
		HBox buttonhb = new HBox(20);
		buttonhb.getChildren().addAll(rgbbutton, cmybutton, hsvbutton);
		buttonhb.setTranslateX(200);
		
		VBox vbbutton = new VBox(20);
		vbbutton.getChildren().addAll(finalhb, buttonhb);
		
		// Scene && Stage
		Scene cmyscene = new Scene(vbbutton, 700, 400);
		
		stage.setTitle("Project #1");
		stage.setScene(cmyscene);
		stage.show();
		
		// CMY1 Slider Action
		cyanslider.valueProperty().addListener( // Cyan Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			cyantf.setText(""+new_val.intValue());
			CMY();
			Compute();
		});
		
		magentaslider.valueProperty().addListener( // Magenta Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			magentatf.setText(""+new_val.intValue());
			CMY();
			Compute();
		});
		
		yellowslider.valueProperty().addListener( // Yellow Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			yellowtf.setText(""+new_val.intValue());
			CMY();
			Compute();
		});
		
		// CMY2 Slaider Action
		cyan2slider.valueProperty().addListener( // Cyan Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			cyan2tf.setText(""+new_val.intValue());
			CMY2();
			Compute();
		});
				
		magenta2slider.valueProperty().addListener( // Magenta Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			magenta2tf.setText(""+new_val.intValue());
			CMY2();
			Compute();
		});
				
		yellow2slider.valueProperty().addListener( // Yellow Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			yellow2tf.setText(""+new_val.intValue());
			CMY2();
			Compute();
		});
		
		cmy1button.setOnAction(e -> { // CMY1 Read TextField button
			cyanslider.setValue(Integer.parseInt(cyantf.getText()));
			magentaslider.setValue(Integer.parseInt(magentatf.getText()));
			yellowslider.setValue(Integer.parseInt(yellowtf.getText()));
			CMY();
		});
		
		cmy2button.setOnAction(e -> {  // CMY2 Read TextField button
			cyan2slider.setValue(Integer.parseInt(cyan2tf.getText()));
			magenta2slider.setValue(Integer.parseInt(magenta2tf.getText()));
			yellow2slider.setValue(Integer.parseInt(yellow2tf.getText()));
			CMY2();
		});
		
		
		rgbbutton.setOnAction(e -> {
			RGB r = new RGB();
			r.callRGB(stage);
		});
		
		hsvbutton.setOnAction(e -> {
			HSV h = new HSV();
			h.callHSV(stage);
		});
	}
	
	public void CMY() { // CMY1 method
		int cyan = 255 - Integer.parseInt(cyantf.getText());
		int magenta = 255 - Integer.parseInt(magentatf.getText());
		int yellow = 255 - Integer.parseInt(yellowtf.getText());
		Color color = Color.rgb(cyan, magenta, yellow);
		tf1.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public void CMY2() { // CMY1 method
		int cyan = 255 - Integer.parseInt(cyan2tf.getText());
		int magenta = 255 - Integer.parseInt(magenta2tf.getText());
		int blue = 255 - Integer.parseInt(yellow2tf.getText());
		Color color = Color.rgb(cyan, magenta, blue);
		tf2.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public void Compute() { // Compute two Color, and display them
		int cyan1 = Integer.parseInt(cyantf.getText());
		int magenta1 = Integer.parseInt(magentatf.getText());
		int yellow1 = Integer.parseInt(yellowtf.getText());
		int cyan2 = Integer.parseInt(cyan2tf.getText());
		int magenta2 = Integer.parseInt(magenta2tf.getText());
		int yellow2 = Integer.parseInt(yellow2tf.getText());
		
		float cyan = (cyan1 + cyan2) / 2;
		float magenta =  (magenta1 + magenta2) / 2;
		float yellow =  (yellow1 + yellow2) / 2;
		
		redtf.setText((int) 255 - cyan+"");
		greentf.setText((int) 255 - magenta+"");
		bluetf.setText((int) 255 - yellow+"");
		
		rescyantf.setText((int)(cyan)+"");
		resmagentatf.setText((int)(magenta)+"");
		resyellowtf.setText((int)(yellow)+"");
		
		RGBToHSV(255 - cyan, 255 - magenta, 255 - yellow, 0, 0, 0);
		
		tf.setBackground(new Background(new BackgroundFill(Color.rgb((int)(255 - cyan), (int)(255 - magenta), (int)(255 - yellow)), CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	private void RGBToHSV(float r, float g, float b, float h, float s, float v) { // Convert from RGB to HSV
		float high = Math.max(r, Math.max(g, b));
		float low = Math.min(r, Math.min(g, b));
		float mid = Mid(r, g, b);
		
		v = high; // value is equal brightness
		if(v == 0) { // value == 0 , the v is black , then heu and saturation 0
			h = 0;
			s = 0;
		}
		else {
			s = (high-low) / high;
			if(s == 0)  // if saturation is equal 0 , then it's in the center so the angle equal 0 -> h = 0
				h = 0;
			else {
				
				float alph = 60 * ( (mid - low) / (high - low) );
				
				if(r == high && b == low)
					h = alph;
				else if(g == high && b == low)
					h = 120 - alph;
				else if(g == high && r == low)
					h = 120 + alph;
				else if(b == high && r == low)
					h = 240 - alph;
				else if(b == high && g == low)
					h = 240 + alph;
				else
					h = 360 - alph;
			}
		}
		huetf.setText(h+"");
		saturationtf.setText(s+"");
		valuetf.setText((v / 2.55) / 100+"");
	}
	
	private float Mid(float a, float b, float c) { // find the middle
		float mid = 0;
		float max = Math.max(a, Math.max(b, c));
		float min = Math.min(a, Math.min(b, c));
		if(a == max && b == min )
			mid = c;
		else if(a == max && c == min)
			mid = b;
		else if(b == max && a == min)
			mid = c;
		else if(b == max && c == min)
			mid = a;
		else if(c == max && a == min)
			mid = b;
		else
			mid = a;
		return mid;
	}
	
	public void callCMY(Stage stage) {
		start(stage);
	}
//	public static void main(String[] args) {
//		launch(args);
//	}
}
