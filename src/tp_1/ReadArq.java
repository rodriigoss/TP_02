package tp_1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author rodrigo
 * A classe ReadArq é responsavel pela leitura dos Arquivos
 */
public class ReadArq{
	
	
	Combate combate= new Combate();
	private String diretorio = "/home/rodrigo/eclipse-workspace/TP_02/src/arq";
	
	@SuppressWarnings("null")
	public  void visualizarArquivos() {
	   
		File file = new File(diretorio);
		File afile[] = file.listFiles();
		LutadorView Lutadorcad= new LutadorView();
		LutaView Lutacad = new LutaView();
		int i = 0;
		int lutador1[] = {0,0};
		int lutador2[] = {0,0};
		int pontos[]= {0,0,0,0};
		int hounds=0;
        int numLinha=1;

		
		for (int j = afile.length; i < j; i++) {
			File arquivos = afile[i];
			      try{
		          BufferedReader br = new BufferedReader(new FileReader(diretorio+"/"+arquivos.getName()));
		          String Array[];
		          while(br.ready()){
		             String linha = br.readLine();
		             Array = linha.split(";");
		             
		             
		             if(hounds<=19) {
		             pontos=combate.fight(Array[7], Array[8], Array[9], Array[10], Array[11],Array[12]
		            		 , Array[17], Array[18], Array[19], Array[20], Array[21], Array[22]);
		            	
		             if(pontos[0]==1) {
		            	 lutador1[0]++;
		            	 lutador1[1]+=pontos[1];
		             }
		             else if(pontos[2]==1){
		            	 lutador2[0]++;
		            	 lutador2[1]+=pontos[3];
		             }
		             
		             hounds++;
		             if(hounds ==19) {
		            	 if(lutador1[0]>lutador2[0]) {
			            	 Lutacad.Novo(Array[2], arquivos.getName(), Array[3],lutador1[1], Array[3], Array[13]);
		            	 }
		            	 else {	Lutacad.Novo(Array[2], arquivos.getName(), Array[13],lutador2[1], Array[3], Array[13]);}
		             }
		             }
		             else {
		            	 hounds=0;
		            	 lutador1[1]=0;
		            	 lutador2[1]=0;
		             }
		             
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