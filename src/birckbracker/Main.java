package birckbracker;

import javax.swing.JFrame;

//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        JFrame obj = new JFrame();
        GamePlay gamePlay = new GamePlay();

        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Brick Breaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
       

   /*     Path caminho = Paths.get("C:/GitHub/ApsMS28S-main/arquivo/score.txt");
        String texto = "teste";
        byte[] textoEmByte = texto.getBytes();
        try{
            Files.write(caminho, textoEmByte);
        }catch(Exception error){
            
        }*/
    }
}
