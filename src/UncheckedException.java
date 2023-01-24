

import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLopping = true;
       do{
           String a =  JOptionPane.showInputDialog("Numerador: ");
           String b =  JOptionPane.showInputDialog("Denominador: ");
           try {
               int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
               System.out.println("Resultado: "+ resultado);
               continueLopping = false;
           } catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(null, "Entrada invalida, informe um numero inteiro "+ e.getMessage());

               //e.printStackTrace(); Mostra o erro e continua
           }catch (ArithmeticException e){
               JOptionPane.showMessageDialog(null, "Impossivel dividir por 0");

           } finally {
               System.out.println("Chegou no finaly");
           }
       }while(continueLopping);


        System.out.println("O codigo continua...");
    }


    public static Integer dividir(int a, int b){
        return a/b;
    }
}

