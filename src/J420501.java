
public class J420501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a={10,20,30,40,50,60,70,80,90,100};
		int sd=70;
		int low=0;
		int high=a.length-1;
		int middle=0;
		int index=-1;
		while(low<=high){
			middle=(low+high)/2;
			if(sd==a[middle]){
				index=middle;
				break;
			}else if(sd>a[middle]){
				low=middle+1;
			}else{
				high=middle-1;
			}
		}
				if(index!=-1){
					System.out.println(index);
				}else{
					System.out.println("½ÇÆÐ");
				}
		
	}

}
