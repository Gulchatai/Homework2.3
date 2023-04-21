public class Bicycle extends Machinery {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
   @Override
  public void service() {
  updateTyre();
  }

}

