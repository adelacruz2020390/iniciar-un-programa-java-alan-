import java.util.Scanner;//donde se podra ingresar datos
public class AreaPerimetro{
public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);//aqui esta para la entrada de datos
 float base;//donde se almacenara la variable de base
 float altura;//donde se alamacenara la variable de altura
 int opciones;//donde se guardara las opciones 
 double resultado=0;//los resultados donde se guardara
 double resultado1=0;//los resultados donde se guardara
 double resultado2=0;//los resultados donde se guardara
 System.out.println("este programa calculara el area y perimetro de un traigulo rectagulo");
  System.out.println("menu de opciones");
  System.out.println("1 sacar el area");
  System.out.println("2 sacar el perimetro");
  System.out.println();
  System.out.println("ingresar opcion");//el menu de opciones 
   opciones = teclado.nextInt();//ingresar los datos por el teclado
  System.out.println("ingresar la base");
   base =teclado.nextFloat();//donde ingresaras la variantes de base
  System.out.println("ingresar la altura");
   altura =teclado.nextFloat();//donde ingresaras las variantes de altura
switch(opciones){//donde se selecionara los casos si quiere ver area ó el perimetro
case 1://si teclas la opcion 1 este proceso se ejecutara
   resultado1 = altura*base/2;
  System.out.println("el resultado del area es:"+" "+ resultado1);
break;//hasta aca termina el ciclo
case 2://si teclas la opciones 2 este procesos se ejecutara
   resultado2 = Math.sqrt(altura*altura+base*base);
   resultado = altura+base+resultado2;
  System.out.println("el resultado el de c es:"+" "+ resultado2);
  System.out.println("el resultado del perimetro es:"+" "+ resultado);

break;//hasta aca termina el ciclo 
default://si tecleas mal la opciones te saldra este mensaje y no se ejecutara el programa
  System.out.println("la opcion es erronea");
break;//hasta aca termian el ciclo 
}

}
}
//alan eduardo de la cruz najera 
//carent:2020390
//codigo academico:PE4EV
//codigo tecnico:IN4BV