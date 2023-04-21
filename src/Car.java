public class Car extends MachineryWithMotor {
    public Car(String modelName, int wheelsCount, String modelMotor) {
        super(modelName, wheelsCount, modelMotor);
    }
    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }
    }
