
public class J43 {

	public static void main(String[] args) {
		
		
		int[] a={10,20,30,40,50,60,70,80,90,100};
		int sd=70;
		int index=binarySearch(a, sd);
		if(index!=-1){
			System.out.println(sd+"의 위치는:  "+ index);
		}else{
			System.out.println("fail");
		}
		

	}

	public static int binarySearch(int[] a, int sd){
		int low=0;
		int high=a.length-1;
		int middle;
		int index=-1;
		while(low<=high){
			middle=(low+high)/2;
			if (sd==middle) {
				index=middle;
				break;
			}else if(sd>a[middle]){
				low=middle+1;
			}else{
				high=middle-1;
			}
			
		}			
		
		return index;
		
	}
	}
	

