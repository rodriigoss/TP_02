package tp_1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReadArq{
	
	
	
	private String diretorio = "/home/rodrigo/eclipse-workspace/TP_02/src/arq";
	
	public  void visualizarArquivos() {
	   
		File file = new File(diretorio);
		File afile[] = file.listFiles();
		LutadorView Lcad= new LutadorView();
		int i = 0;
        int numLinha=1;
		
		for (int j = afile.length; i < j; i++) {
			File arquivos = afile[i];
			//System.out.println(arquivos.getName());
		      try{
		          BufferedReader br = new BufferedReader(new FileReader(diretorio+"/"+arquivos.getName()));
		          String Array[];
		          while(br.ready()){
		             String linha = br.readLine();
		             Array = linha.split(";");

		             //System.out.println(Array[1]);
		             if(Integer.parseInt(Array[2])==numLinha) {
		            	  Lcad.Novo(Array[3], Array[6], Array[5], Array[4]);
		            	  Lcad.Novo(Array[13], Array[16], Array[15], Array[14]);
		            	 numLinha++;
		             }
		             

		             
		          }
		          br.close();
		       }catch(IOException ioe){
		          ioe.printStackTrace();
		       }
		}

   }
}