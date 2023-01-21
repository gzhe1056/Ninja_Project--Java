public class Ninja {
    private String name, bloodLineType, village;
    private int chakraPoints, bloodLineChakraCost;
    private int bodyFlickerChakraPoints = 5;

//Constructor
    public Ninja()
    {
        name = "Otsutsuki Boruto";
        bloodLineType = "Jougan";
        village = "Hidden Leaf Village";
        chakraPoints = 1000;
        bloodLineChakraCost = 5;
    }
//Default constructor
    public Ninja(String initName, String initBloodLineType, String initVillage, int initChakraPoints, int initBloodLineChakraCost)
    {
        name = initName;
        bloodLineType = initBloodLineType;
        village = initVillage;
        chakraPoints = initChakraPoints;

        bloodLineChakraCost = initBloodLineChakraCost;

    }

//Accessors
    public String getName(){
        return name;
    }
    public String getBloodLineType() {
        return bloodLineType;
    }
    public String getVillage() {
        return village;
    }
    public int getChakraPoints() {
        return chakraPoints;
    }
    public int getBloodLineChakraCost() {
        return bloodLineChakraCost;
    }
    public int getBodyFlickerChakraPoints()
    {
        return bodyFlickerChakraPoints;
    }

//Mutators
    public void setName(String newName) {
        name = newName;
    }
    public void setBloodLineType(String newBloodLineType)
    {
        bloodLineType = newBloodLineType;
    }
    public void setVillage(String newVillage)
    {
        village = newVillage;
    }
    public void setChakraPoints(int newChakraPoints)
    {
        if (chakraPoints < 0)
        {
            System.out.println("Out of chakra!");
        }
        chakraPoints = newChakraPoints;
    }
    public void setBloodLineChakraCost(int newBloodLineChakraCost)
    {
        if (bloodLineChakraCost < 0)
        {
            System.out.println("Error. Must be a positive number!");
        }
        else
        {
            bloodLineChakraCost = newBloodLineChakraCost;
        }
    }
    public void setBodyFlickerChakraPoints(int newBodyFlickerChakraPoints)
    {
        bodyFlickerChakraPoints = newBodyFlickerChakraPoints;
    }

    //Compare if the two ninjas are equal
    public boolean isEqual(Ninja otherNinja)
    {
        boolean areEqual =
                this.name.equals(otherNinja.name) &&
                this.bloodLineType.equals(otherNinja.bloodLineType) &&
                this.village.equals(otherNinja.village) &&
                this.chakraPoints == otherNinja.chakraPoints &&
                this.bloodLineChakraCost == otherNinja.bloodLineChakraCost;
        return areEqual;
    }
    public void bloodlineAttack()
    {
        if (this.chakraPoints >= this.bloodLineChakraCost)
        {
            this.chakraPoints = this.chakraPoints - this.bloodLineChakraCost;
            System.out.println(this.name + " used " + this.bloodLineType + " that costs " + this.bloodLineChakraCost);
            System.out.println(this.name + " now has " + this.chakraPoints + " chakra left.");
        }
        else
        {
            System.out.println("Cannot use " + this.bloodLineType + ". Not enough chakra.");
        }
    }
    public void bodyFlicker()
    {
        if (this.chakraPoints > 0)
        {
            this.chakraPoints = this.chakraPoints - bodyFlickerChakraPoints;
            System.out.println(this.name + " used body flicker to escape to " + this.village + "!");
            System.out.println(this.name + " now has " + this.chakraPoints + " chakra left.");
        }
        else
        {
            System.out.println(this.name + " is out of chakra!");
        }
    }
}
