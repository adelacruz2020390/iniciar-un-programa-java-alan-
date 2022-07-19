import java.util.Scanner;//es para obtener la entradas de los datos 
public class OrdenadorNumeros {
public static void main(String[] args) {
 Scanner lectura = new Scanner(System.in);
 double numero;//donde se almacenara la variable 1 
 double numero2;//donde se almacenara la varaible 2
  System.out.println("este programa ordenara los numeros de menor a mayor");
  System.out.println("ingresar el primer numero");//saldra el mensaje de ingresar el numero o la variable
   numero = lectura.nextDouble();//donde se podra ingresar los datos solicitar
  System.out.println("ingresar el segundo numero");
   numero2 = lectura.nextDouble();//donde se podra ingresar los datos solicitar
 if (numero>numero2){//donde se ejecutara el programa si la condicion se cumple se mostrara el mensaje de abajo 
	//si no se cumple la condicion se pasara a la siguiente condicion
  System.out.println("el numero menor" +" " +numero2 +" y el numero mayor "+" " + numero);
}
else if  (numero<numero2){//donde se ejecutara el programa si la condicion se cumple se mostrara el mensaje de abajo
	//si no se cumple la condicion se pasara a la siguiente condicion
  System.out.println("el numero menor" +" " +numero +" y el numero mayor "+" " + numero2);
	}
else if (numero==numero2){//donde se ejecutara el programa si la condicion se cumple se mostrara el mensaje de abajo 
  System.out.println("los numero son iguales");
}
  System.out.println("que tenga un buen dia:)");

}
} 
//alan eduardo de la cruz najera 
//carent:2020390
//codigo academico:PE4EV
//codigo tecnico:IN4BV