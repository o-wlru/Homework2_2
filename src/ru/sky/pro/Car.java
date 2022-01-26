package ru.sky.pro;

public class Car extends MachineMotor {

    public Car(String modelName) {
        super(modelName, 4);
    }

       public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}
