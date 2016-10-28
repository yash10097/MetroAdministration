package edu.iiitd.ap2011.yash10097.metro;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author yash
 */
public class Metro_10097 {
    static Image MetroImage;
    int x,y;
    int line;
    boolean rev;
    int delay;
    int chk=0,ochk=0;
    int destinationX,destinationY;
    int stop;
    static ImageIcon ii;
    
    public Metro_10097(int line,int delay,int initialX,int initialY,int destinationX,int destinationY,boolean rev,int stop){
        ii = new ImageIcon("train1_10097.gif");
        MetroImage = ii.getImage();
        x=initialX;
        y=initialY;
        this.delay=delay;
        this.line=line;
        this.destinationX=destinationX;
        this.destinationY=destinationY;
        this.rev=rev;
        this.stop=stop;
    }


   
    boolean validredDestinatonX(){
        if(this.x==this.destinationX ){  
        	if(this.destinationX==440 && rev==false)
        	    this.destinationX=850;
        	  else if(this.destinationX==850){
        		  this.destinationX=432;
        		  rev=true;
        	  }
        	  else if(this.destinationX==432 && rev==true)
        		  this.destinationX=310;
        	  else{
        		  this.destinationX=440;
        		  rev=false;
        	  }
        	    return true;
            }
        else
            return false;
    }

   boolean validredDestinatonY(){
        if(this.y==this.destinationY){
        	if(this.destinationY==124 && rev==true && this.destinationX==310)
        	     this.destinationY=5;
        	else
        		destinationY=124;

        	return true;
        }    
        else
            return false;
    }
   
   
   boolean validoDestinatonX(){
       if(this.x==this.destinationX ){  
       	if(this.destinationX==236 && this.y==488){
       	    this.destinationX=558;
       	    ochk=0;
       	}
       	else if(this.destinationX==558 && this.y==184)
       	    this.destinationX=236;
       	    return true;
           }
       else
           return false;
   }

  boolean validoDestinatonY(){
       if(this.y==this.destinationY){
       	if(this.destinationY==488 && this.x==236)
       	     this.destinationY=184;
       	else if(this.destinationY==184 && this.x==558)
       		this.destinationY=488;
       	return true;
       }    
       else
           return false;
   }
   
   
   boolean validyDestinatonX(){
       if(this.x==this.destinationX ){  
       	if(this.destinationX==556 && rev==false && this.destinationY==626)
       	    this.destinationX=338;
        else if(this.destinationX==338 && rev==false && this.y==626)
       		  rev=true;
        else if(this.destinationX==338 && rev==true && this.y==626)
         	  this.destinationX=465;
       	else if(this.destinationX==465 && rev==true && this.y==626)
       		  this.destinationX=556;
       	else if(this.destinationX==556 && rev==true && this.y==60)
     		  this.destinationX=470;
     	else if(this.destinationX==470 && rev==true && this.y==-30){
        		  this.destinationX=556;
        		  rev=false;
     	}		  
       	return true;
        }                                    
        return false;
   }

  boolean validyDestinatonY(){
       if(this.y==this.destinationY){
       	if(this.destinationY==70 && rev==false)
       	     this.destinationY=530;
       	else if(this.destinationY==530 && rev==false)
      	     this.destinationY=626;
       	else if(this.destinationY==626 && rev==false && this.x==338)
      	     this.destinationY=639;
       	else if(this.destinationY==639 && rev==true )
     	     this.destinationY=626;
       	else if(this.destinationY==626 && rev==true && this.x==465)
    	     this.destinationY=536;
       	else if(this.destinationY==536 && rev==true && this.x==556)
    	     this.destinationY=60;
       	else if(this.destinationY==60&& rev==true && this.x==556 )
    	     this.destinationY=-30;
       	else if(this.destinationY==-30 && rev==false )
    	     this.destinationY=70;
       	return true;
       }    
       else
           return false;
   }
  
  private boolean validvDestinatonX() {
		if(this.x==this.destinationX){
      	if(this.destinationX==580 && rev==false && this.destinationY==340)
      	     this.destinationX=972;
      	else if(this.destinationX==972){
      	   this.destinationX=580;
      	   rev=true;
       	}
      	else if(this.destinationX==580 && rev==true && this.destinationY==276 )
      		this.destinationX=554;
      	else if(this.destinationX==554 && rev==true && this.destinationY==330){
      		rev=false;
      		this.destinationX=580;
      	}
      	return true;
      }    
      else
          return false;
	}



	private boolean validvDestinatonY() {
		if(this.y==this.destinationY ){
    	  if(this.destinationY==330 && rev==false)
    	    this.destinationY=340;
    	  else if(this.destinationY==340 && rev==false){
    		  this.destinationY=592;
    	  }
    	  else if(this.destinationY==592 && rev==true){
    		this.destinationY=340;
    	 }
    	  else if(this.destinationY==340 && rev==true)
    		  this.destinationY=310;
    	else if(this.destinationY==310 && rev==true && this.destinationX==580)
  		  this.destinationY=276;
    	else if(this.destinationY==276 && this.destinationX==554){
    		this.destinationY=330;
    	}
    	    return true;
        }
    else
        return false;
	}

    
	boolean validgDestinatonX(){
        if(this.x==this.destinationX ){  
        	if(this.destinationX==400 && rev==false)
        	    this.destinationX=22;
        	else if(this.destinationX==22 && rev==false)
        		  this.destinationX=420;
        	  else if(this.destinationX==420 && rev==false){
        		  this.destinationX=22;
        		  rev=true;
        	  }
        	  else if(this.destinationX==22 && rev==true){
        		  this.destinationX=400;
        		  chk=1;
        	  }
        	  else if(this.destinationX==400 && rev==true )
        		  this.destinationX=370;
        	  else if(this.destinationX==370 && rev==true && this.destinationY==126){
        		  this.destinationX=400;
        		  rev=false;
        	  }
        	    return true;
            }
        else
            return false;
    }

	
   boolean validgDestinatonY(){
        if(this.y==this.destinationY){
        	if(this.destinationY==126 && rev==true && chk==1 && this.x==400){
        		this.destinationY=160;
        		chk=0;
        	}
        	else if(destinationY==160 && this.x==370)
        	   	 this.destinationY=126;
       	   	return true;
        }    
        else
            return false;
    }

	
   boolean validbDestinatonX(){
       if(this.x==this.destinationX ){  
       	if(this.destinationX==76 && rev==false)
       	    this.destinationX=168;
       	else if(this.destinationX==168 && rev==false )
       		  this.destinationX=340;
       	else if(this.destinationX==340 && rev==false )
       		  this.destinationX=380;
       	else if(this.destinationX==380 && rev==false )
     		  this.destinationX=520;
       	else if(this.destinationX==520 && rev==false )
   		  this.destinationX=600;
       	else if(this.destinationX==600 && rev==false )
   		  this.destinationX=760;
       	else if(this.destinationX==760 && rev==false )
     		  this.destinationX=974;
       	else if(this.destinationX==974 && rev==false)
       		  this.destinationX=1010;
       	else if(this.destinationX==1010 && rev==false){
     		  this.destinationX=960;
     		  rev=true;
       	}	  
       	else if(this.destinationX==960 && rev==true )
   		  this.destinationX=740;
       	else if(this.destinationX==740 && rev==true )
     		  this.destinationX=580;
       else if(this.destinationX==580 && rev==true )
     		  this.destinationX=520;
       	else if(this.destinationX==520 && rev==true )
     	  	  this.destinationX=380;
       	else if(this.destinationX==380 && rev==true )
   	  	  this.destinationX=340;
       	else if(this.destinationX==340 && rev==true )
     	  this.destinationX=168;
       else if(this.destinationX==168 && rev==true )
       	  this.destinationX=100;
       else if(this.destinationX==100 && rev==true )
        	  this.destinationX=70;
       	else if(this.destinationX==70 && rev==true )
         	this.destinationX=215;
       	else if(this.destinationX==215 && rev==true ){
         	this.destinationX=76; 	
         	rev=false;
       	}
     	    return true;
           }
       else
           return false;
   }

	
  boolean validbDestinatonY(){
       if(this.y==this.destinationY){
       	if(this.destinationY==354 && rev==false)
       		this.destinationY=324;
       	else if(this.destinationY==324 && rev==false && this.x==168)
       		this.destinationY=156;
       	else if(this.destinationY==156 && rev==false && this.x==340)
       		this.destinationY=202;
       	else if(this.destinationY==202 && rev==false && this.x==520)
       		this.destinationY=274;
       	else if(this.destinationY==274 && rev==false && this.x==760)
       		this.destinationY=402;
       	else if(this.destinationY==402 && rev==true && this.x==960)
       		this.destinationY=274;
       	else if(this.destinationY==274 && rev==true && this.x==580)
       		this.destinationY=202;
       	else if(this.destinationY==202 && rev==true && this.x==380)
       		this.destinationY=156;
       	else if(this.destinationY==156 && rev==true && this.destinationX==168)
       		this.destinationY=324;
       	else if(destinationY==324 && rev==true && this.x==100)
       	   	 this.destinationY=354;
       else if(destinationY==354 && rev==true && this.destinationX==215)
       		this.destinationY=490;
       else if(destinationY==490 && rev==false )
      		this.destinationY=354;
      	 return true;
       }    
       else
           return false;
   }
   
   
  
  boolean validb1DestinatonX(){
      if(this.x==this.destinationX ){  
      	if(this.destinationX==168 && rev==false )
      		  this.destinationX=340;
      	else if(this.destinationX==340 && rev==false )
      		  this.destinationX=380;
      	else if(this.destinationX==380 && rev==false )
    		  this.destinationX=520;
      	else if(this.destinationX==520 && rev==false )
  		  this.destinationX=600;
      	else if(this.destinationX==600 && rev==false )
  		  this.destinationX=740;
      	else if(this.destinationX==740 && rev==false && this.y==254)
    		  this.destinationX=840;
      	else if(this.destinationX==840 && rev==false)
      		  this.destinationX=970;
      	else if(this.destinationX==970 && rev==false){
    		  this.destinationX=810;
    		  rev=true;
      	}	  
      	else if(this.destinationX==810 && rev==true )
  		  this.destinationX=740;
      	else if(this.destinationX==740 && rev==true )
    		  this.destinationX=600;
      else if(this.destinationX==600 && rev==true )
    		  this.destinationX=520;
      	else if(this.destinationX==520 && rev==true )
    	  	  this.destinationX=380;
      	else if(this.destinationX==380 && rev==true )
  	  	  this.destinationX=340;
      	else if(this.destinationX==340 && rev==true )
    	  this.destinationX=168;
      else if(this.destinationX==168 && rev==true )
      	  this.destinationX=76;
      else if(this.destinationX==76 && rev==true ){
    	  this.destinationX=168;       
       	  rev=false;
      }
    	    return true;
          }
      else
          return false;
  }

	
 boolean validb1DestinatonY(){
      if(this.y==this.destinationY){
      	if(this.destinationY==324 && rev==false && this.x==168)
      		this.destinationY=156;
      	else if(this.destinationY==156 && rev==false && this.x==340)
      		this.destinationY=202;
      	else if(this.destinationY==202 && rev==false && this.x==520)
      		this.destinationY=274;
      	else if(this.destinationY==274 && rev==false && this.x==740)
      		this.destinationY=254;
      	else if(this.destinationY==254 && rev==false && this.destinationX==840)
      		this.destinationY=184;
      	else if(this.destinationY==184 && rev==true && this.x==810)
      		this.destinationY=254;
      	else if(this.destinationY==254 && rev==true && this.x==740)
      		this.destinationY=274;
      	else if(this.destinationY==274 && rev==true && this.x==600)
      		this.destinationY=202;
      	else if(destinationY==202 && rev==true && this.x==380)
      	   	 this.destinationY=156;
      else if(destinationY==156 && rev==true && this.destinationX==168)
      		this.destinationY=324;
      else if(destinationY==324 && rev==true && this.x==96)
     		this.destinationY=354;
      else if(destinationY==354 && rev==false )
   		this.destinationY=324;
     	 return true;
      }    
      else
          return false;
  }
  
  
	void move(){
		if(this.stop==1){
      if(this.line==1){
        if(!this.validredDestinatonX() ){
            if(this.x<destinationX)
        	   x+=1;
            else
               x-=1;	
        }    
        if(!this.validredDestinatonY()){
        	if(this.y<destinationY)
         	   y+=1;
             else
                y-=1;	
         } 
      }//Red Line
      else if(this.line==2){
          if(!this.validvDestinatonX() ){
              if(this.x<destinationX)
            	  if(destinationX==972 && chk==1){
            		  x+=2;
            		  chk=0;
            	  } 
            	  else{
          	          x+=1;
          	          chk=1;
            	  }   
              else
            	  if(destinationX==580 && chk==0){
            		  x-=2;
            		  chk=1;
            	  }
            	  else{
            		  x-=1;
            		  chk=0;
            	  }
          }    
          if(!this.validvDestinatonY()){
          	if(this.y<destinationY)
           	   y+=1;
               else
                  y-=1;	
           } 
        }//Violet Line
      else if(this.line==3){
          if(!this.validyDestinatonX() ){
              if(this.x<destinationX)
          	   x+=1;
              else
                 x-=1;	
          }    
          if(!this.validyDestinatonY()){
          	if(this.y<destinationY)
           	   y+=1;
               else
                  y-=1;	
           } 
        }// Yellow Line
      else if(this.line==4){
          if(!this.validoDestinatonX() ){
              if(this.x<destinationX){
            	  
            	  if(chk==1){
            		  x+=2;
            		  chk=0;
            	  }
            	  else{
            		  x+=1;
          	          ochk++;
          		      if(ochk==10){
          		         chk=1;
          		         ochk=0;
          		      }
            	  }
              }	  
              else
            	  if(chk==1){
            		  x-=2;
            		  chk=0;
            	  }
            	  else{
            		  x-=1;
            		  ochk++;
            		  if(ochk==14){
            		     chk=1;
            		     ochk=0;
            		  }   
            	  }
	
          }    
          if(!this.validoDestinatonY()){
          	if(this.y<destinationY)
           	   y+=1;
               else
                  y-=1;	
           } 
      }
          
          else if(this.line==5){
              if(!this.validgDestinatonX() ){
                  if(this.x<destinationX)
              	   x+=1;
                  else
                     x-=1;	
              }    
              if(!this.validgDestinatonY()){
              	if(this.y<destinationY)
               	   y+=1;
                   else
                      y-=1;	
               } 
            }
      
          else if(this.line==6){
              if(!this.validbDestinatonX() ){
                  if(this.x<destinationX){
                	  if(destinationX==974 && chk==1){
                		  x+=2;
                		  chk=0;
                	  } 
                	  else{
              	          x+=1;
              	          chk=1;
                	  }   	
                  }
                  else
                	  if(destinationX==740 && chk==0){
                		  x-=2;
                		  chk=1;
                	  }
                	  else{
                		  x-=1;
                		  chk=0;
                	  }
              }    
              if(!this.validbDestinatonY()){
              	if(this.y<destinationY)
               	   y+=1;
                   else
                      y-=1;	
               } 
            }  
        
          else if(this.line==7){
             if(!this.validb1DestinatonX() ){
                  if(this.x<destinationX)
                		  x+=1;
                	  else
              	          x-=1;
              }    
              if(!this.validb1DestinatonY()){
              	if(this.y<destinationY)
               	   y+=1;
                   else
                      y-=1;	
               } 
            }  
    }   
	}
}