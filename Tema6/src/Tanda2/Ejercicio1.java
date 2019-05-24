package Tanda2;

public class Ejercicio1 {
	private static int[][] array1;
	public static void RellenarMatriz(int[][] array1){
		int num;
		for(int i=0;i<array1[0].length;i++){
			System.out.println("Asignatura"+i);
			for(int a=0;a<array1.length;a++){
				System.out.println("Introduce la nota del alumno: ");
				num=Consola.leeInt();
				while(num>10 && num<0){
					System.out.println("Vuelve a introducir la nota del alumno: ");
					num=Consola.leeInt();
				}
				array1[a][i]=num;
			}
		}
		for(int i=0;i<array1.length;i++){
			for(int a=0;a<array1[0].length;a++){
				System.out.print(array1[i][a]+"\t");
			}
			System.out.print("\n");
		}
	}
	public static int NotaMedia(int n){
		int cont=0;
		int sum=0;
		for(int i=0;i<array1[n].length;i++){
			sum=sum+array1[n][i];
			cont++;
		}
		return sum/cont;
	}
	public static void NotaMaxima(){
		int[] array2=new int[array1.length];
		for(int i=0;i<array1.length;i++){
			for(int a=0;a<array1[0].length;a++){
				if(array2[i]<array1[i][a]){
					array2[i]=array1[i][a];
				}
			}
		}
		for(int i=0;i<array2.length;i++){
			System.out.print("Nota maxima del alumno"+i+": "+array2[i]+"\t");
		}
	}
	public static void Notas(){
		int[][] notas=new int[array1.length][4];
		for(int i=0;i<array1.length;i++){
			for(int a=0;a<array1[i].length;a++){
				if(array1[i][a]<5){
					notas[i][0]++;
				}else{
					if(array1[i][a]<7){
						notas[i][1]++;
					}else{
						if(array1[i][a]<9){
							notas[i][2]++;
						}else{
							notas[i][3]++;
						}
					}
				}
			}
		}
		for (int i=0;i<notas.length;i++) {
			for (int a=0;a<notas[i].length;a++) {
				System.out.print(notas[i][a]+"\t");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cuantos alumnos hay? ");
		int n=Consola.leeInt();
		System.out.println("Cuantas asignaturas tienen? ");
		int m=Consola.leeInt();
		array1=new int[n][m];
		RellenarMatriz(array1);
		System.out.print("\n");
		System.out.println("La nota media del alumno es "+NotaMedia(1));
		System.out.print("\n");
		NotaMaxima();
		System.out.print("\n");
		Notas();
	}

}
