public class Bicycle extends Transport{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void service() {
        System.out.println("Идет обслуживание велосипеда");
        updateTyre();
        System.out.println();
    }

}
//..