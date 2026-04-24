public abstract class Engine {
    protected int speed;
    public Engine(){
        this.speed = 0;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void increase(int carSpeed){
        if(carSpeed<200){
            System.out.println("Current Engine Speed: "+this.speed);
            this.speed+=1;
        }
        else{
            System.out.println("MAX SPEED REACHED");
            return;
        }
    }
    
    public void decrease(int carSpeed){
        if(this.speed>0){
            if(carSpeed>0){
            this.speed-=1;
            System.out.println("Engine Speed: " + this.speed);
        }
            else{
                System.out.println("Car already stopped");
                return;
            }
        }
        else{
            System.out.println("ENGINE SPEED ALREADY 0");
        }
    }

}
