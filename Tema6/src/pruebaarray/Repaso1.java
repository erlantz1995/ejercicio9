package pruebaarray;

public class Repaso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int n=10;
		int [] x=new int[n];
		int sum=0;
		for (int i=0;i<n;i++){
			if(i==0){
				System.out.println("Dame un numero para guardar: ");
				int j=Consola.leeInt();
				sum=sum+j;
				x[i]=j;
			}else{
				System.out.println("Dame otro numero para guardar: ");
				int j=Consola.leeInt();
				sum=sum+j;
				x[i]=j;
			}
		}
		System.out.println("La suma del array x es "+sum);
		for(int i=n-1;i>=0;i--){
			if(i!=0){
				System.out.print(x[i]+", ");
			}else{
				System.out.print(x[i]);
			}
		}
	}

}
