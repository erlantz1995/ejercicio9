package pruebaarray;

public class Respaso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] x={"5","4","2","45","-6","3","9","5","6"};
		String aux="";
		System.out.println("Array sin combios: ");
		for(int b=0;b<=x.length-1;b++){
			System.out.print(x[b]+"\t");
		}
		System.out.println();
		for(int i=1;i<=x.length-2;i=i+2){
			aux=x[i];
			x[i]=x[i-1];
			x[i-1]=aux;
		}
		System.out.println("Array despues de los cambios: ");
		for(int a=0;a<=x.length-2;a++){
			System.out.print(x[a]+"\t");
		}
	}

}
