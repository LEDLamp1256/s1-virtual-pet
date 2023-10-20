import javax.swing.*;

public class Runner{

    int days = 0;
    int mealsEaten = 0;
    String emotion = "normal";
    boolean notDead = true;

    public Runner(){
        VirtualPet p = new VirtualPet();

        //p.face.setImage(emotion);

        while(notDead){
            if((p.getHunger() >= 100) || (p.getNutrition() <= 0) || (p.getHappiness() <= 1)){
                notDead = false;
            }
            else if(mealsEaten >= 60){
                break;
            }
            //add images :(
            else{
                p.face.setImage("normal");
                wait(1000);
                p.face.setMessage("What food should I eat?");
                String meal = getResponse("What should it eat?").toLowerCase();
                if(meal.indexOf("plant") != -1 || meal.indexOf("plants") != -1){
                    p.face.setMessage("Aw ok...");
                    p.face.setMessage("I'll eat it...");
                    p.face.setImage("plant");
                    p.face.setMessage("");
                    wait(1000);
                    p.face.setMessage("Ew! That was yucky");
                    p.face.setImage("sick");
                    p.face.setMessage("");
                    wait(1000);
                    p.face.setImage("verysad");
                    p.changeNutrition(10);
                    p.changeHappiness(-10);
                }
                else{
                    p.face.setMessage("Yay!");
                    p.face.setMessage("");
                    p.face.setImage("joyful");
                    wait(1000);
                    p.changeNutrition(-10);
                    p.changeHappiness(10);
                }
                p.face.setMessage("Im so full...");
                p.face.setImage("djkhaled");
                p.face.setMessage("I am at: " + p.nutrition + " nutrition!");
                wait(1000);
                p.face.setMessage("Hint! Feed him plant to make him nutritionized, but not too many!");
                wait(1000);
                
                mealsEaten += 1;
                p.face.setMessage("Im hungry again!");


                // p.face.setMessage("What should I eat for breakfast?");
                // String breakfast = getResponse("What should it eat for breakfast?");
                // if(!(breakfast.toLowerCase().equals("hashbrown"))){
                //     p.face.setMessage("Can I have a hashbrown?");
                //     wait(5000);
                //     String hashbrownStatus = getResponse("Can it have a hashbrown?").toLowerCase();
                //     if(hashbrownStatus.equals("no")){
                //         emotion = "sad";
                //         p.face.setImage(emotion);
                //         p.face.setMessage("Are you sure I cant have a hashbrown...");
                //         wait(5000);
                //         if(getResponse("Are you sure it cant have a hashbrown?").toLowerCase().equals("yes")){
                //             p.changeHappiness(-100);
                //             p.face.setMessage("Fine...");  
                //             wait(5000);
                //         }
                //     }
                //     if(hashbrownStatus.equals("yes")){
                //         emotion = "happy";
                //         p.face.setImage(emotion);
                //         p.face.setMessage("Yay!!!");
                //         wait(5000);
                //         p.changeHappiness(10);
                //     }
                    
                // }
            }

        }
        if(!notDead){
            p.face.setMessage("It has died.");
            p.face.setMessage("You lived: " + mealsEaten/3 + " days!");
            p.face.setImage("coffin");
        }
        else{
            p.face.setImage("kumalala");
            p.face.setMessage("You lived for more than 20 days!");
        }
        
    }

    // public void gameLoop(){
    //     while notDead{
    //         System.out.println("test");
    //     }
    // }

    public void wait(int milliseconds){
        try {
            Thread.sleep(milliseconds); //milliseconds
        } catch(Exception e){
        
        }

    }

    public String getResponse(String q){
        String s = (String)JOptionPane.showInputDialog(
            new JFrame(),
            q,
            "Get a response",
            JOptionPane.QUESTION_MESSAGE
);
        return s;

    }

    public static void main(String[] args){
        new Runner();
        
    }
}