import java.util.Scanner;
public class KilometrosMetros{
public static void main(String[] args) {
 Scanner teclado= new Scanner(System.in);//utilizaremos el escaner
	// para pedorle datos al usuario
 float metrossegundos;//utilizamos el float 
	//para un poco mas de precicion en los datos
 float resultado;//datos don se guardara el proceso
  System.out.println("Este programa pasara de kilometros/hora a Metros/segundos");
  System.out.println("ingresar el valor kilometros/Hora");
	
   metrossegundos = teclado.nextFloat();//ingresamos los datos
   resultado =metrossegundos * 1000/3600;//el proceso
  System.out.println("el resultado es de:"+" "+resultado+" "+"m/s");

}
}
//alan eduardo de la cruz najera 
//carent:2020390
//codigo academico:PE4EV
//codigo tecnico:IN4BV