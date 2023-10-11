import javax.swing.*;

public class Runner{

    int days = 0;
    int mealsEaten = 0;
    boolean notDead = true;

    public Runner(){
        VirtualPet p = new VirtualPet();

        p.face.setImage("normal");

        while(notDead){
            if((p.getHunger() >= 100) || (p.getNutrition() <= 0)){
                
                //p.death(); //dieded lol 
            }
            if(mealsEaten == 0){
                String breakfast = getResponse("What should I eat for breakfast?");
                if(!(breakfast.equals("")))
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