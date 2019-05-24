package Tanda1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] edades=new int [10];
		int edad;
		double edadmedia=0;
		for(int i=0;i<edades.length;i++){
			System.out.println("Introduce la edad de una persona. ");
			edad=Consola.leeInt();
			while((edad<=0)||(edad>=120)){
				System.out.println("Vuelve a introducir la edad de la persona. ");
				edad=Consola.leeInt();
			}
			edades[i]=edad;
			edadmedia=edadmedia+edad;	
		}
		edadmedia=edadmedia/edades.length;
		int contmayor=0;
		int edadmax=0;
		int edadmin=9999;
		int contmin=1;
		for(int a=0;a<edades.length;a++){
			if(edadmedia < edades[a]){
				contmayor++;				
			}
			if(edadmax<edades[a]){
				edadmax=edades[a];
			}
			if(edadmin>=edades[a]){
				if(edadmin==edades[a]){
					contmin++;
				}else{
					contmin=0;
				}
				edadmin=edades[a];
			}
		}
		System.out.println("La edad media es de: "+edadmedia);
		System.out.println("Hay "+contmayor+" edades superiores a la media");
		System.out.println("La edad maxima es "+edadmax);
		System.out.println("La edad minima es "+edadmin+" y aparece "+contmin+" veces");
	}

}
