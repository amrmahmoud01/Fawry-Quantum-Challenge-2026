public class Car {
    

    private int speed;
    private Engine engine;
    private boolean isOn;

    public Car(String engine){
        this.speed = 0;
        this.isOn = false;
        switch (engine) {
            case "electric":
                this.engine = new ElectricEngine();
                break;

            case "gas":
                this.engine = new GasEngine();
                break;

            case "hybrid": 
                this.engine = new HybridEngine();
                break;


            default:
                break;
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getSpeed() {
        return speed;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }
    
    public boolean getIsOn(){
        return isOn;
    }

    public void start(){
        if (this.isOn){
            System.out.println("Car is already started");
        }
        else{
            System.out.println("Car Started");
            this.isOn = true;
        }
    }

    public void stop(){
        if(this.speed==0){
            this.isOn = false;
        }
        else{
            System.out.println("Car must come to rest before it can be turned off");
        }
    }

    public void accelerate(int x){ //accelerate for x seconds, each second increasing speed by 20 km/h
        if(this.isOn){
            for(int i = 0; i<x; i++){
                if(this.speed>=200){
                    System.out.println("MAX SPEED REACHED");
                    return;
                }
            
            // System.out.println("Car Speed: " + this.speed);
            if (this.speed==0) this.engine.increase(this.speed);
            for(int y=0; y<20; y++){
                this.engine.increase(this.speed);
                }
            
            this.speed+=20; 
            System.out.println("Current car speed: "+this.speed);

            }
        }
        else{
            System.out.println("Must Start Car First");
        }
        
    }


    public void brake(int x){ //Brake for x seconds, each second decreasing speed by 20 km/h
        for(int i = 0; i < x;i++){
            System.out.println("BRAKING..");
            if(this.speed>0){

                for(int y = 0; y<20; y++){
                    this.engine.decrease(this.speed);
                }
                this.speed-=20;
                System.out.println("Car Speed: " + this.speed);
            }
            else{
                System.out.println("Braking for too long, car already stopped");
                return;
            }
        }
        
    }
}
