import java.util.Scanner;
public class Calculadora{
public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
 String opciones="";//utilisamos el string para para pedir la lieteral para que funcione el swichts
 double suma;//donde almacenaremos el procesedimineto de suma
 double resta;//donde almacenaremos el procesedimineto de resta
 double multiplicacion;//donde almacenaremos el procesedimineto de multiplicacion 
 double divicion;//donde almacenaremos el procesedimineto de division
 double num1;//donde se declamaros la variable de num1
 double num2;//donde se decalramos la variable de num2
 double resultado=0;//declaramos los resultado
 double resultadoA=0;//declaramos los resultado
 double resultadoB=0;//declaramos los resultado
 double resultadoC=0;//declaramos los resultado
  System.out.println("menu de opciones de la Calculadora");
  System.out.println("utiliza la teclas (s) (r) (m) (d)");
  System.out.println("si deseas sumar usa (s)");
  System.out.println("si deseas restar usa (r)");
  System.out.println("si desaes multiplicar usa (m)");
  System.out.println("si desaes divir usa (d)");//donde se mostra en cosola el menu de opciones 
  System.out.println();//donde igresara los datos de entra
  System.out.println("ingresa tu opcion");//ingresamos la opcion que queremos utilizar 
   opciones=teclado.nextLine();//ingresamos la opcion s,r,m,d
  System.out.println("ingresa el primer valor:");//se mostra al ingresar la opciones del menu
   num1 =teclado.nextDouble();//ingresamos el valor de num1
  System.out.println("ingresa el segundo valor:");//se mostra despues de ingresar el primer valor
   num2 =teclado.nextDouble();//ingresamos el valor de num2
switch(opciones){//donde se ejecutara el menu de opciones 
case "s" ://si teclamos s se ejcutar el proceso de sumar
   suma = num1 + num2;//este es el proceso de suma
   resultado=suma;
  System.out.println("el resultado de la suma es"+" "+resultado);//donde se imprimera el resultado de suma
break;//termina el proceso de suma
case "r" ://si teclamos r se ejutara el proceso de resta
   resta = num1 - num2;//proceso de resta
   resultadoA=resta;
  System.out.println("el resultado de la resta es"+" "+resultadoA);//donde se imprimera el resultado de resta
break;//donde termina el proceso de resta
case "m"://si teclamos m se ejutara el proceso de multiplicacion
    multiplicacion = num1 * num2;//proceso de multiplicacion
    resultadoB=multiplicacion;
   System.out.println("el resultado de la multiplicacion es"+" "+resultadoB);//donde se imprimira el resultaso de multiplicacion
break;//termina el proceso de multiplicacion
case "d"://si teclamos d se ejecutara proceso de division
    divicion = num1 / num2;//proceso de division
    resultadoC=divicion;
   System.out.println("el resultado de la divicion es"+" "+resultadoC);//dodne se imprimera el resultadode division
break;//donde terminar el proceso de divicion
default://si teclastes una opcion mal te saldra el siguinete mensaje
   System.out.println("la opcion es equivocada vuelve a ejecutar el programa");//este es el mensaje que se mostrara
break;//donde termina el ciclo de default
  }
   }
    }
//alan eduardo de la cruz najera 
//carent:2020390
//codigo academico:PE4EV
//codigo tecnico:IN4BV