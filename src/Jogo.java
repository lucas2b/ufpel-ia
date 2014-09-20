import java.security.acl.LastOwnerException;


public class Jogo{
	int matriz[][] = new int[][]{
									{1,2,3},
									{4,0,6},
									{7,8,5}
	};
	
	Arvore arvore;
	Nodo filhos; 
	
	public Jogo(){
		arvore= new Arvore(matriz);
		//Nodo filhos = new Nodo();
		BreadthFirst();
	}

	public void BreadthFirst(){
		expandeArvore();
	}
	
	public void expandeArvore(){
		int[] pos = achaZero();
	
		OlharaDireita(pos[0], pos[1]);
		printaTabuleiro(matriz);
	}
	
	public int[] achaZero(){
		int[] pos=new int[2];
		for(int i=0; i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				if(matriz[i][j]==0){
					pos[0]=i;
					pos[1]=j;
					return pos;
				}
			}
		}
		System.out.println("Sistema não achou o zero e vai toma no teu cu");
		return pos;
	}
	
	public int OlharaDireita(int i,int j){
		if(j+1 < matriz.length){
			Nodo no = new Nodo(troca(i, j, i, j+1));
			no.pai=arvore.raiz;
			System.out.println("PRINTA ARVORE: ");
			printaArvore(filhos);
			return 1;
		}
		return 0;
	}
	
	public void printaArvore(Nodo no){
		int i=0;
		while(no.filhos.iterator().hasNext()){
			System.out.println(no.filhos.iterator());
			i++;
		}
	}
	
	public int OlharaEsquerda(int i,int j){
		if(j - 1 > 0){
			troca(i, j, i, j-1);
			return 1;
		}
		return 0;
	}
	
	public int OlharaCima(int i, int j){
		if(i - 1 > 0){
			troca(i, j, i-1, j);
			return 1;
		}
		return 0;
	}

	public int OlharaBaixo(int i, int j){
		if(i + 1 < matriz.length){
			troca(i, j, i+1, j);
			return 1;
		}
		return 0;
	}
	//Troca posições do tabuleiro
	public int[][] troca(int posAi,int posAj, int posBi, int posBj){
		int matrizTemp[][] = new int[3][3];
		matrizTemp = matriz;
		int temp;
		if(posAi == posBi || posAj == posBj){  //Garante que só serão trocadas as peças horizontalmente ou verticalmente
			if(matrizTemp[posAi][posAj]==0){       //Garante que a posição a ser trocada seja livre (valor 0)
				temp = matrizTemp[posAi][posAj];
				matrizTemp[posAi][posAj] = matrizTemp[posBi][posBj];
				matrizTemp[posBi][posBj] = temp;
				return matrizTemp;
			}
		}
		//checaTabuleiro(matrizTemp);
		System.out.println("Posicao nao trocada");
		return matrizTemp;
	}
	
	//Testa se o tabuleiro está ordenado
	public int checaTabuleiro(int [][] matrizArg){
		int contador=1;
		int tamanho = matrizArg.length;
		for(int i=0;i<tamanho;i++){
			for(int j=0;j<tamanho;j++){
				//Testa se a posição está com o valor esperado
				if(matrizArg[i][j] == contador){
					contador++;
				}else{
					//Testa se o laço chegou à sua ultima iteração e se o valor é 0, condicionando assim
					//o fim do jogo.
					if(i==tamanho-1 && j==tamanho-1 && matrizArg[tamanho-1][tamanho-1] == 0){
						System.out.println("Tabuleiro ordenado! Parabéns!");
						return 1;
					}else{
						System.out.println("Tabuleiro não ordenado!");
						return 0;
					}	
				}
			}
		}
		return 0;
	}
	
	public void printaTabuleiro(int [][] matr){
		for(int i=0;i<matr.length;i++){
			for(int j=0;j<matr.length;j++){
				System.out.print(matr[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
    public static void main(String args[]) {
    	final int[] inicio   = {1,2,3,4,5,6,7,8,0};                    
        //final int[] objetivo = {0,1,2,3,4,5,6,7,8};                        

        Jogo j = new Jogo();
        
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new InterfaceGrafica(inicio).setVisible(true);
        }
    });
}

	
}	