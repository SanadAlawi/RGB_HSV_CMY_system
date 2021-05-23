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


public class RGB extends Application {
	
	// Button object
	Button rgbbutton = new Button("RGB");
	Button cmybutton = new Button("CMY");
	Button hsvbutton = new Button("HSV");
	
	// RGB1 Label objects
	Label redlabel = new Label("R");
	Label greenlabel = new Label("G");
	Label bluelabel = new Label("B");
	
	// RGB1 Slider objects
	Slider redslider = new Slider(0, 255, 0);
	Slider greenslider = new Slider(0, 255, 0);
	Slider blueslider = new Slider(0, 255, 0);
	
	// RGB1 TextField objects
	TextField redtf = new TextField("0");
	TextField greentf = new TextField("0");
	TextField bluetf = new TextField("0");
	
	// RGB1 TextArea object
	TextField tf1 = new TextField();
	
	// RGB2 Label objects
	Label red2label = new Label("R");
	Label green2label = new Label("G");
	Label blue2label = new Label("B");
		
	// RGB2 Slider objects
	Slider red2slider = new Slider(0, 255, 0);
	Slider green2slider = new Slider(0, 255, 0);
	Slider blue2slider = new Slider(0, 255, 0);
		
	// RGB2 TextField objects
	TextField red2tf = new TextField("0");
	TextField green2tf = new TextField("0");
	TextField blue2tf = new TextField("0");
		
	// RGB2 TextArea object
	TextField tf2 = new TextField();
	
	// Result RGB Label objects
	Label resredlabel = new Label("R");
	Label resgreenlabel = new Label("G");
	Label resbluelabel = new Label("B");
	
	// Result RGB TextField objects
	TextField resredtf = new TextField("0");
	TextField resgreentf = new TextField("0");
	TextField resbluetf = new TextField("0");
	
	// CMY Label objects
	Label cyanlabel = new Label("C");
	Label magentalabel = new Label("M");
	Label yellowlabel = new Label("Y");
		
	// CMY TextField objects
	TextField cyantf = new TextField("0");
	TextField magentatf = new TextField("0");
	TextField yellowtf = new TextField("0");
	
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
	Button rgb1button = new Button("Apply");
	Button rgb2button = new Button("Apply");
	
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
		
//		// RGB Color
//		redlabel.setTextFill(Color.RED);
//		red2label.setTextFill(Color.RED);
//		greenlabel.setTextFill(Color.GREEN);
//		green2label.setTextFill(Color.GREEN);
//		bluelabel.setTextFill(Color.BLUE);
//		blue2label.setTextFill(Color.BLUE);
		
		//Result Color
		resredlabel.setTextFill(Color.RED);
		resgreenlabel.setTextFill(Color.GREEN);
		resbluelabel.setTextFill(Color.BLUE);
		cyanlabel.setTextFill(Color.CYAN);
		magentalabel.setTextFill(Color.MAGENTA);
		yellowlabel.setTextFill(Color.YELLOW);
		
		// TextField Default
		tf1.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
		tf2.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
		tf.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
		
		// RGB1 TextField size
		redtf.setPrefSize(35, 8);
		greentf.setPrefSize(35, 8);
		bluetf.setPrefSize(35, 8);
		
		// RGB2 TextField size
		red2tf.setPrefSize(35, 8);
		green2tf.setPrefSize(35, 8);
		blue2tf.setPrefSize(35, 8);
		
		// Result RGB TextField size
		resredtf.setPrefSize(35, 8);
		resgreentf.setPrefSize(35, 8);
		resbluetf.setPrefSize(35, 8);
		
		// CMY TextField size
		cyantf.setPrefSize(35, 8);
		magentatf.setPrefSize(35, 8);
		yellowtf.setPrefSize(35, 8);
		
		// HSV TextField size
		huetf.setPrefSize(50, 8);
		saturationtf.setPrefSize(50, 8);
		valuetf.setPrefSize(50, 8);
		
		// RGB1 TextField Size
		tf1.setPrefHeight(60);
		tf1.setMaxWidth(105);
		
		// RGB2 TextField Size
		tf2.setPrefHeight(60);
		tf2.setMaxWidth(105);
		
		// Result TextField Size
		tf.setPrefHeight(60);
		tf.setMaxWidth(105);
		
		// RGB1 Slider Block Increment
		redslider.setBlockIncrement(1);
		greenslider.setBlockIncrement(1);
		blueslider.setBlockIncrement(1);
		
		// RGB2 Slider Block Increment
		red2slider.setBlockIncrement(1);
		green2slider.setBlockIncrement(1);
		blue2slider.setBlockIncrement(1);
		
		// RGB1 Format
		HBox redhb = new HBox(10);
		redhb.getChildren().addAll(redlabel, redslider, redtf);
		
		HBox greenhb = new HBox(10);
		greenhb.getChildren().addAll(greenlabel, greenslider, greentf);
		
		HBox bluehb = new HBox(10);
		bluehb.getChildren().addAll(bluelabel, blueslider, bluetf);
		
		HBox b1 = new HBox(10);
		b1.getChildren().addAll(tf1, rgb1button);
		
		VBox rgb1vb = new VBox(20);
		rgb1vb.getChildren().addAll(redhb, greenhb, bluehb, b1);
		rgb1vb.setPadding(new Insets(20));
		
		// RGB2 Format
		HBox red2hb = new HBox(10);
		red2hb.getChildren().addAll(red2label, red2slider, red2tf);
				
		HBox green2hb = new HBox(10);
		green2hb.getChildren().addAll(green2label, green2slider, green2tf);
				
		HBox blue2hb = new HBox(10);
		blue2hb.getChildren().addAll(blue2label, blue2slider, blue2tf);
		
		HBox b2 = new HBox(10);
		b2.getChildren().addAll(tf2, rgb2button);
				
		VBox rgb2vb = new VBox(20);
		rgb2vb.getChildren().addAll(red2hb, green2hb, blue2hb, b2);
		rgb2vb.setPadding(new Insets(20));
		
		// Result Format
		VBox vb1 = new VBox(7);
		vb1.getChildren().addAll(resredlabel, resredtf, cyanlabel, cyantf, huelabel, huetf);
		
		VBox vb2 = new VBox(7);
		vb2.getChildren().addAll(resgreenlabel,resgreentf, magentalabel, magentatf, saturationlabel, saturationtf);
		
		VBox vb3 = new VBox(7);
		vb3.getChildren().addAll(resbluelabel,resbluetf, yellowlabel, yellowtf, valuelabel, valuetf);
		
		HBox hb = new HBox(10);
		hb.getChildren().addAll(vb1, vb2, vb3);
		
		VBox vb = new VBox(6);
		vb.getChildren().addAll(hb, tf);
		
		HBox finalhb = new HBox(4);
		finalhb.getChildren().addAll(rgb1vb, rgb2vb, vb);
		
		HBox buttonhb = new HBox(20);
		buttonhb.getChildren().addAll(rgbbutton, cmybutton, hsvbutton);
		buttonhb.setTranslateX(200);
		
		VBox vbbutton = new VBox(20);
		vbbutton.getChildren().addAll(finalhb, buttonhb);
		
		// Scene && Stage
		Scene scene = new Scene(vbbutton, 700, 400);
		scene.setFill(Color.WHITE);
		
		stage.setTitle("Project #1");
		stage.setScene(scene);
		stage.show();
		
		// RGB1 Slaider Action
		redslider.valueProperty().addListener( // Red Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			redtf.setText(""+new_val.intValue());
			RGB();
			Compute();
		});
		
		greenslider.valueProperty().addListener( // Red Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			greentf.setText(""+new_val.intValue());
			RGB();
			Compute();
		});
		
		blueslider.valueProperty().addListener( // Red Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			bluetf.setText(""+new_val.intValue());
			RGB();
			Compute();
		});
		
		// RGB2 Slaider Action
		red2slider.valueProperty().addListener( // Red Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			red2tf.setText(""+new_val.intValue());
			RGB2();
			Compute();
		});
				
		green2slider.valueProperty().addListener( // Red Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			green2tf.setText(""+new_val.intValue());
			RGB2();
			Compute();
		});
				
		blue2slider.valueProperty().addListener( // Red Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			blue2tf.setText(""+new_val.intValue());
			RGB2();
			Compute();
		});
		
		rgb1button.setOnAction(e -> { // RGB1 Read TextField button
			redslider.setValue(Integer.parseInt(redtf.getText()));
			greenslider.setValue(Integer.parseInt(greentf.getText()));
			blueslider.setValue(Integer.parseInt(bluetf.getText()));
			RGB();
		});
		
		rgb2button.setOnAction(e -> {  // RGB2 Read TextField button
			red2slider.setValue(Integer.parseInt(red2tf.getText()));
			green2slider.setValue(Integer.parseInt(green2tf.getText()));
			blue2slider.setValue(Integer.parseInt(blue2tf.getText()));
			RGB2();
		});
		
		cmybutton.setOnAction(e -> {
			CMY c = new CMY();
			c.callCMY(stage);
		});
		
		hsvbutton.setOnAction(e -> {
			HSV h = new HSV();
			h.callHSV(stage);
		});
	}
	
	public void RGB() { // RGB1 method
		int red = Integer.parseInt(redtf.getText());
		int green = Integer.parseInt(greentf.getText());
		int blue = Integer.parseInt(bluetf.getText());
		Color color = Color.rgb(red, green, blue);
		redlabel.setTextFill(Color.rgb(red, 0, 0));
		greenlabel.setTextFill(Color.rgb(0, green, 0));
		bluelabel.setTextFill(Color.rgb(0, 0, blue));
		tf1.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public void RGB2() { // RGB2 method
		int red = Integer.parseInt(red2tf.getText());
		int green = Integer.parseInt(green2tf.getText());
		int blue = Integer.parseInt(blue2tf.getText());
		Color color = Color.rgb(red, green, blue);
		red2label.setTextFill(Color.rgb(red, 0, 0));
		green2label.setTextFill(Color.rgb(0, green, 0));
		blue2label.setTextFill(Color.rgb(0, 0, blue));
		tf2.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public void Compute() { // Compute two Color, and display them
		int red1 = Integer.parseInt(redtf.getText());
		int green1 = Integer.parseInt(greentf.getText());
		int blue1 = Integer.parseInt(bluetf.getText());
		int red2 = Integer.parseInt(red2tf.getText());
		int green2 = Integer.parseInt(green2tf.getText());
		int blue2 = Integer.parseInt(blue2tf.getText());
		
		float red = (red1 + red2) / 2;
		float green =  (green1 + green2) / 2;
		float blue =  (blue1 + blue2) / 2;
		
		resredtf.setText((int)red+"");
		resgreentf.setText((int)green+"");
		resbluetf.setText((int)blue+"");
		
		cyantf.setText((int)(255 - red)+"");
		magentatf.setText((int)(255 - green)+"");
		yellowtf.setText((int)(255 - blue)+"");

		RGBToHSV(red, green, blue, 0, 0, 0);

		tf.setBackground(new Background(new BackgroundFill(Color.rgb((int)red, (int)green, (int)blue), CornerRadii.EMPTY, Insets.EMPTY)));
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
	
	public void callRGB(Stage stage) {
		start(stage);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
