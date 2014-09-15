
public class Jogo{
	int matriz[][] = new int[][]{
									{0,1,2},
									{3,4,5},
									{6,7,8}
	};
	
	public Jogo(){
		
	}
	
	
	//Troca posições do tabuleiro
	public int troca(int posAi,int posAj, int posBi, int posBj){
		int temp;
		
		if(posAi == posBi || posAj == posBj){  //Garante que só serão trocadas as peças horizontalmente ou verticalmente
			if(matriz[posBi][posBj]==0){       //Garante que a posição final seja livre (valor 0)
				temp = matriz[posAi][posAj];
				matriz[posAi][posAj] = matriz[posBi][posBj];
				matriz[posBi][posBj] = temp;
			}
		}
		return 0;
	}
	
	//Testa se o tabuleiro está ordenado
	public int checaTabuleiro(){
		int contador=1;
		int tamanho = matriz.length;
		
		for(int i=0;i<tamanho;i++){
			for(int j=0;j<tamanho;j++){
				//Testa se a posição está com o valor esperado
				if(matriz[i][j] == contador){
					contador++;
				}else{
					System.out.printf("Tabuleiro não ordenado!");
					return 0;
				}
				//Testa se o laço chegou à sua ultima iteração e se o valor é 0, condicionando assim
				//o fim do jogo.
				if(i==tamanho && j==tamanho && matriz[tamanho][tamanho] == 0){
					System.out.printf("Tabuleiro ordenado! Parabéns!");
					return 1;
				}
			}
		}
		return 0;
	}
	
	
    public static void main(String args[]) {
        final int[] inicio   = {1,2,3,4,5,6,7,8,0};                        
        final int[] objetivo = {0,1,2,3,4,5,6,7,8};                        

    	
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