package Tanda2;

public class Prueba_Matriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matriz1 m1=new Matriz1();
		m1.cargarPorFilas();
		m1.ver();
		m1.cargarPorColumnas();
		m1.ver();
		m1.intercambiarFilas(3, 4);
		m1.ver();
		m1.intercambiarColumnas(1, m1.getNc()/2);
		m1.ver();
		m1.negativos();
		m1.ver();
		Matriz1 m2=new Matriz1(2,5);
		Matriz1 m3=new Matriz1(3,4);
		Matriz1 m4=new Matriz1(4,3);
		Matriz1 m5=new Matriz1(5,2);
		Matriz1[] matrices={m2,m3,m4,m5};
		for(int i=0;i<matrices.length;i++){
			matrices[i].cargarPorFilas();
			System.out.println("\n");
		}
		for(int i=0;i< matrices.length; i++){
			System.out.println("Array"+(i+1));
			matrices[i].ver();
		}
		System.out.println("\n");
		for (int i=0;i<matrices.length;i++){
			if(matrices[i].getArray1()[0].length>=5){
				matrices[i].invertirFilas();
				System.out.println("Array"+(i+1));
				matrices[i].ver();
			}
		}				
	}

}
