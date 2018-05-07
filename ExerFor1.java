import javax.swing.JOptionPane;

public class ExerFor1{
    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero"));

        for(int i = 0; i < 11; i++){
            System.out.println(numero + " x " + i + " = " + (i*numero));
        }

       
            }
        }
        
  
