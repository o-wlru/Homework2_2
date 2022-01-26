package ru.sky.pro;

public class Truck extends MachineMotor {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Truck(String modelName) {
        super(modelName, 6);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        super.service();
        checkTrailer();
    }
}
