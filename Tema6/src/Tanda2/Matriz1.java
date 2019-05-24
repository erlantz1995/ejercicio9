package Tanda2;

public class Matriz1 {
	private int[][] array1;
	private int nf=10;
	private int nc=15;
	Matriz1(){
		array1=new int[nf][nc];
	}
	Matriz1(int a, int b){
		array1=new int[a][b];
	}
	public void cargarPorFilas(){
		int num=0;
		for(int i=0;i<array1.length;i++){
			for(int a=0;a<array1[0].length;a++){
				System.out.println("Introduce un numero: ");
				num=Consola.leeInt();
				array1[i][a]=num;
			}
		}
	}
	public void cargarPorColumnas(){
		int num=0;
		for(int i=array1[0].length;i>0;i--){
			for(int a=0;a<array1.length;a++){
				System.out.println("Introduce un numero: ");
				num=Consola.leeInt();
				array1[a][i]=num;
			}
		}
	}
	public void ver(){
		for(int i=0;i<array1.length;i++){
			for(int a=0; a<array1[0].length;a++){
				System.out.print(array1[i][a]+"\t");
			}
			System.out.print("\n");
		}
	}
	public void invertirFilas(){
		int inter=0;
		for(int i=0;i<array1.length;i++){
			for(int a=0, b=array1[i].length;a<=b;a++,b--){
				inter=array1[i][a];
				array1[i][a]=array1[i][b];
				array1[i][b]=inter;
			}
		}
	}
	public boolean intercambiarFilas(int n1, int n2){
		int inter=0;
		if(n1>array1.length || n1<=0 || n2>array1.length || n2<=0){
			return false;
		}else{
			for(int i=0;i<array1[0].length;i++){
				inter=array1[n1-1][i];
				array1[n1-1][i]=array1[n2-1][i];
				array1[n2-1][i]=inter;
			}
		}
		return true;
	}
	public boolean intercambiarColumnas(int n1, int n2){
		int inter=0;
		if(n1>array1[0].length || n1<=0 || n2>array1[0].length || n2<=0){
			return false;
		}else{
			for(int i=0;i<array1.length;i++){
				inter=array1[i][n1-1];
				array1[i][n1-1]=array1[i][n2-1];
				array1[i][n2-1]=inter;
			}
		}
		return true;
	}
	public int[] mayorFila() {
		double max=0;
		int[] aux=new int[array1[0].length];
		for(int i=0;i<array1.length;i++){
			int media=0;
			for(int a=0;a<array1[i].length;a++){
				media=media+array1[i][a];
			}
			if(media/array1[i].length>max){
				max=media;
				aux=array1[i];
			}
		}
		return aux;		
	}		
	public void negativos(){
		int[] aux = new int[array1.length*array1[0].length];
		int cont=0;
		for(int i=0;i<array1.length;i++){
			for (int a=0;a<array1[i].length;a++){
				if (array1[i][a]<0){
					aux[cont]=array1[i][a];
					cont++;
				}
			}
		}
		int[] neg= new int[cont];
		for (int i=0;i<cont;i++){
			neg[i]=aux[i];	
		}
		for(int i=0;i<neg.length;i++){
			System.out.print(neg[i]+" \t");
		}
		
	}
	public int getNc() {
		return nc;
	}
	public int[][] getArray1() {
		return array1;
	}
	
}
