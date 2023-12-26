import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] valores = new int[4] ;

        System.out.print("Exercício 4, leia o enunciado.\n\n"); //Desisto!

        for(int i=0; i<4; i++){
            System.out.print("Digite o valor "+(i+1)+": ");
            valores[i] = entrada.nextInt();
        }

        System.out.print("\nResultados:\n\n");

        System.out.print("Valor 1 e Valor 2:\n");
        System.out.print("	"+valores[0]+" + "+valores[1]+" = "+(valores[0]+valores[1])+"\n");
        System.out.print("	"+valores[0]+" * "+valores[1]+" = "+(valores[0]*valores[1])+"\n\n");

        System.out.print("Valor 1 e Valor 3:\n");
        System.out.print("	"+valores[0]+" + "+valores[2]+" = "+(valores[0]+valores[2])+"\n");
        System.out.print("	"+valores[0]+" * "+valores[2]+" = "+(valores[0]*valores[2])+"\n\n");

        System.out.print("Valor 1 e Valor 4:\n");
        System.out.print("	"+valores[0]+" + "+valores[3]+" = "+(valores[0]+valores[3])+"\n");
        System.out.print("	"+valores[0]+" * "+valores[3]+" = "+(valores[0]*valores[3])+"\n\n");

        System.out.print("Valor 2 e Valor 3:\n");
        System.out.print("	"+valores[1]+" + "+valores[2]+" = "+(valores[1]+valores[2])+"\n");
        System.out.print("	"+valores[1]+" * "+valores[2]+" = "+(valores[1]*valores[2])+"\n\n");

        System.out.print("Valor 2 e Valor 4:\n");
        System.out.print("	"+valores[1]+" + "+valores[3]+" = "+(valores[1]+valores[3])+"\n");
        System.out.print("	"+valores[1]+" * "+valores[3]+" = "+(valores[1]*valores[3])+"\n\n");

        System.out.print("Valor 3 e Valor 4:\n");
        System.out.print("	"+valores[2]+" + "+valores[3]+" = "+(valores[2]+valores[3])+"\n");
        System.out.print("	"+valores[2]+" * "+valores[3]+" = "+(valores[2]*valores[3])+"\n\n");
    }
    public static void Cadstro(){

       try {
           Scanner Scan = new Scanner(System.in);
           System.out.println("Digite o seu nome!");
           String nome = Scan.nextLine();
           System.out.println("Digite a sua senha!");
           String Senha = Scan.nextLine();
           if(nome.equals("") || Senha.equals("") ){
               System.out.println("Por favo preencha os campos!!");
           }else{
               System.out.println("Parabens!! Você foi registrado!!");
           }
       }catch (Exception e ){
           System.out.println("Ocorreu um erro!");
       }

    }
   public static void Excluir(){

   }

}