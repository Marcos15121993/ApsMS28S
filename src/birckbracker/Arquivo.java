package birckbracker;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;



public class Arquivo {

    public static void writeScore(int Highest_score) {

     	File file = new File("./arquivo/score.txt");
		
		try {
			FileWriter fw = new FileWriter(file);
			System.out.println(Highest_score);
			fw.write(String.valueOf(Highest_score));
			fw.flush();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
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
