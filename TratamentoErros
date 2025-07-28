import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExTratErro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Bem vindo ao Cadastro de produto com validação");
            System.out.println("================================================");
            System.out.println("Qual o nome do produto? : ");
            String produto = sc.nextLine();
            if (produto.trim().isEmpty()) {
                throw new IllegalArgumentException("O nome do produto precisa ser preenchido.");
            }

            System.out.println("Qual o preço do produto? : ");
            double preco = sc.nextDouble();

            System.out.println("Quantidade em estoque: ");
            int quantidade = sc.nextInt();

            sc.nextLine();

            System.out.println("Categoria: ");
            String categoria = sc.nextLine();
            if (categoria.trim().isEmpty()) {
                throw new IllegalArgumentException("A categoria precisa ser preenchida.");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("Todos os valores devem ser inseridos de forma numérica!");
        }
        catch (IllegalArgumentException e){
            System.out.println("Os campos não podem estar vazio");
        }
        catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado.");
        }
       
    }
}
