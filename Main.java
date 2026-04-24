public class Main {


    //LOGGING CAR SPEED AND ENGINE SPEEDS WHENEVER THEY CHANGE TO OBSERVE THEM IN ACTION 
    //ALSO WHEN BRAKING
    //AND WHEN ENGINES ARE POWERING DOWN OR UP

    //sorry for the massive logs
    

    public static void main(String[] args){

        //GAS CAR TESTS
        // gasCarTests(); //Run this to run all the tests but the logs get too long so you might have to run each one individually
       
        // startCarTest("gas");
        // accelerateWithoutStartingTest("gas");
        // accelerateCarTest("gas");
        // acceleratePastMaxSpeedTest("gas");
        // brakingPastStoppingTest("gas");
        // accelratingThenBrakingTest("gas");


        //ELECTRIC CAR TESTS
        // electricCarTests(); //ALL THE TESTS AT ONCE

        // startCarTest("electric");
        // accelerateWithoutStartingTest("electric");
        // accelerateCarTest("electric");
        // acceleratePastMaxSpeedTest("electric");
        // brakingPastStoppingTest("electric");
        // accelratingThenBrakingTest("electric");


        //HYBRID CAR TESTS (include an extra test to see how the hybrid car reacts when braking below 50kmh)
        // hybridCarTests(); //ALL THE TESTS AT ONCE

        // startCarTest("hybrid");
        // accelerateWithoutStartingTest("hybrid");
        // accelerateCarTest("hybrid");
        // acceleratePastMaxSpeedTest("hybrid");
        // brakingPastStoppingTest("hybrid");
        // accelratingThenBrakingTest("hybrid");
        // accelerateThenSlowDownBelow50("hybrid");


        //Replace Engine Test
        // replaceEngineTest();

    }


    public static Car createCar(String engineType){
        return new Car(engineType);
    }

    public static Car replaceEngine(String engineType){
        System.out.println("CAR ENGINE REPLACED");
        return new Car(engineType);
    }

    //TESTS
    public static void startCarTest(String engineType){ // TEST CAR STARTING
        System.out.println("TEST 1 RUNNING: STARTING CAR");
        Car car1 = createCar(engineType);
        car1.start();
        System.out.println("TEST 1 CONCLUDED");
    }

    public static void accelerateWithoutStartingTest(String engineType){
        System.out.println("TEST 2 RUNNING: ACCELERATING WITHOUT STARTING");
        Car car1 = createCar(engineType);
        car1.accelerate(5);
        System.out.println("TEST 2 CONCLUDED");
    }


    public static void accelerateCarTest(String engineType){
        System.out.println("TEST 3 RUNNING: ACCELERATING CAR AFTER STARTING");
        Car car1 = createCar(engineType);
        car1.start();
        car1.accelerate(5);
        System.out.println("TEST 3 CONCLUDED");
    }

    public static void acceleratePastMaxSpeedTest(String engineType){
        System.out.println("TEST 4 RUNNING: ACCELERATING PAST MAX SPEED");
        Car car1 = createCar(engineType);
        car1.start();
        car1.accelerate(12); //Accelerate past for 12 seconds, at a rate of +20km/h every second, should exceed max apeed at 10 secs
        System.out.println("TEST 4 CONCLUDED");
    }

    public static void brakingPastStoppingTest(String engineType){
        //Accelerate for 5 seconds then brake for 6
        System.out.println("TEST 5 RUNNING: BRAKING PAST STOPPING");
        Car car1 = createCar(engineType);
        car1.start();
        car1.accelerate(5); 
        car1.brake(6);
        System.out.println("TEST 5 CONCLUDED");
    }

    public static void accelratingThenBrakingTest(String engineType){
        //Accelerate for 3 seconds then brake for 1

        System.out.println("TEST 6: BRAKING AFTER ACCELERATING BUT NOT STOPPING");
        Car car1 = createCar(engineType);
        car1.start();
        car1.accelerate(3); 
        car1.brake(1);
        System.out.println("TEST 5 CONCLUDED");
    }

    public static void accelerateThenSlowDownBelow50(String engineType){
        System.out.println("TEST 7 RUNNING: SLOWING DOWN TO ELECTRIC ENGINE THRESHLOD AFTER WE HAD SWITCHED TO GAS");
        Car car1 = createCar("hybrid");
        
        car1.start();
        car1.accelerate(3);
        car1.brake(2);
        car1.accelerate(3);

        System.out.println("TEST 7 COMPLETE");

    }

    public static void replaceEngineTest(){ //Notice the no engine switching after the engines was replaced
        Car car1 = createCar("hybrid");
        car1.start();
        car1.accelerate(3);
        car1.brake(3);
        car1.stop();

        car1 = replaceEngine("electric");
        car1.start();
        car1.accelerate(3);
    }

    public static void electricCarTests(){
        System.out.println("ELECTRIC CAR TESTING STARTING");
        startCarTest("electric");
        accelerateWithoutStartingTest("electric");
        accelerateCarTest("electric");
        acceleratePastMaxSpeedTest("electric");
        brakingPastStoppingTest("electric");
        accelratingThenBrakingTest("electric");
        System.out.println("ELECTRIC CAR TESTING COMPLETE");
    }
    public static void gasCarTests(){
        System.out.println("GAS CAR TESTING STARTING");
        startCarTest("gas");
        accelerateWithoutStartingTest("gas");
        accelerateCarTest("gas");
        acceleratePastMaxSpeedTest("gas");
        brakingPastStoppingTest("gas");
        accelratingThenBrakingTest("gas");
        System.out.println("GAS CAR TESTING COMPLETE");
    }

    

    public static void hybridCarTests(){
        System.out.println("HYBRID CAR TESTING STARTING");
        startCarTest("hybrid");
        accelerateWithoutStartingTest("hybrid");
        accelerateCarTest("hybrid");
        acceleratePastMaxSpeedTest("hybrid");
        brakingPastStoppingTest("hybrid");
        accelratingThenBrakingTest("hybrid");
        accelerateThenSlowDownBelow50("hybrid");
        System.out.println("HYBRID CAR TESTING COMPLETE");
    }
    






}



