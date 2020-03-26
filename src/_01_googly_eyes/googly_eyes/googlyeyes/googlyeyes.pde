pupilX = mouseX;
pupilY = mouseY;
void setup(){
  size(765,515);
   PImage face = loadImage("spongebob.jpg");
    background(face);
    face.resize(765,515);

  
  
  
}

void draw(){
  fill(#FFFFFF);
  ellipse(279,130,25,25);
    fill(#0A0A0A);
  ellipse(279,130,10,10);
  if(mouseX > 279){
    pupilX = 279;
}
}
