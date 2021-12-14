package birckbracker;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Arquivo {

    public void writeScore() {

        //int score = 0;
        Path caminho = Paths.get("C:/GitHub/ApsMS28S-main/arquivo/score.txt");
        String  texto = "0";
        byte[] textoEmByte = texto.getBytes();
        try{
            Files.write(caminho, textoEmByte);
        }catch(Exception error){
    
        }
  
    }
    
      
    public static int readScore() {

		int score = 0;
		String linha = new String();
		String nomeArquivo = "./arquivo/score.txt";

		File arq = new File(nomeArquivo);

		if (arq.exists()) {
			try {
				FileReader leitorDeArquivo = new FileReader(nomeArquivo);
				BufferedReader bufferDeArquivo = new BufferedReader(leitorDeArquivo);

				while ((linha = bufferDeArquivo.readLine()) != null) {
					score = Integer.parseInt(linha);
				}
				bufferDeArquivo.close();
			} catch (Exception e) {

			}
		}
		return score;

    }
    

}
