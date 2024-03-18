package tarefa;

public class Produtos {
	
	private int codigo;
	private String nome;
	public double preco;
	public int quantidade;
	
	public Produtos(int codigo,String nome,double preco,int quantidade) {
		this.codigo=codigo;
		this.nome=nome;
		this.preco=preco;
		this.quantidade=quantidade;
	}
	
	
	public void listarDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("-----------------------------");
    }

	
	
	

}
