import java.util.ArrayList;
import java.util.List;


public class Nodo {
	public List<Nodo> folha;
	
	
	public void Nodo(){
		
	}

	public void insere(Nodo child){
		if (folha == null) {
            folha = new ArrayList<Nodo>();
        }
		folha.add(child);
	}
	
	public void deleta(Nodo child){
		folha.remove(child);
	}
	
	public void procura(){
		
	}
	
}
