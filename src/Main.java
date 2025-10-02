import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      System.out.print("Digite la cantidad de numeros a validar: ");
      int cnt = leer.nextInt();

      int[] numeros = new int [cnt];


      System.out.print("Ingrese " + cnt + " numeros enteros de 3 a 5 cifras :");
      for (int i = 0; i < cnt; i++) {
          numeros[i] = leer.nextInt();

        }

      System.out.println("Numeros ingresados: ");
      for (int i = 0; i < cnt; i++) {
          System.out.println(numeros[i]);
          if(i < cnt - 1) System.out.print(", ");

      }
      System.out.println();

      System.out.println("\nResultados");
      for (int num : numeros){
          int temp = num;
          int sum = 0;
          while (temp > 0) {
              sum += temp % 10;
              temp /= 10;
          }

          temp = num;

          int inv = 0;
          while (temp > 0) {
              int dig = temp % 10;
              inv = inv *10 + dig;
              temp /= 10;
          }
          boolean sumaPar = (sum %2 ==0);
          boolean divi3 = (inv %3 ==0);

          if(sumaPar && divi3){
              System.out.println(num +" SI(invertido: " + inv + ")");
          }else{
              System.out.println(num +" NO(invertido: " + inv + ")");
          }
          leer.close();
      }
    }

}
