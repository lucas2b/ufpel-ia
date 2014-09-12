public class JogodosOito{
	int matriz[][] = new int[][]{
									{0,1,2},
									{3,4,5},
									{6,7,8}
	};
	
	public JogodosOito(){
		
	}
	
	//Troca posi��es do tabuleiro
	public int troca(int posAi,int posAj, int posBi, int posBj){
		int temp;
		
		if(posAi == posBi || posAj == posBj){  //Garante que s� ser�o trocadas as pe�as horizontalmente ou verticalmente
			if(matriz[posBi][posBj]==0){       //Garante que a posi��o final seja livre (valor 0)
				temp = matriz[posAi][posAj];
				matriz[posAi][posAj] = matriz[posBi][posBj];
				matriz[posBi][posBj] = temp;
			}
		}
		return 0;
	}
	
	//Testa se o tabuleiro est� ordenado
	public int checaTabuleiro(){
		int contador=1;
		int tamanho = matriz.length;
		
		for(int i=0;i<tamanho;i++){
			for(int j=0;j<tamanho;j++){
				//Testa se a posi��o est� com o valor esperado
				if(matriz[i][j] == contador){
					contador++;
				}else{
					System.out.printf("Tabuleiro n�o ordenado!");
					return 0;
				}
				//Testa se o la�o chegou � sua ultima itera��o e se o valor � 0, condicionando assim
				//o fim do jogo.
				if(i==tamanho && j==tamanho && matriz[tamanho][tamanho] == 0){
					System.out.printf("Tabuleiro ordenado! Parab�ns!");
					return 1;
				}
			}
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		JogodosOito jo = new JogodosOito();
	}

}	