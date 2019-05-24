package pruebaarray;

public class Repaso7 {
	
	private static long[] x;
	public static long[] numPerfectos(int n){
		int cont=0;
		long y=1;
		
		long[] x=new long[n];
		while(cont<x.length){
			long suma=0;
			for(long i=1;i<y/2;i++){
				suma=suma+i;
			}
			if(suma==y){
				x[cont]=y;
				cont++;
			}
			y++;
		}
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cuantos numeros quieres buscar? ");
		int n=Consola.leeInt();
		x=numPerfectos(n);
		for(int z=0;z<x.length;z++){
			System.out.println(x[z]);
		}
	}

}
