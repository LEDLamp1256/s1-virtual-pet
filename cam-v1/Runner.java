import javax.swing.*;

public class Runner{

    boolean notDead = true;

    public Runner(){
        VirtualPet p = new VirtualPet();

        while(notDead){
            


            if((p.getHunger() >= 100) || (p.boredom >= 100)){
                p.death(); //dieded lol 
            }
        }
        p.exercise();

        wait(1000);

        p.feed();

        wait(1000);

        

        wait(1000);

        p.exercise();

        
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