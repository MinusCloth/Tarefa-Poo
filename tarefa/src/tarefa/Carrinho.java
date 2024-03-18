package tarefa;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Produtos> itens;

    public Carrinho() {
        itens = new ArrayList<>();
    }
    
    public void add(Produtos produto) {
    	itens.add(produto);
    }
    
    public void exibe() {
    	for(Produtos produto:itens) {
    		produto.listarDados();
    	}
    }
    
    public double total() {
    	double total =0;
    	for(Produtos produto:itens) {
    		total+=produto.preco*produto.quantidade;
    	}
    	System.out.println("Valor final da compra: R$" + total);
    	return total;
    }
    
    
}
