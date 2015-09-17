//////// What am I trying to do???
//////// Tara?  (CST 112; September, 13,2015?)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

int count=0;

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
  count=  count + 1;
  //// SCENE:  sky, sun, tree, house, etc.
  background( 100,150,200 );                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 40,40 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  
  triangle( 500,horizon, 600,horizon-100, 700,horizon -10  );  // tree
  stroke(0);
  fill(85);
  rect(590,40,20,110);

                                            // house

  fill(0);
  text( "My name is chuck ",10,height-20 );   
  
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  if (x>width) dx=  -dx;
  y=  y + dy;
  
  
  //// SHOW:  display the creature at (x,y)

  ellipse(x,440,y,50);
  fill(255,0,0); 
  rect( x,y, 50,80 );
  fill( 255,200,200 );
  ellipse( x+25, y-15, 30,30 );
  fill( 255 );
  ellipse( x+15, y-25, 12,12 );
  ellipse( x+35, y-25, 12,12 );
  fill( 0,0,255 );
  if (count/60 % 2 == 0) {
    ellipse( x+20, y-25, 4,4 );
    ellipse( x+40, y-25, 4,4 );
  } else {
    ellipse( x+10, y-25, 4,4 );
    ellipse( x+30, y-25, 4,4 );
  }
  
  fill( 0,0,255 );
  text( "Chuck", x+5, y+20 ); 
 
  
  stroke(80);


  text( "chuck", x,50 );

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
