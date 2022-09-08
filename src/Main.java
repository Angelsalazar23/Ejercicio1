import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num1=1;
        int num2=2;
        int num3=3;


        System.out.println("Llamando al metodo suma...");
        System.out.println("Resultado de la suma : "+suma(num1, num2,num3));


        System.out.println("Llamando al Objeto MiCoche ");


        Micoche Coche1;
        Coche1 = new Micoche();

      //  System.out.println(Coche1.NumPuertas);
        System.out.println("Num Puertas Iniciales "+Coche1.PuertasTotales());
        System.out.println("Aumentando Puertas....");
        Coche1.AumentarPuertas();
        System.out.println("Num Puertas Finales "+Coche1.PuertasTotales());

       //System.out.println(Coche1.NumPuertas);






    }

    public static int suma(int a, int b, int c)

    {
        int resultado=0;


        resultado= a+b+c;

        return resultado;


    }


}



 class Micoche {

private int NumPuertas=0;




       public void AumentarPuertas(){

        this.NumPuertas++;

}


     public int  PuertasTotales(){


         return this.NumPuertas;


     }


}