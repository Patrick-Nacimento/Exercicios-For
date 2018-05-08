import javax.swing.JOptionPane;

public class ExerFor4{
    public static void main(String[] args){
        String texto = "";
        for(int i = 0; i < 21; i++){
            for(int j = 0; j < 21; j++){
                if(i == 0 || i == 20 || j == 0 || j == 20){
                texto += "* ";
                }else if(i == j || i + j == 20 || j == 10 || i == 10){
                    texto += "* ";
                }else{
                    texto += "  ";
                
                }

            }
            texto += "\n";
        }
        System.out.println(texto);
    }
}

