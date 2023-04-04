import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a letra F ou M: ");
        String sexo = teclado.next();
        if (sexo.equalsIgnoreCase ("M")) {
            System.out.println("Masculino");
        } else if (sexo.equalsIgnoreCase ("F")){
            System.out.println("Feminino");
        } else {
            System.out.println("Sexo inválido");
        }
        teclado.close();
    }
}
