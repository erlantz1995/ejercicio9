package Tanda1;

public class Ejercicio7 {
	public static int[] cargarDatos(int[] tama){
		int[] array=new int[tama.length];
		int num;
		System.out.println("Introduce un numero: ");
		num=Consola.leeInt();
		array[0]=num;
		for(int i=1; i<array.length; i++){
			System.out.println("Introduce otro numero superior al anterior: ");
			num=Consola.leeInt();
			while(num<array[i-1]){
				System.out.println("Vuelve a introduce otro numero superior al anterior: ");
				num=Consola.leeInt();
			}
			array[i]=num;
		}
		return array;
	}
	public static void Ordenado(int[] a1, int[] a2){
		int[] array3=new int[a1.length+a2.length];
		int contarray1=0;
		int contarray2=0;
		for(int i=0;i<array3.length;i++){
			if(contarray1==10){
				array3[i]=a2[contarray2];
				contarray2++;
			}else{
				if(contarray2==10){
					array3[i]=a1[contarray1];
					contarray1++;
				}else{
					if(a1[contarray1]<=a2[contarray2]){
						array3[i]=a1[contarray1];
						if(contarray1<10){
							contarray1++;
						}
					}else{
							array3[i]=a2[contarray2];
							if(contarray2<10){
								contarray2++;
							}
					}
				}
			}
			
		}
		ver(array3);
	}
	public static void ver(int[] v){
		for(int i=0;i<v.length;i++){
			System.out.print(v[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1=new int[10];
		int[] array2=new int[20];
		array1=cargarDatos(array1);
		ver(array1);
		System.out.print("\n");
		array2=cargarDatos(array2);
		ver(array2);
		System.out.print("\n");
		Ordenado(array1,array2);
	}

}
