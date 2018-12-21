int x = 400;
int y=400;
int birdYVelocity = 30;
int gravity = 1;
int rectX = 780;
int upperPipeHeight = (int) random(100,400);
int lowerY = 800-(upperPipeHeight+80);
int score = 0;
void setup(){
 size(800,800); 
}

void draw(){
  background(112, 136, 252);
  fill(252, 23, 96);
  stroke(252, 23, 96);
  ellipse(x,y,20,20);
  fill(175, 23, 252);
  stroke(175, 23, 252);
  rect(rectX,800-upperPipeHeight,20,upperPipeHeight);
  fill(23, 252, 212);
  noStroke();
  rect(rectX, 0, 20, lowerY);
  fill(165, 96, 5);
  noStroke();
  rect(0,795,800,5);
  if(y==800){
    gravity=0;
    birdYVelocity=0;
    text("The game has ended", 400,400);
  }
  if(y>0){
    y=y+gravity;
    text(score, 200,200);
  }
  if(mousePressed){
   y=y-birdYVelocity; 
  }
  if(rectX>0){
    rectX=rectX-1;
  }
  else{
    rectX=780;
  }
}

boolean intersectsPipes(){
  if(y<upperPipeHeight && x > rectX && x<(rectX+20)){
    return true;
  }
  else if(y>lowerY && x>rectX && x<(rectX+20)){
    return true;
  }
  else{
    return false;
  }
}
