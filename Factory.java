public class Factory {
    public Car createCar(String engineType){
        return new Car(engineType);
    }
    public void replaceEngine(Car car, String engineType){
        car = new Car(engineType);
    }
}
