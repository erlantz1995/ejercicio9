package Tanda1;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ARRAY 1
		float[] array1=new float[10];
		int num;
		System.out.println("Introduce un numero: ");
		num=Consola.leeInt();
		array1[0]=num;
		for(int i=1; i<array1.length; i++){
			System.out.println("Introduce otro numero superior al anterior: ");
			num=Consola.leeInt();
			while(num<array1[i-1]){
				System.out.println("Vuelve a introduce otro numero superior al anterior: ");
				num=Consola.leeInt();
			}
			array1[i]=num;
		}
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i]+"\t");
		}
		System.out.print("\n");
		//ARRAY 2
		float[] array2=new float[10];
		float num2;
		System.out.println("Introduce un numero: ");
		num2=Consola.leeFloat();
		array2[0]=num2;
		for(int i=1; i<array2.length; i++){
			System.out.println("Introduce otro numero superior al anterior: ");
			num2=Consola.leeFloat();
			while(num2<array2[i-1]){
				System.out.println("Vuelve a introduce otro numero superior al anterior: ");
				num2=Consola.leeFloat();
			}
			array2[i]=num2;
		}
		for(int i=0;i<array2.length;i++){
			System.out.print(array2[i]+"\t");
		}
		System.out.print("\n");
		//ARRAY 3
		float[] array3=new float[20];
		int contarray1=0;
		int contarray2=0;
		for(int i=0;i<array3.length;i++){
			if(contarray1==10){
				array3[i]=array2[contarray2];
				contarray2++;
			}else{
				if(contarray2==10){
					array3[i]=array1[contarray1];
					contarray1++;
				}else{
					if(array1[contarray1]<=array2[contarray2]){
						array3[i]=array1[contarray1];
						if(contarray1<10){
							contarray1++;
						}
					}else{
							array3[i]=array2[contarray2];
							if(contarray2<10){
								contarray2++;
							}
					}
				}
			}
			
		}
		//Mostrar
		for(int i=0;i<array3.length;i++){
			System.out.print(array3[i]+"\t");
		}
	}

}
