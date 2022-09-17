public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        System.out.println("Идет обслуживание машины");
        updateTyre();
        checkEngine();
        System.out.println();
    }
}
//..
