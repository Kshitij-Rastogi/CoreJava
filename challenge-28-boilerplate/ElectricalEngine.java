public class ElectricalEngine extends Engine{
    int voltage;
    String currentType;
    public ElectricalEngine(String model)
    {
        this.model=model;
        this.maxPower=88;
        this.maxRpm=15000;
        this.maxTorque=220;
        this.weight=45;
        this.voltage=360;
        this.currentType="AC";
        displaySpecs(model, maxPower, maxRpm, maxTorque, weight, voltage, currentType);
    }

    private void displaySpecs(String model, int maxPower, int maxRpm, int maxTorque, int weight, int voltage,
            String currentType) {
              System.out.println("Engine Type : " + "\t\t" + "Electrical Engine");
              System.out.println("Engine Power Source : " + "\t\t" + "Voltage");
              System.out.println("Engine Model Number : " + "\t\t" + model);
              System.out.println();
              System.out.println("Key Specifications : \n");
              System.out.println("Max Power : " + "\t\t" + maxPower + " " + "KW " + "(" + (int)maxPower*1.34 + " HP)");              System.out.println("Max Torque : " + "\t\t" + maxTorque + " Nm");
              System.out.println("Max RPM : " + "\t\t" + maxRpm);
              System.out.println("Weight : " + "\t\t" + weight + " Kgs");
              System.out.println("Power To Weight Ratio : " + "\t\t" + (int)(((maxPower/1.34)/weight)*1000) + " HP/Ton");
              System.out.println("Number of Cylinders : " + "\t\t" + voltage);
            }
}
