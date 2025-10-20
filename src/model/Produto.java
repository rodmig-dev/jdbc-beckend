package model;

public class Produto {
    
    private Long id;
    private String nome;
    private double preco;
    private int estoque;

    //construtor vazio (Gson)
    public Produto(){
    }

    //busca e edição no BD
    public Produto(Long id, String nome, double preco, int estoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // inserção no DB
     public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

     public Long getId() {
         return id;
     }

     public void setId(Long id) {
         this.id = id;
     }

     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public double getPreco() {
         return preco;
     }

     public void setPreco(double preco) {
         this.preco = preco;
     }

     public int getEstoque() {
         return estoque;
     }

     public void setEstoque(int estoque) {
         this.estoque = estoque;
     }

     @Override
     public String toString(){
        return "Produto [id = " + id
         + ", nome = " + nome
         + ", preco = " + preco
         + ", estoque =" + estoque
         + "]";
     }

    

    

    
    

    

}
