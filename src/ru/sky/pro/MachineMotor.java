package ru.sky.pro;

public abstract class MachineMotor extends Machine {

    public MachineMotor(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void service() {
       super.service();
        checkEngine();
    }
}
