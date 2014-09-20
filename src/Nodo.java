import java.util.ArrayList;
import java.util.List;


public class Nodo {
	
	public int [][] tabuleiro;
	public ArrayList<Nodo> filhos = new ArrayList<Nodo>(3);
	
	public Nodo pai;	  // CONTROLA NODO ANTERIOR
	public int distancia; // DISTANCIA DA RAIZ
	public boolean visitado = false;
	
	public Nodo(){
		
	}
	
	public Nodo(int [][] novoTabuleiro){
		this.tabuleiro = novoTabuleiro;
		this.pai=null;
		insere(this);
	}
	
	public int [][] getTabuleiro(int [][] m){
		return this.tabuleiro;
	}
	
	public void setDistancia(int n){
		this.distancia = n;
	}
	
	public void insere(Nodo child){
		if(this.pai==null){
			this.pai=child.pai;
			//this.distancia=this.pai.distancia+1;
		}
		this.filhos.add(child);
	}

}
