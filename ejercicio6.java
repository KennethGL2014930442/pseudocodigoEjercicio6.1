import java.util.*;

public class ejercicio6{
	
	public static void main(String[] args){
		double promediomenor, promediomayor;
		double contadormenor25 = 0;
		double contadormayor25 = 0;
		double acumuladormenor25 = 0;
		double acumuladormayor25 = 0;
		
		for (int i= 1; i<=100; i++){
			int numero = (int)(Math.random()*100+1);
			System.out.println("Edad de la persona "+i+": "+numero);
			
			if(numero < 25){
				contadormenor25 = contadormenor25 + 1;
				acumuladormenor25 = acumuladormenor25 + numero;
			}else{
				contadormayor25 = contadormayor25 + 1;
				acumuladormayor25 = acumuladormayor25 + numero;
			}
		}
		
		System.out.println("Total de personas menores de 25 anios: "+contadormenor25);
		System.out.println("Total de personas mayores de 25 anios: "+contadormayor25);
		
		promediomenor = acumuladormenor25/contadormenor25;
		promediomayor = acumuladormayor25/contadormayor25;
		
		System.out.println("El promedio de edades menores a 25 es: "+promediomenor);
		System.out.println("El promedio de edades mayores o iguales a 25 es: "+promediomayor);
	}
}