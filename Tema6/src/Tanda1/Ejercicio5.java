package Tanda1;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] elemento=new float[10];
		float num;
		System.out.println("Introduce un numero: ");
		num=Consola.leeFloat();
		elemento[0]=num;
		for(int i=1; i<elemento.length; i++){
			System.out.println("Introduce otro numero inferior al anterior: ");
			num=Consola.leeFloat();
			while(num>elemento[i-1]){
				System.out.println("Vuelve a introduce otro numero inferior al anterior: ");
				num=Consola.leeFloat();
			}
			elemento[i]=num;
		}
		for(int a=0; a<elemento.length;a++){
			System.out.print(elemento[a]+"\t");
		}
	}

}
