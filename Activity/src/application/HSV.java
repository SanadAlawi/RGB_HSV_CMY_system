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


public class HSV extends Application {
	
	// Button object
	Button rgbbutton = new Button("RGB");
	Button cmybutton = new Button("CMY");
	Button hsvbutton = new Button("HSV");
	
	
	// HSV1 Label objects
	Label huelabel = new Label("H");
	Label saturationlabel = new Label("S");
	Label valuelabel = new Label("V");
	
	// HSV1 Slider objects
	Slider hueslider = new Slider(0, 360, 0);
	Slider saturationslider = new Slider(0, 100, 0);
	Slider valueslider = new Slider(0, 100, 0);
	
	// HSV1 TextField objects
	TextField huetf = new TextField("0");
	TextField saturationtf = new TextField("0");
	TextField valuetf = new TextField("0");
	
	// HSV1 TextArea object
	TextField tf1 = new TextField();
	
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	// HSV2 Label objects
	Label hue2label = new Label("H");
	Label saturation2label = new Label("S");
	Label value2label = new Label("V");
		
	// HSV2 Slider objects
	Slider hue2slider = new Slider(0, 360, 0);
	Slider saturation2slider = new Slider(0, 100, 0);
	Slider value2slider = new Slider(0, 100, 0);
		
	// HSV2 TextField objects
	TextField hue2tf = new TextField("0");
	TextField saturation2tf = new TextField("0");
	TextField value2tf = new TextField("0");
		
	// HSV2 TextArea object
	TextField tf2 = new TextField();
	  
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	// Result HSV Label objects
	Label reshuelabel = new Label("H");
	Label ressaturationlabel = new Label("S");
	Label resvaluelabel = new Label("V");
	
	// Result HSV TextField objects
	TextField reshuetf = new TextField("0");
	TextField ressaturationtf = new TextField("0");
	TextField resvaluetf = new TextField("0");
	
	// CMY Label objects
	Label cyanlabel = new Label("C");
	Label magentalabel = new Label("M");
	Label yellowlabel = new Label("Y");
		
	// CMY TextField objects
	TextField cyantf = new TextField("0");
	TextField magentatf = new TextField("0");
	TextField yellowtf = new TextField("0");
	
	// RGB Label objects
	Label redlabel = new Label("R");
	Label greenlabel = new Label("G");
	Label bluelabel = new Label("B");
			
	// RGB TextField objects
	TextField redtf = new TextField("0");
	TextField greentf = new TextField("0");
	TextField bluetf = new TextField("0");
	
	// Result TextField Size
	TextField tf = new TextField();
	
	// Button object
	Button hsv1button = new Button("Apply");
	Button hsv2button = new Button("Apply");
	
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
		
		// Result Color
		cyanlabel.setTextFill(Color.CYAN);
		magentalabel.setTextFill(Color.MAGENTA);
		yellowlabel.setTextFill(Color.YELLOW);
		redlabel.setTextFill(Color.RED);
		greenlabel.setTextFill(Color.GREEN);
		bluelabel.setTextFill(Color.BLUE);
		
		// TextField Default
		tf1.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
		tf2.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
		tf.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));
		
		// HSV1 TextField size
		huetf.setPrefSize(35, 8);
		saturationtf.setPrefSize(35, 8);
		valuetf.setPrefSize(35, 8);
		
		// HSV2 TextField size
		hue2tf.setPrefSize(35, 8);
		saturation2tf.setPrefSize(35, 8);
		value2tf.setPrefSize(35, 8);
		
		// Result HSV TextField size
		reshuetf.setPrefSize(35, 8);
		ressaturationtf.setPrefSize(35, 8);
		resvaluetf.setPrefSize(35, 8);
		
		// CMY TextField size
		cyantf.setPrefSize(35, 8);
		magentatf.setPrefSize(35, 8);
		yellowtf.setPrefSize(35, 8);
		
		// RGB TextField size
		redtf.setPrefSize(50, 8);
		greentf.setPrefSize(50, 8);
		bluetf.setPrefSize(50, 8);
		
		// HSV1 TextField Size
		tf1.setPrefHeight(60);
		tf1.setMaxWidth(105);
		
		// HSV2 TextField Size
		tf2.setPrefHeight(60);
		tf2.setMaxWidth(105);
		
		// Result TextField Size
		tf.setPrefHeight(60);
		tf.setMaxWidth(105);
		
		// HSV1 Slider Block Increment
		hueslider.setBlockIncrement(1);
		saturationslider.setBlockIncrement(0.1);
		valueslider.setBlockIncrement(0.1);
		
		// HSV2 Slider Block Increment
		hue2slider.setBlockIncrement(1);
		saturation2slider.setBlockIncrement(0.1);
		value2slider.setBlockIncrement(0.1);
		
		/////////////////////////////////////////////////////////////////////////////////////////////

		// HSV1 Format
		HBox huehb = new HBox(10);
		huehb.getChildren().addAll(huelabel, hueslider, huetf);
		
		HBox saturationhb = new HBox(10);
		saturationhb.getChildren().addAll(saturationlabel, saturationslider,saturationtf);
		
		HBox valuehb = new HBox(10);
		valuehb.getChildren().addAll(valuelabel, valueslider, valuetf);
		
		HBox b1 = new HBox(10);
		b1.getChildren().addAll(tf1);
		
		VBox hsv1vb = new VBox(20);
		hsv1vb.getChildren().addAll(huehb, saturationhb, valuehb, b1);
		hsv1vb.setPadding(new Insets(25));
		  
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		// HSV2 Format
		HBox hue2hb = new HBox(10);
		hue2hb.getChildren().addAll(hue2label, hue2slider,hue2tf);
				
		HBox saturation2hb = new HBox(10);
		saturation2hb.getChildren().addAll(saturation2label, saturation2slider, saturation2tf);
				
		HBox value2hb = new HBox(10);
		value2hb.getChildren().addAll(value2label, value2slider, value2tf);
		
		HBox b2 = new HBox(10);
		b2.getChildren().addAll(tf2);
				
		VBox hsv2vb = new VBox(20);
		hsv2vb.getChildren().addAll(hue2hb, saturation2hb, value2hb, b2);
		hsv2vb.setPadding(new Insets(25));
		
		// Result Format
		VBox vb1 = new VBox(7);
		vb1.getChildren().addAll(reshuelabel, reshuetf, cyanlabel, cyantf, redlabel, redtf);
		
		VBox vb2 = new VBox(7);
		vb2.getChildren().addAll(ressaturationlabel,ressaturationtf, magentalabel, magentatf, greenlabel, greentf);
		
		VBox vb3 = new VBox(7);
		vb3.getChildren().addAll(resvaluelabel,resvaluetf, yellowlabel, yellowtf, bluelabel, bluetf);
		
		HBox hb = new HBox(10);
		hb.getChildren().addAll(vb1, vb2, vb3);
		
		VBox vb = new VBox(6);
		vb.getChildren().addAll(hb, tf);
		
		HBox finalhb = new HBox(4);
		finalhb.getChildren().addAll(hsv1vb, hsv2vb, vb);
		
		HBox buttonhb = new HBox(20);
		buttonhb.getChildren().addAll(rgbbutton, cmybutton, hsvbutton);
		buttonhb.setTranslateX(200);
		
		VBox vbbutton = new VBox(10);
		vbbutton.getChildren().addAll(finalhb, buttonhb);
		
		// Scene && Stage
		
		Scene scene = new Scene(vbbutton, 700, 400);
		
		stage.setTitle("Project #1");
		stage.setScene(scene);
		stage.show();
		
		// HSV1 Slaider Action
		hueslider.valueProperty().addListener( // Hue Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			huetf.setText(""+new_val.intValue());
			float hue = (float)Integer.parseInt(huetf.getText());
			float saturation = (float)Integer.parseInt(saturationtf.getText())/100;
			float value = (float)Integer.parseInt(valuetf.getText())/100;
			HSV1(hue, saturation, value);
			Compute();
		});
		
		saturationslider.valueProperty().addListener( // Saturation Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			saturationtf.setText(""+new_val.intValue());
			float hue = (float)Integer.parseInt(huetf.getText());
			float saturation = (float)Integer.parseInt(saturationtf.getText())/100;
			float value = (float)Integer.parseInt(valuetf.getText())/100;
			HSV1(hue, saturation, value);
			Compute();
		});
		
		valueslider.valueProperty().addListener( // Value Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			valuetf.setText(""+new_val.intValue());
			float hue = (float)Integer.parseInt(huetf.getText());
			float saturation = (float)Integer.parseInt(saturationtf.getText())/100;
			float value = (float)Integer.parseInt(valuetf.getText())/100;
			HSV1(hue, saturation, value);
			Compute();
		});
		
		// HSV2 Slaider Action
		hue2slider.valueProperty().addListener( // Heu Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			hue2tf.setText(""+new_val.intValue());
			float hue = (float)Integer.parseInt(hue2tf.getText());
			float saturation = (float)Integer.parseInt(saturation2tf.getText())/100;
			float value = (float)Integer.parseInt(value2tf.getText())/100;
			HSV2(hue, saturation, value);
			Compute();
		});
				
		saturation2slider.valueProperty().addListener( // Saturation Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			saturation2tf.setText(""+new_val.intValue());
			float hue = (float)Integer.parseInt(hue2tf.getText());
			float saturation = (float)Integer.parseInt(saturation2tf.getText())/100;
			float value = (float)Integer.parseInt(value2tf.getText())/100;
			HSV2(hue, saturation, value);
			Compute();
		});
				
		value2slider.valueProperty().addListener( // Value Slider
				(ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
			value2tf.setText(""+new_val.intValue());
			float hue = (float)Integer.parseInt(hue2tf.getText());
			float saturation = (float)Integer.parseInt(saturation2tf.getText())/100;
			float value = (float)Integer.parseInt(value2tf.getText())/100;
			HSV2(hue, saturation, value);
			Compute();
		});
	
		
//		hsv1button.setOnAction(e -> { // HSV1 button action
//			float hue = (float)Integer.parseInt(huetf.getText());
//			float saturation = (float)Integer.parseInt(saturationtf.getText());
//			float value = (float)Integer.parseInt(valuetf.getText());
//			Color color = Color.hsb(hue, saturation/100, value/100);
//			tf1.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
//			Compute();
//		});
//		
//		hsv2button.setOnAction(e -> { // HSV2 button action
//			float hue = (float)Integer.parseInt(hue2tf.getText());
//			float saturation = (float)Integer.parseInt(saturation2tf.getText());
//			float value = (float)Integer.parseInt(value2tf.getText());
//			Color color = Color.hsb(hue, saturation/100, value/100);
//			tf2.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
//			Compute();
//		});
		
		cmybutton.setOnAction(e -> {
			CMY c = new CMY();
			c.callCMY(stage);
		});
		
		rgbbutton.setOnAction(e -> {
			RGB r = new RGB();
			r.callRGB(stage);
		});
	}
	
	private void HSV1(float h, float s, float v) {
		Color color = Color.hsb(h, s, v);
		tf1.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	private void HSV2(float h, float s, float v) {
		Color color = Color.hsb(h, s, v);
		tf2.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public void Compute() {
		float hue1 = (float)Integer.parseInt(huetf.getText());
		float saturation1 = (float) Integer.parseInt(saturationtf.getText()) / 100;
		float value1 = (float) Integer.parseInt(valuetf.getText()) / 100;
		
		float hue2 = (float)Integer.parseInt(hue2tf.getText());
		float saturation2 = (float) Integer.parseInt(saturation2tf.getText()) / 100;
		float value2 = (float) Integer.parseInt(value2tf.getText()) / 100;
		
//		float hue = (hue1 + hue2) / 2;
//		float saturation = (saturation1 + saturation2) / 2;
//		float value = (value1 + value2) / 2;
		
		float [] RGB1 = Convert2RGB(hue1, saturation1, value1, 0, 0, 0);
		float [] RGB2 = Convert2RGB(hue2, saturation2, value2, 0, 0, 0);
		float [] result = new float[3];
		for(int  i = 0 ; i < RGB1.length ; i++)
			result[i] = (RGB1[i] + RGB2[i]) / 2;
		
		redtf.setText(result[0]+" ");
		greentf.setText(result[1]+" ");
		bluetf.setText(result[2]+" ");
		
		cyantf.setText(255 - result[0]+" ");
		magentatf.setText(255 - result[1]+" ");
		yellowtf.setText(255 - result[2]+" ");
		
		RGBToHSV(result[0], result[1], result[2], 0, 0, 0);
		tf.setBackground(new Background(new BackgroundFill(Color.rgb((int)result[0], (int)result[1], (int)result[2]), CornerRadii.EMPTY, Insets.EMPTY)));
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
		reshuetf.setText(h+"");
		ressaturationtf.setText(s+"");
		resvaluetf.setText((v / 2.55) / 100+"");
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
//	private float [] HSVToRGB(float h, float s, float v, float r, float g, float b) { // Convert from RGB to HSV
//		float high = v;
//		float low = high * (1 - s);
//		while(h < 0)
//			h += 360;
//		while(h > 360)
//			h -= 360;
//		int ih = (int)(h / 60);
//		float alpha = (h / 60) - ih;
//		if(ih % 2 == 0)
//			alpha = 1 - alpha;
//		float mid = low + alpha *(high - low);
//		switch(ih) {
//			case 0 : 
//				r = high; g = mid; b = low;
//				break;
//			case 1 : 
//				g = high; r = mid; b = low;
//				break;
//			case 2 : 
//				g = high; b = mid; r = low;
//				break;
//			case 3 : 
//				b = high; g = mid; r = low;
//				break;
//			case 4 : 
//				b = high; r = mid; g = low;
//				break;
//			case 5 : 
//				r = high; b = mid; g = low;
//				break;
//		}
//		return new float []{r, g, b};
//	}
	
	private float[] Convert2RGB(float h, float s, float v, float r, float g, float b) {
		float c = v*s;
		float x = c*(1 - Math.abs((h / 60) % 2 - 1));
		float m = v-c;
		if(0 <= h && h < 60) {r = (c+m)*255; g = (x+m)*255; b = m*255;}
		if(60 <= h && h < 120) {r = (x+m)*255; g = (c+m)*255; b = m*255;}
		if(120 <= h && h < 180) {r = m*255; g = (c+m)*255; b = (x+m)*255;}
		if(180 <= h && h < 240) {r = m*255; g = (x+m)*255; b = (c+m)*255;}
		if(240 <= h && h < 300) {r = (x+m)*255; g = m*255; b = (c+m)*255;}
		if(300 <= h && h < 360) {r = (c+m)*255; g = m*255; b = (x+m)*255;}
		
		return new float [] {r, g, b};
	}
	public void callHSV(Stage stage) {
		start(stage);
	}
	
}
