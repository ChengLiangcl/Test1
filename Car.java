/** 
*  This is a example of car class 
* @author Cheng Liang
*/


/*
this is 
*/
public class Car {
	
	private double speed;
	private double accelerationPower;
	private double brakePower;
	private boolean acceleratorOn;
	private boolean brakeOn;
	private double position;
	private String name;
	private static double lowerSpeedLimit = 80.0; private static double upperSpeedLimit = 110.0;
	   public Car(String n, double s, double p, double a, double b){
	     name = n;
	     position = p;
	     accelerationPower = a;
	     brakePower = b;
	     speed = 0.0;
	     acceleratorOn = true;
	     brakeOn = false;
	}
	   public Car(double speed) 
	   {
		   this.speed = speed;
	   }
     /**
      * @return position
      * 
      */
	  public double getPosition(){
	     return position;
	}
	     /**
	      * @return speed
	      * 
	      */
	  public double getSpeed(){
	     return speed;
	}
	     /**
	     
	      * @return name
	      * 
	      */
	  public String getName(){
	    return name;
	}
	     /**
	      
	      * @return a boolean type if the car is too fast or not
	      * 
	      */
	private boolean tooFast(){ return (speed>upperSpeedLimit);
	}
	
	 /**
       @param void
     * @return a boolean type if the car is too slow or not
     * 
     */
	private boolean tooSlow(){ return (speed<lowerSpeedLimit);
	}
	 /**
     * @param  time with type double
     * 
     * 
     */
	public void move(double time){
		   if (tooSlow()){
		      acceleratorOn = true;
		      brakeOn = false;
		      }
		   if (tooFast()){
		      brakeOn = true;
		      acceleratorOn = false;
		      }
		   double a = 0.0;
		   if (acceleratorOn) a += accelerationPower;
		   if (brakeOn) a -= brakePower;
		   speed = speed + time*a;
		   position += time*speed;
		} 
		  */
	public void FENGSHUI(double time){
		   if (tooSlow()){
		      acceleratorOn = true;
		      brakeOn = false;
		      }
		   if (tooFast()){
		      brakeOn = true;
		      acceleratorOn = false;
		      }
		   double a = 0.0;
		   if (acceleratorOn) a += accelerationPower;
		   if (brakeOn) a -= brakePower;
		   speed = speed + time*a;
		   position += time*speed;
		} 
	}



