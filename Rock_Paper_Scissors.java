import javax.swing.JOptionPane;
import java.util.Random;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
//        String name= JOptionPane.showInputDialog("What's your name?");
//        JOptionPane.showMessageDialog(null,"Hello "+name);
//        int age=Integer.parseInt(JOptionPane.showInputDialog("What's your age?"));
//        JOptionPane.showMessageDialog(null,"Hello"+name+" you are "+age+" years old.");
        Random random = new Random();
        for (int i = 0; i<10; i++) {
            int r = random.nextInt(3)+1;
            int turn = Integer.parseInt(JOptionPane.showInputDialog("It's your turn !!! \n 1. Press '1' for SCISSORS.\n 2. Press '2' for PAPER. \n 3. Press '3' for ROCK."));

            if ((r == 1 && turn == 2) || (r == 2 && turn == 3) || (r == 3 && turn == 1)) {
                JOptionPane.showMessageDialog(null, "Computer win !!!");
            }
            else if ((r == 2 && turn == 1) || (r == 3 && turn == 2) || (r == 1 && turn == 3)) {
                JOptionPane.showMessageDialog(null, "You win !!!");
            }
            else if(turn>3) {
                JOptionPane.showMessageDialog(null,"Choose Number between 1 to 3...");
            }
            else {
                JOptionPane.showMessageDialog(null,"Match Draw...!!!");
            }
        }

    }
}
