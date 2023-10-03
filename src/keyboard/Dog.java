package keyboard;

/**
 *
 * @author 20024094
 */

public class Dog {
    //Instance Variables
    private String name = "", coatColour = "", breed = "", size = "";
    private String ownerName, foodType;
    private char gender;
    private int noOfLegs, age;
    private double weight, height, distanceWalked;
    private boolean trained, isHungry, teethDirty, isHappy;
    
    //Constructors
    Dog(){
        ownerName = "Unknown";
        foodType = "ofal";
        gender = ' ';
        noOfLegs = 4;
        age = 0;
        weight = 0;
        height = 0;
        distanceWalked = 0;
        trained = false;
        isHungry = true;
        teethDirty = true;
        isHappy = false;          
    }
    
    Dog(String coatColour, String breed, String size, char gender, int noOfLegs, double weight, double height){
        this.coatColour = coatColour;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.noOfLegs = noOfLegs;
        this.weight = weight;
        this.height = height;
        
        distanceWalked = 0;
        trained = false;
        isHungry = true;
        teethDirty = true;
        isHappy = false;  
        ownerName = "Unknown";
        foodType = "ofal";        
        age = 0;
        name = "Unknown";
    }
    
    //getters and setters
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public String getCoatColour() {
        return coatColour;
    }

    public void setCoatColour(String coatColour) {
        this.coatColour = coatColour;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }
    
    //Methods
    public void bark(){
        System.out.println("Woof Woof");
    }
    
    public void walkTheDog(double distance){
        this.distanceWalked += distance;
        isHungry = true;
        isHappy = true;
        System.out.println("Today " + name + " walked " + distance);
        System.out.println("Overall " + name + " has walked " + distanceWalked);
    }
    
    public void patTheDog(){
        isHappy = true;
        System.out.println("You have patted " + name + ", they look content");
    }
    
    public void cleanTheTeeth(){
        teethDirty = false;
        isHappy = true;
        System.out.println("You have cleaned " + name + "'s teeth, boy are they grumpy!");
    }
    
    public void feedTheDog(){
        isHungry = false;
        teethDirty = true;
        System.out.println("You have fed " + foodType + " to " + name + ", but their teeth are now dirty!");
    }
    
    public void displayDetails(){
        System.out.println("Details for " + name);
        System.out.println("================================");
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Distance Walked: " + distanceWalked);
        System.out.println("No Of Legs: " + noOfLegs);
        System.out.println("Is " + name + " trained?: " + trained);
    }
}
