import java.util.Scanner;
class kotak{
	public int panjang;
	public int lebar;
	public int tinggi;
	
	public int volume(){
	return panjang*lebar*tinggi;
	}
	
	public static void main(String [] args){
	kotak Kotak = new kotak();
	
	Scanner in = new
	Scanner(System.in);
	System.out.println("masukan nilai panjang:");
	Kotak.panjang = in.nextInt();
	
	System.out.println("masukan nilai lebar:");
	Kotak.lebar = in.nextInt();
	
	System.out.println("masukan nilai tinggi:");
	Kotak.tinggi = in.nextInt();
	
	System.out.println(String.format("volume Kotak: %s",Kotak.volume()));
	}
	}
