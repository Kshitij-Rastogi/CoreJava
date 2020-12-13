public class CNG extends Combustion {
    public CNG(String model)
    {
        this.model=model;
        if(model.equals("C1000"))
        {
            {
                this.maxPower=43;
                this.maxRpm=6000;   
                this.maxTorque=78;
                this.displacement=998;
                this.cylinders=3;
                this.compRatio="11.0:1";
                this.weight=75;
                displaySpecs(model, maxPower, maxRpm, maxTorque, displacement, cylinders, compRatio, weight);
            }
        }
        else if(model.equals("C1000"))
        {
            {
                this.maxPower=69;
                this.maxRpm=6500;   
                this.maxTorque=122;
                this.displacement=1498;
                this.cylinders=4;
                this.compRatio="10.5:1";
                this.weight=93;
                displaySpecs(model, maxPower, maxRpm, maxTorque, displacement, cylinders, compRatio, weight);
            }
        }
    }

    private void displaySpecs(String model, int maxPower, int maxRpm, int maxTorque, int displacement, int cylinders,
            String compRatio, int weight) {
              System.out.println("Engine Type : " + "\t\t" + "Internal Combustion");
              System.out.println("Engine Power Source : " + "\t\t" + "CNG");
              System.out.println("Engine Model Number : " + "\t\t" + model);
              System.out.println();
              System.out.println("Key Specifications : \n");
              System.out.println("Displacement : " + "\t\t" + displacement + " cc");
              System.out.println("Max Power : " + "\t\t" + maxPower + " " + "KW " + "(" + (int)maxPower*1.34 + " HP)");              System.out.println("Max Torque : " + "\t\t" + maxTorque + " Nm");
              System.out.println("Max RPM : " + "\t\t" + maxRpm);
              System.out.println("Weight : " + "\t\t" + weight + " Kgs");
              System.out.println("Power To Weight Ratio : " + "\t\t" + (int)(((maxPower/1.34)/weight)*1000) + " HP/Ton");
              System.out.println("Number of Cylinders : " + "\t\t" + cylinders);
              System.out.println("Compression Ration : " + "\t\t" + compRatio);
    }
}
