import scala.math._
import scala.io.StdIn._
object Prueba{	
  	def main(args: Array[String])={
		print("Ingresa un numero: ")
		var num = readInt()
    var in = 1.0
    var prom = 1.0
    while((prom*prom)<=num){
      prom += 1
    }
    prom -= 1
    prom = num/2.0
    var cont = 0
    var r = "%2.4f".format(sqrt(num))
    var real = r.toDouble
    println("Real con 4 decimales: "+real)
    println("Iteración   Estimación  ")
    printf("    %d           %s      \n",cont,prom)
  	//Ciclos
    while(abs(prom - real)>0.0001){
      cont += 1
      prom = ((num/prom)+prom)/2
      printf("    %d           %s      \n",cont,prom)
    }
  }
}