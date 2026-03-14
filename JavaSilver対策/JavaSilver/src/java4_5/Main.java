package java4_5;

public class Main {

	public static void main(String[] args) {
		Sample.num = 10;
		Sample s = new Sample();
		Sample s2 = new Sample();
		s.num += 10;
		s2.num =30;//1つしかないstatic領域で１０→２０→３０と上書きされる。 
		System.out.println(Sample.num);
	}

}
