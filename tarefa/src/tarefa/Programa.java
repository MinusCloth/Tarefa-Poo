package tarefa;

public class Programa {
	
	public static void main(String[] args) {
		
		Carrinho c = new Carrinho();
		
		
		Produtos p1=new Produtos(1,"Shampoo",10.50,2);
		Produtos p2 = new Produtos(2, "Refrigerante", 5.00, 3);
	    Produtos p3 = new Produtos(3, "Sabonete", 2.25, 4);
	    Produtos p4 = new Produtos(4, "Pasta de Dente", 3.75, 2);
	    Produtos p5 = new Produtos(5, "Cereal", 8.99, 1);
	    Produtos p6 = new Produtos(6, "Leite", 4.50, 3);
	    Produtos p7 = new Produtos(7, "Arroz", 12.75, 2);
	    Produtos p8 = new Produtos(8, "Feijão", 7.00, 3);
	    Produtos p9 = new Produtos(9, "Açúcar", 3.25, 2);
	    Produtos p10 = new Produtos(10, "Café", 15.99, 1);	
		
		
		c.add(p1);
		c.add(p3);
		c.add(p10);
		
		c.exibe();
		
		c.total();
		
		
		
	}
}
