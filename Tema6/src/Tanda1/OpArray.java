package Tanda1;

public class OpArray {
	int[] array1;
	OpArray(int array2){
		array1=new int [array2];
	}
	public void cargarArray(){
		int num;
		int cont=0;
		System.out.println("Introduce un numero: ");
		num=Consola.leeInt();
		while(num !=0 && cont<=array1.length){
			array1[cont]=num;
			System.out.println("Introduce otro numero: ");
			num=Consola.leeInt();
			cont++;
		}
		array1[cont]=num;
	}
	public void ver(){
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i]+"\t");
		}
	}
	public void sustituir(int num){
		int cont=0;
		for(int i=0;i<array1.length;i++){
			if(array1[i]==num){
				System.out.println("Intrpduce el numero por el que lo quieres cambiar: ");
				array1[i]=Consola.leeInt();
				cont++;
			}
		}
		System.out.println("Se han realizado "+cont+" cambios");
	}
	public String toString(){
		String num="";
		for(int i=0;i<array1.length;i++){
			num=num+array1[i];
		}
		return num;
	}
	public int indicePrimo(){
		for(int i=0;i<array1.length;i++){
			if(Primo(array1[i])==true){
				return array1[i];
			}
		}
		return -1;
	}
	public boolean Primo(int num){
		boolean prim=false;
		int cont=0;
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				cont++;
			}else{
				prim=false;
				return prim;
			}
		}
		if(cont!=0){
			prim=true;
		}
		return prim;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpArray OA1=new OpArray(10);
		OpArray OA2=new OpArray(15);
		System.out.println("Caraga el primer array.");
		OA1.cargarArray();
		System.out.println("Caraga el segundo array.");
		OA2.cargarArray();
		System.out.println("Ver el primer array.");
		OA1.ver();
		System.out.println("Ver el segundo array.");
		OA2.ver();
		System.out.println("Sustituir el primer array.");
		OA1.sustituir(1);
		System.out.println("Sustituir el segundo array.");
		OA2.sustituir(5);
		System.out.println("Ver el primer array.");
		OA1.ver();
		System.out.println("Ver el Segundo array.");
		OA2.ver();
		System.out.println("Devuelve el numero del primer array.");
		System.out.println(OA1.toString());
		System.out.println("Devuelve el numero del segundo array.");
		System.out.println(OA2.toString());
		System.out.println("Numero primo del primer array.");
		System.out.println(OA1.indicePrimo());
		System.out.println("Numero primo del segundo array.");
		System.out.println(OA2.indicePrimo());
	}

}
