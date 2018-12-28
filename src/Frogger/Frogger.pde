int xpos = 200;
int ypos = 200;
Car c1 = new Car(0, 0, 50, 3);
Car c2 = new Car(50, 50, 20, 2);
Car c3 = new Car(100, 300, 30, 5);
void setup(){
  size(400, 400);
}
void draw(){
  background(0,0,255);
  fill(0,255,0);
  ellipse(xpos,ypos,50,50);
  c1.display();
  c1.moveLeft();
  if(intersects(c1)){
 println("hit");
  }
  c1.display();
  
  c2.display();
  c2.moveRight();
  if(intersects(c2)){
 println("hit");
  }
  c2.display();
  
  c3.display();
  c3.moveLeft();
  if(intersects(c3)){
 println("hit");
  }
  c3.display();
}
boolean intersects(Car car){
  if((ypos>car.getY()&&ypos<car.getY()+50&&(xpos>car.getX()&&xpos<car.getX()+car.getSize()))){
   return true;
  }
  else{
   return false; 
  }
}
void keyPressed(){
  if(key==CODED){ 
    if(keyCode==UP){
      ypos = ypos - 50;
    }
    else if(keyCode==DOWN){
      ypos = ypos+50;
    }
    else if(keyCode==RIGHT){
      xpos = xpos+50;
    }
    else if(keyCode==LEFT){
      xpos = xpos-50;
    }
     if (xpos>400 || xpos<0){
  xpos = 200; 
 }
 if(ypos>400 || ypos<0){
  ypos = 200; 
 }
  }
}
class Car{
  int xcar, ycar, sizecar, speedcar;
  Car(int x, int y, int size, int speed){
   xcar = x;
   ycar = y;
   sizecar = size;
   speedcar = speed;
  }
  void display(){
    fill(0,255,0);
    rect(xcar,ycar,sizecar,50);
  }
  void moveLeft(){
   xcar = xcar-speedcar;
   if(xcar>400||xcar<0){
    xcar = 400; 
   }
  }
  void moveRight(){
    xcar = xcar+speedcar;
    if(xcar>400||xcar<0){
     xcar=0; 
    }
}
int getX(){
  return xcar;
}
int getY(){
 return ycar; 
}
int getSize(){
  return sizecar; 
}
}