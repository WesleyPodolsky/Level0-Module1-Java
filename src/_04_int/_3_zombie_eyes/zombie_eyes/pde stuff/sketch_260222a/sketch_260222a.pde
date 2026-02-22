PImage face;
void setup(){
  size(500,500);
  face = loadImage("cat.png");
  
}

void draw(){
  image(face,0,0);
  noStroke();
  fill(mouseX/1.5,mouseY/1.5,(mouseX+mouseY)/2);
  ellipse(240,125,65,60);
  ellipse(320,125,65,60);
  fill(0,0,0);
  ellipse(240,125,20,60);
  ellipse(320,125,20,60);
}
