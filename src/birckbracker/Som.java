package birckbracker;



import java.awt.Desktop;
import java.net.URI;

public class Som {

    public static void som(){
        try{
            URI link = new URI("https://www.youtube.com/watch?v=_VWqHqEtcb0");
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
        }
    


    
    }
}