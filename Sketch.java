import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
	PImage imgSpaceBackground;
  PImage imgUFO;
  
  float fltUFOX = 150;
  float fltUFOY = 150;
  float fltUFOSpeedX = 3;
  float fltUFOSpeedY = 3;
  float fltUFOAngle = 0.05f;

  float fltCircleX = 400;
  float fltCircleY = 400;
  float fltCircleSpeed = 2;

  public void settings() {
	// put your size call here
    size(800, 800);
  }

  public void setup() {
    imgSpaceBackground = loadImage("images/spaceBackground.jpeg");
    imgSpaceBackground.resize(width, height);

    imgUFO = loadImage("images/spaceUFO.png");
    imgUFO.resize(width / 5, height / 5);
  }

  public void draw() {

	// Space Background Image
    background(imgSpaceBackground);

  // UFO Image Moving
    image(imgUFO, fltUFOX, fltUFOY);

    fltUFOX = cos(fltUFOAngle) * 50 + 189;
    fltUFOY = sin(fltUFOAngle) * 50 + 111;

    fltUFOAngle -= 0.05f;
    fltUFOX += fltUFOSpeedX;
    fltUFOY += fltUFOSpeedY;

  // Circle Moving
    ellipse(fltCircleX, fltCircleY, 80, 80);
    fltCircleX = fltCircleX + fltCircleSpeed;

    if(fltCircleX <= 0){
      fltCircleSpeed = 2;
    }

    else if(fltCircleX >= width - 30){
      fltCircleSpeed = -2;
    }

  }
  
}