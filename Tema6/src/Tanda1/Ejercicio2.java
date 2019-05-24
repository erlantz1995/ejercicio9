package Tanda1;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		Integer[] inverso=new Integer[1];
		int num;
		System.out.println("Dame un numero: ");
		num=Consola.leeInt();
		while(num!=0){
			inverso[inverso.length-1]=num;
			Integer[] guardar=new Integer[inverso.length];
			for(int a=0;a<inverso.length;a++){
				guardar[a]=inverso[a];
			}
			System.out.println("Dame otro numero: ");
			num=Consola.leeInt();
			if(num!=0){
				inverso= new Integer[inverso.length+1];
				for(int z=0;z<guardar.length;z++){
					inverso[z]=guardar[z];
				}
			}
		}
		
		for(int i=0;i<inverso.length;i++){
			System.out.print(inverso[i]+"\t");
		}
		Integer[] copia=new Integer[inverso.length];
		for(int b=0;b<copia.length;b++){
			copia[b]=inverso[inverso.length-b-1];
		}
		System.out.println("\n");
		for(int c=0;c<copia.length;c++){
			System.out.print(copia[c]+"\t");
		}
		
	}
}
