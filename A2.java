package chintu;
public class A2 {
	public static void main(String[] args) {
     int[] num= {1,2,3,24,90,54,45,60,100};
     int max=num[0],min=num[0];
     for(int a=1;a<num.length;a++) {
    	 if(num[a]>max) {
    		 max=num[a];
    	 }
    	 if(num[a]<min) {
    		 min=num[a];
    	 }
     }
     System.out.println("max---->"+max);
     System.out.println("min---->"+min);
	}
}
