package day0109;

public class ArrInt_10 {

	public static void main(String[] args) {
		// 배열선언과 동시에 초기값 지정할수있다
		
		int [] arr= {2,4,6,9,10,35,76,44,45};
		
		System.out.println("갯수: "+arr.length);
		
		System.out.println("출력1_for");
		for(int i=0;i<arr.length;i++)
		{
			System.out.printf("%5d",arr[i]);
		}
		System.out.println();
		
		System.out.println("출력1_foreach");
		for(int a:arr)
		{
			System.out.printf("%5d",a);
		}
	}

}
