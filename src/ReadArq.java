import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReadArq{
	
	private String diretorio = "/home/rodrigo/Desktop/TP2/ufc/src/arq";
	
	public  void visualizarArquivos() {
	   
		File file = new File(diretorio);
		File afile[] = file.listFiles();
		int i = 0;
		
		for (int j = afile.length; i < j; i++) {
			File arquivos = afile[i];
			//System.out.println(arquivos.getName());
		      try{
		          BufferedReader br = new BufferedReader(new FileReader("/home/rodrigo/Desktop/TP2/ufc/src/arq/"+arquivos.getName()));
		          String Array[];
		          while(br.ready()){
		             String linha = br.readLine();
		             Array = linha.split(";");
		             
		             System.out.println(Array[1]);
		          }
		          br.close();
		       }catch(IOException ioe){
		          ioe.printStackTrace();
		       }
		}

   }
}