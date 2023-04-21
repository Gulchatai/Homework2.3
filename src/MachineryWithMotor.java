
public abstract class MachineryWithMotor extends Machinery {
    private final String modelMotor;

    public MachineryWithMotor(String modelName, int wheelsCount, String modelMotor) {
        super(modelName, wheelsCount);
        this.modelMotor = modelMotor;
    }

    public String getModelMotor() {
        return modelMotor;
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

