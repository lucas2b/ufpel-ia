import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Arvore {
	public static Nodo raiz;
	ArrayList<Nodo> filhos = new ArrayList<Nodo>(3); 
	
	public Arvore(){
		this.raiz=null;
		for (int i = 0; i < 10; i++) { 
			//this.filhos.add(new Nodo);
		}
	}
	
	public Arvore(int [][] matriz){
		this.setNodo(null);
		raiz.distancia=0;
	}
	
	public void setNodo(int[][] matriz){
		raiz = new Nodo(matriz);
	}
	
	 public void insertNode(int[][] matriz){
		 if(raiz==null){
			 raiz = new Nodo(matriz);
			 
		 }else{
			 //raiz.insere(matriz);
		 }
	 }

	
	
}
