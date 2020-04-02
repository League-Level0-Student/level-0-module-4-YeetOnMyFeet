int pupilX = mouseX;
int pupilY = mouseY;
PImage face;
void setup(){
  size(765,515);
    face = loadImage("spongebob.jpg");
    face.resize(765,515);

  
  
  
}

void draw(){
  System.out.println(mouseY);
  background(face);
  fill(#FFFFFF);
  ellipse(279,130,25,25);
    fill(#0A0A0A);
  ellipse(pupilX,pupilY,10,10);
  if(mouseX > 290 ){
    pupilX = 290;
}
else if(mouseX <= 266) {
  pupilX = 266;
}
else{
  pupilX = mouseX;
}
if(mouseY > 140){
  pupilY = 140;
}
else if(mouseY <= 118){
  pupilY = 118;
}
else{
  pupilY = mouseY;
}

fill(#FFFFFF);
ellipse(320,130,25,25);
fill(#0A0A0A);
ellipse(pupilX + 43,pupilY,10,10);

}
