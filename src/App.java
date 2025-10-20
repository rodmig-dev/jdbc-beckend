import dao.ProdutoDao;
import model.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        

        /*try {
            ConnectionFactory.getConnection();
            System.out.println("Conexão efetuada com sucesso!");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

        /*try {
            ProdutoDao produtoDao = new ProdutoDao();
            for(Produto p: produtoDao.buscarTodos()){
                System.out.println(p.toString());
            } 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

         try {
            ProdutoDao produtoDao = new ProdutoDao();
                Produto produto = produtoDao.buscarPorId(Long.parseLong("1"));
                System.out.println(produto.toString());
             
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
