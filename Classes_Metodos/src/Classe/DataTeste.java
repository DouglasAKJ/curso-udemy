package Classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data = new Data();
		Data data2 = new Data(25, 07, 2024);
		
		System.out.println(data.formatarData());
		System.out.println(data2.formatarData());
	}
}
