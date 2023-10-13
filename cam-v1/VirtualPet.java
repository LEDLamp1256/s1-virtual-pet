/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int happiness = 100;
    int nutrition = 100;
    int hunger = 0;   // how hungry the pet is.
    private int tiredness = 0;
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }

    public void changeNutrition(int c){
        this.nutrition += c;
    }

    public void changeHappiness(int c){
        this.happiness += c;
    }

    public int getNutrition(){
        return nutrition;
    }

    public int getHappiness(){
        return happiness;
    }

    public int getHunger(){
        return hunger;
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");

        if(tiredness < 4){
            face.setMessage("That was great!");
            face.setImage("ecstatic");
        }
        
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

} // end Virtual Pet
