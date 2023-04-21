public class Truck extends MachineryWithMotor{
    private final String trailer;

    public Truck(String modelName, int wheelsCount, String modelMotor, String trailer) {
        super(modelName, wheelsCount, modelMotor);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }
    @Override
    public void service() {
        updateTyre();
        checkEngine();
        System.out.println("Проверяем прицеп");
    }
   // public void checkTrailer() {
     //   System.out.println("Проверяем прицеп");
   // }
}
