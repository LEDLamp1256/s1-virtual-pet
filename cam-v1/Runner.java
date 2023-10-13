import javax.swing.*;

public class Runner{

    int days = 0;
    int mealsEaten = 0;
    String emotion = "normal";
    boolean notDead = true;

    public Runner(){
        VirtualPet p = new VirtualPet();

        p.face.setImage(emotion);

        while(notDead){
            if((p.getHunger() >= 100) || (p.getNutrition() <= 0) || (p.getHappiness() <= 1)){
                p.face.setImage("pushingdaisies");
                //p.death(); //dieded lol 
            }
            //add images :(
            else if(mealsEaten == 0){
                p.face.setMessage("What should I eat for breakfast?");
                String breakfast = getResponse("What should it eat for breakfast?");
                if(!(breakfast.toLowerCase().equals("hashbrown"))){
                    p.face.setMessage("Can I have a hashbrown?");
                    wait(5000);
                    String hashbrownStatus = getResponse("Can it have a hashbrown?").toLowerCase();
                    if(hashbrownStatus.equals("no")){
                        emotion = "sad";
                        p.face.setImage(emotion);
                        p.face.setMessage("Are you sure I cant have a hashbrown...");
                        wait(5000);
                        if(getResponse("Are you sure it cant have a hashbrown?").toLowerCase().equals("yes")){
                            p.changeHappiness(-100);
                            p.face.setMessage("Fine...");  
                            wait(5000);
                        }
                    }
                    if(hashbrownStatus.equals("yes")){
                        emotion = "happy";
                        p.face.setImage(emotion);
                        p.face.setMessage("Yay!!!");
                        wait(5000);
                        p.changeHappiness(10);
                    }
                    
                }
            }

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