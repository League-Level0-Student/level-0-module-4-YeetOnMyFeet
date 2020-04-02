import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;
boolean waldofound = false;

void setup() {
  PImage waldo = loadImage("whereswaldo.jpeg"); // Change this to match your file name.
  size(800, 800);
  waldo.resize(800,800);
  image(waldo, 0, 0);
  doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch } 
}

void draw() {
  waldofound = false;
      // Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 

      // If the mouse is on Waldo, print “Waldo found!”
if(mouseX >= 630 && mouseX <= 651){
  if(mouseY >= 60 && mouseY <= 95){
waldofound= true;
  }
}


      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}
void mousePressed(){
  if(waldofound == true){
    playWoohoo();
  }
  else{
    playDoh();
  }
}
void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}
