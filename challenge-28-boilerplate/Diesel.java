public class Diesel extends Combustion {
    public Diesel(String model)
    {
        this.model=model;
        if(model.equals("D1300"))
        {
            this.maxPower=67;
            this.maxRpm=6000;   
            this.maxTorque=200;
            this.displacement=1248;
            this.cylinders=4;
            this.compRatio="17.6:1";
            this.weight=111;
            displaySpecs(model, maxPower, maxRpm, maxTorque, displacement, cylinders, compRatio, weight);
        }
       else if(model.equals("D1800"))
        {
            this.maxPower=103;
            this.maxRpm=6300;   
            this.maxTorque=170;
            this.displacement=1796;
            this.cylinders=4;
            this.compRatio="10.5:1";
            this.weight=141;
            displaySpecs(model, maxPower, maxRpm, maxTorque, displacement, cylinders, compRatio, weight);
        }
        else if(model.equals("D2400"))
        {
            this.maxPower=136;
            this.maxRpm=7000;   
            this.maxTorque=233;
            this.displacement=2384;
            this.cylinders=4;
            this.compRatio="11.2:1";
            this.weight=152;
            displaySpecs(model, maxPower, maxRpm, maxTorque, displacement, cylinders, compRatio, weight);
        }
    }

    private void displaySpecs(String model, int maxPower, int maxRpm, int maxTorque, int displacement, int cylinders,
            String compRatio, int weight) {
              System.out.println("Engine Type : " + "\t\t" + "Internal Combustion");
              System.out.println("Engine Power Source : " + "\t\t" + "Diesel");
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
