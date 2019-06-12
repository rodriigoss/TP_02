package tp_1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReadArq{
	
	
	combate AAA= new combate();
	private String diretorio = "/home/rodrigo/eclipse-workspace/TP_02/src/arq";
	
	public  void visualizarArquivos() {
	   
		File file = new File(diretorio);
		File afile[] = file.listFiles();
		LutadorView Lutadorcad= new LutadorView();
		LutaView Lutacad = new LutaView();
		int i = 0;
		int lutador1=0;
		int lutador2=0;
		int houds=0;
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
		             
		             
		             if(houds<=19) {
		             if(AAA.combatee(Array[7], Array[8], Array[9], Array[10], Array[11],Array[12]
		            		 , Array[17], Array[18], Array[19], Array[20], Array[21], Array[22])) {
		            	 lutador1++;
		             }
		             else {
		            	 lutador2++;
		             }
		             houds++;
		             if(houds ==19) {
		            	 if(lutador1>lutador2) {
			            	 Lutacad.Novo(Array[2], arquivos.getName(), Array[3], Array[3], Array[13]);
		            	 }
		            	 else {	Lutacad.Novo(Array[2], arquivos.getName(), Array[13], Array[3], Array[13]);}
		             }
		             }
		             else {
		            	 houds=0;
		             }
		             
		             //System.out.println(Array[1]);
		             if(Integer.parseInt(Array[2])==numLinha) {
		            	  Lutadorcad.Novo(Array[3], Array[6], Array[5], Array[4]);
		            	  Lutadorcad.Novo(Array[13], Array[16], Array[15], Array[14]);
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