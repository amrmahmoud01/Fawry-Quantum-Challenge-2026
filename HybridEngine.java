public class HybridEngine extends Engine {
    private GasEngine gasEngine = new GasEngine();
    private ElectricEngine electricEngine = new ElectricEngine();

    public void increase(int carSpeed){
        if (this.electricEngine.speed<50 && this.gasEngine.speed==0){
            System.out.println("ELECTRIC ENGINE ACTIVE");
            electricEngine.increase(carSpeed);
        }
        else if(this.gasEngine.speed<50 && this.electricEngine.speed==0){  //if gas engine active but less than 50 kmh
            while (this.electricEngine.speed<this.gasEngine.speed){
                System.out.println("Car speed less than 50kmh, reactivating electric engine");
                this.electricEngine.increase(carSpeed);
            }
            while (this.gasEngine.speed>0) {
                System.out.println("Turning gas engine off");
                this.gasEngine.decrease(carSpeed);
            }
        }
        else{  //electric > 50 turn on gas and turn off electric
            
            while(this.gasEngine.speed<50){
                System.out.println("GAS POWERING UP");
                this.gasEngine.increase(carSpeed); // Keep electric engine on to avoid speed reduction
            }
               
            if(this.electricEngine.speed>0 && this.gasEngine.speed>=50){
                while(this.electricEngine.speed>0){ //Turning off electric after gas has taken over
                    System.out.println("GAS ENGINE FULLY OPRERATIONAL. ELECTRIC SHUTTING DOWN");
                    this.electricEngine.decrease(carSpeed);
                    System.out.println("Electric engine speed: "+ this.electricEngine.speed);
                }
            }
            else{
                this.gasEngine.increase(carSpeed);
                System.out.println("Gas Engine Speed: " + this.gasEngine.speed);
            }
            
        }
    }


    public void decrease(int carSpeed){ // Car slows down first then handles engine switches when increasing. 
                                    // Engine activation is irrelevant to engine speed reduction. That is handled by increasing
        if(this.electricEngine.speed>0){ //if electric engine active
            this.electricEngine.decrease(carSpeed);
        }
        else{
            this.gasEngine.decrease(carSpeed);
        }
    }
}