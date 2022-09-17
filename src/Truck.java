public class Truck extends Transport{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void service() {
        System.out.println("Идет обслуживание грузовика");
        updateTyre();
        checkEngine();
        checkTrailer();
        System.out.println();
    }

}
//..