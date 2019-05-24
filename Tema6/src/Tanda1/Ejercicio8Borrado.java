package Tanda1;

public class Ejercicio8Borrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bor;
		int n=0;
		System.out.println("Cuantas veces quieres repetir el borrado");
		bor=Consola.leeInt();
		while(n<=bor){
			int[] array={1,2,3,4,5,6,7,8,9,10};
			int pos;
			System.out.println("Indica la posicion que quieres borrar: ");
			pos=Consola.leeInt();
			for(int i=0;i<array.length;i++){
				if(i>=pos){
					if(i==array.length-1){
						array[i]=0;
					}else{
						array[i]=array[i+1];
					}
				}
			}
			for(int a=0;a<array.length;a++){
				System.out.print(array[a]+"\t");
			}
			System.out.print("\n");
			n++;
		}
	}

}
