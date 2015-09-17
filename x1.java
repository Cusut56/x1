//////// What am I trying to do???
//////// Tara?  (CST 112; September, 13,2015?)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 100,150,200 );                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 40,40 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  
  triangle( 500,horizon, 600,horizon-100, 700,horizon -10  );  // tree
  stroke(0);
  fill(150);
  rect(590,40,20,110);

                                            // house

rect(500,100,20,10);


  fill(0);
  text( "My name is chuck ",10,height-20 );   
  
  
  
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
  //// SHOW:  display the creature at (x,y)

 
  fill(255,0,0); ellipse( x,y, 30,50 ); 
  stroke(180);
  line(x,y,30,50);

  text( "chuck", y,50 );

}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}
