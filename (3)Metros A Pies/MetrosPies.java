import java.util.Scanner;
public class MetrosPies{
public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);//utilazamos el metodo escaner
 //para pedir datos al usaurio
 double pies= 3.28;//declaramos la variable de pies
 double metros;//donde se guaradar la variable
 double resultado;//donde se guaradara el procedimiento
  System.out.println("Este programa pasara de metros a pies ");
  System.out.println("Porfavor ingresar el valor en metros");
	metros = teclado.nextDouble();//datos ingresados por el usuario
	resultado=pies * metros;//wjwcucion de el proceso
  System.out.println("Valor en pies:"+" "+resultado+" "+"FT");
}
}
//alan eduardo de la cruz najera 
//carent:2020390
//codigo academico:PE4EV
//codigo tecnico:IN4BV