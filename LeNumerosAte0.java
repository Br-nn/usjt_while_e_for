import java.util.Scanner;

public class LeNumerosAte0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" (Para parar digite: 0) Digite seu número: ");
        int n = scanner.nextInt();
        int soma = 0;
        int cont = 0;
        double media;
        while (n != 0) {
            soma = soma + n;
            System.out.print("Próximo: ");
            n = scanner.nextInt();  
            cont++;
            
        }
        media = (double)soma / cont;

        if (cont == 0){
            System.out.println("Nenhum valor foi digitado.");

        }else{
           
            
            
            System.out.println("Soma total = " + soma);
            System.out.println("Média total = " + cont + " (" + soma + "/" + cont + ")");    
        }
        System.out.println("Tamo junto, até a próxima!!");
        scanner.close();
    }
}
